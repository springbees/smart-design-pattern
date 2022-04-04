package com.smartfrank.pattern.demo;

/**
 * Description: B业务
 * <br/>
 * BizServiceBStrategy
 *
 * @author laiql
 * @date 2021/11/4 9:16 下午
 */
public class BizServiceBStrategy implements Strategy{
    @Override
    public void execute() {
        System.out.println("====执行Biz B业务=====");
    }
}
