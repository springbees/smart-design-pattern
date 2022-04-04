package com.smartfrank.pattern.example;

/**
 * Description: 抽象状态接口
 * <br/>
 * State
 *
 * @author laiql
 * @date 2021/11/9 8:40 下午
 */
public interface State {
    /**
     * 活动提审
     */
    Result activityReview(Context context);
    /**
     * 审核通过
     */
    Result examinationPassed(Context context);
    /**
     * 审核拒绝
     */
    Result reviewRejected(Context context);
    /**
     * 撤审撤销
     */
    Result withdrawalOfTrial(Context context);
    /**
     * 活动关闭
     */
    Result activityClosed(Context context);
    /**
     * 活动开启
     */
    Result activityOn(Context context);
    /**
     * 活动执行
     */
    Result activityExecution(Context context);
}
