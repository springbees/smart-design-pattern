package com.smartfrank.pattern.demo;

/**
 * Description: 策略控制上下文
 * <br/>
 * StrategyContext
 *
 * @author laiql
 * @date 2021/11/4 9:19 下午
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行业务
     */
    public void strategyMethod() {
        strategy.bizService();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
