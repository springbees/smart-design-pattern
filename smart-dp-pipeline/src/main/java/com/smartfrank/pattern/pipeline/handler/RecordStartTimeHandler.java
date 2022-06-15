package com.smartfrank.pattern.pipeline.handler;

import com.smartfrank.pattern.pipeline.context.PipelineContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Description: 记录管道执行开始时间
 * <br/>
 * RecordStartTimeHandler
 *
 * @author laiql
 * @date 2022/6/15 10:54 上午
 */
@Component
public class RecordStartTimeHandler implements ContextHandler<PipelineContext> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(PipelineContext context) {
        logger.info("####管道开始执行####");

        // 设置开始时间
        context.setStartTime(LocalDateTime.now());
        return true;
    }
}
