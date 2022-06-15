package com.smartfrank.pattern.pipeline.processor;

import com.smartfrank.pattern.pipeline.context.InstanceBuildContext;
import com.smartfrank.pattern.pipeline.handler.ContextHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Description: 定制业务处理器
 * <br/>
 * CustomizedBusinessProcessor
 *
 * @author laiql
 * @date 2022/6/15 10:48 上午
 */
@Component
public class CustomizedBusinessProcessor implements ContextHandler<InstanceBuildContext> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("*****切入定制业务处******");
        return true;
    }
}
