package com.smartfrank.pattern.pipeline.context;

import java.time.LocalDateTime;

/**
 * Description: 管道上下文
 * <br/>
 * PipelineContext
 *
 * @author laiql
 * @date 2022/6/14 10:06 下午
 */
public class PipelineContext {

    /**
     * 处理开始时间
     */
    private LocalDateTime startTime;

    /**
     * 处理结束时间
     */
    private LocalDateTime endTime;

    /**
     * 获取数据名称
     * @return String
     */
    public String getPipelineName(){
        return this.getClass().getSimpleName();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
