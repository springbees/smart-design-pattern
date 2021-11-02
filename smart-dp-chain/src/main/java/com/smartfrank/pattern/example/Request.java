package com.smartfrank.pattern.example;

/**
 * Description: 构建请求对象
 * <br/>
 * Request
 *
 * @author laiql
 * @date 2021/11/2 10:23
 */
public class Request {
    /**
     * 活动id
     */
    private String activityId;
    /**
     * 活动名
     */
    private String activityName;
    /**
     * 活动开始时间
     */
    private Integer activityTime;
    /**
     * 一级审批
     */
    private String levelOne;
    /**
     * 二级审批
     */
    private String levelTwo;
    /**
     * 三级审批
     */
    private String levelThree;

    public Request(Builder builder) {
        super();
        this.activityId = builder.activityId;
        this.activityName = builder.activityName;
        this.activityTime = builder.activityTime;
        this.levelOne = builder.levelOne;
        this.levelTwo = builder.levelTwo;
        this.levelThree = builder.levelThree;
    }

    /**
     * 使用建造者模式
     */
    public static class Builder {
        public String activityId;
        public String activityName;
        public Integer activityTime;
        public String levelOne;
        public String levelTwo;
        public String levelThree;

        public Builder() {
        }

        public Builder setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public Builder setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }

        public Builder setactivityTime(Integer activityTime) {
            this.activityTime = activityTime;
            return this;
        }

        public Builder setLevelOne(String levelOne) {
            this.levelOne = levelOne;
            return this;
        }

        public Builder setLevelTwo(String levelTwo) {
            this.levelTwo = levelTwo;
            return this;
        }

        public Builder setLevelThree(String levelThree) {
            this.levelThree = levelThree;
            return this;
        }

        public Builder newRequest(Request request) {
            this.activityId = request.activityId;
            this.activityName = request.activityName;
            this.activityTime = request.activityTime;
            //可以增加参数判断
            this.levelOne = request.levelOne;
            this.levelTwo = request.levelTwo;
            this.levelThree = request.levelThree;
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }

    public String activityId() {
        return activityId;
    }

    public String activityName() {
        return activityName;
    }

    public Integer activityTime() {
        return activityTime;
    }

    public String levelOne() {
        return levelOne;
    }

    public String levelTwo() {
        return levelTwo;
    }

    public String levelThree() {
        return levelThree;
    }

    @Override
    public String toString() {
        return "Request{" +
                "activityId='" + activityId + '\'' +
                ", activityName='" + activityName + '\'' +
                ", activityTime=" + activityTime +
                ", levelOne='" + levelOne + '\'' +
                ", levelTwo='" + levelTwo + '\'' +
                ", levelThree='" + levelThree + '\'' +
                '}';
    }
}
