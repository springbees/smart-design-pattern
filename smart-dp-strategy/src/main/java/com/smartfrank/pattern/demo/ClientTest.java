package com.smartfrank.pattern.demo;

/**
 * Description: 测试客户端
 * <br/>
 * ClientTest
 *
 * @author laiql
 * @date 2021/11/4 9:21 下午
 */
public class ClientTest {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new BizServiceAStrategy());
        context.strategyMethod();

        context.setStrategy(new BizServiceBStrategy());
        context.strategyMethod();
    }
}
