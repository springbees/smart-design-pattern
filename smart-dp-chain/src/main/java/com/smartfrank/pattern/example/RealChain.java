package com.smartfrank.pattern.example;

import java.util.List;

/**
 * Description: 实现Chain的真正的包装Request和转发功能
 * <br/>
 * RealChain
 *
 * @author laiql
 * @date 2021/11/2 10:51
 */
public class RealChain implements Ratify.Chain {

    /**
     * 具体的请求Request实例
     */
    public Request request;
    /**
     * Ratify接口的实现类集合
     */
    public List<Ratify> ratifyList;
    /**
     * 已经处理过该request的责任人数量
     */
    private Integer index;

    public RealChain(Request request, List<Ratify> ratifyList, Integer index) {
        this.request = request;
        this.ratifyList = ratifyList;
        this.index = index;
    }

    /**
     * 返回当前Request对象或者返回当前进行包装后的Request对象
     *
     * @return
     */
    @Override
    public Request request() {
        return request;
    }


    /**
     * 具体转发功能
     *
     * @param request
     * @return
     */
    @Override
    public AuthResult proceed(Request request) {
        AuthResult proceed = null;
        if (this.ratifyList.size() > this.index) {
            RealChain realChain = new RealChain(this.request, this.ratifyList, this.index + 1);
            Ratify ratify = this.ratifyList.get(this.index);
            proceed = ratify.deal(realChain);
        }
        return proceed;
    }
}
