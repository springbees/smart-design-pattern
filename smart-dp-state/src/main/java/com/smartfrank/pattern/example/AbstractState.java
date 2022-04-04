package com.smartfrank.pattern.example;

/**
 * Description: 抽象状态类
 * <br/>
 * AbstractState
 *
 * @author laiql
 * @date 2021/11/9 8:59 下午
 */
public abstract class AbstractState implements State {
    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");
    @Override
    public Result activityReview(Context context) {
        throw EXCEPTION;
    }

    @Override
    public Result examinationPassed(Context context) {
        throw EXCEPTION;
    }

    @Override
    public Result reviewRejected(Context context) {
        throw EXCEPTION;
    }

    @Override
    public Result withdrawalOfTrial(Context context) {
        throw EXCEPTION;
    }

    @Override
    public Result activityClosed(Context context) {
        throw EXCEPTION;
    }

    @Override
    public Result activityOn(Context context) {
        throw EXCEPTION;
    }

    @Override
    public Result activityExecution(Context context) {
        throw EXCEPTION;
    }
}
