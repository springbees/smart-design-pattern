package com.smartfrank.pattern.demo;

/**
 * Description: A业务
 * <br/>
 * BizServiceAStrategy
 *
 * @author laiql
 * @date 2021/11/4 9:16 下午
 */
public class BizServiceAStrategy implements Strategy{
    @Override
    public void execute() {
        System.out.println("====执行Biz A业务=====");
    }
}
