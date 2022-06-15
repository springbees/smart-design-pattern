package com.smartfrank.pattern.pipeline.handler;

import cn.hutool.json.JSON;
import com.smartfrank.pattern.pipeline.context.PipelineContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Description: 记录管道执行结束时间
 * <br/>
 * RecordEndTimeHandler
 *
 * @author laiql
 * @date 2022/6/15 10:55 上午
 */
@Component
public class RecordEndTimeHandler implements ContextHandler<PipelineContext> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(PipelineContext context) {
        logger.info("####管道结束执行####");

        // 设置结束时间
        context.setEndTime(LocalDateTime.now());
        return true;
    }
}
