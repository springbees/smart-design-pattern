package com.smartfrank.pattern.example;

/**
 * Description: 环境上下文
 * <br/>
 * Context
 *
 * @author laiql
 * @date 2021/11/9 8:40 下午
 */
public class Context extends AbstractState {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    /**
     * 获取当前状态
     *
     * @return
     */
    public State getState() {
        return state;
    }

    /**
     * 设置流转状态
     *
     * @param state 下一个状态
     */
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public Result activityReview(Context context) {
        return context.activityReview(context);
    }

    @Override
    public Result examinationPassed(Context context) {
        return context.examinationPassed(context);
    }

    @Override
    public Result reviewRejected(Context context) {
        return context.reviewRejected(context);
    }

    @Override
    public Result withdrawalOfTrial(Context context) {
        return context.withdrawalOfTrial(context);
    }

    @Override
    public Result activityClosed(Context context) {
        return context.activityClosed(context);
    }

    @Override
    public Result activityOn(Context context) {
        return context.activityOn(context);
    }

    @Override
    public Result activityExecution(Context context) {
        return context.activityExecution(context);
    }
}
