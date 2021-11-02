package com.smartfrank.pattern.example;

import com.smartfrank.pattern.example.handler.Activity618AuthHandler;
import com.smartfrank.pattern.example.handler.DailyAuthHandler;
import com.smartfrank.pattern.example.handler.PromotionAuthHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 责任链模模式工具类
 * <br/>
 * ChainOfResponsibilityClient
 *
 * @author laiql
 * @date 2021/11/2 11:39
 */
public class ChainOfResponsibilityClient {
    private ArrayList<Ratify> ratifies;

    public ChainOfResponsibilityClient() {
        ratifies = new ArrayList<>();
    }

    /**
     * 为了展示“责任链模式”的真正的迷人之处（可扩展性），在这里构造该方法以便添加自定义的“责任人”
     *
     * @param ratify
     */
    public void addRatifyList(Ratify ratify) {
        this.ratifies.add(ratify);
    }

    public AuthResult execute(Request request) {
        List<Ratify> ratifies = new ArrayList<>();
        ratifies.addAll(this.ratifies);
        ratifies.add(new DailyAuthHandler());
        ratifies.add(new PromotionAuthHandler());
        ratifies.add(new Activity618AuthHandler());

        //真正构造责任链执行的地方
        RealChain realChain = new RealChain(request, ratifies, 0);
        return realChain.proceed(request);
    }

}
