package com.smartfrank.pattern.example;

/**
 * Description: 审批接口定义
 * <br/>
 * Ratify
 *
 * @author laiql
 * @date 2021/11/2 10:48
 */
public interface Ratify {
    /**
     * 处理请求
     *
     * @param chain
     * @return
     */
    public AuthResult deal(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        /**
         * 获取当前request请求
         *
         * @return
         */
        Request request();

        /**
         * 转发request请求
         *
         * @param request
         * @return
         */
        AuthResult proceed(Request request);
    }

}
