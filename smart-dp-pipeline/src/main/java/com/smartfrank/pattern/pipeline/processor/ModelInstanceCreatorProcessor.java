package com.smartfrank.pattern.pipeline.processor;

import com.smartfrank.pattern.pipeline.context.InstanceBuildContext;
import com.smartfrank.pattern.pipeline.handler.ContextHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Description: 根据输入创建模型实例处理器
 * <br/>
 * ModelInstanceCreatorProcessor
 *
 * @author laiql
 * @date 2022/6/14 10:18 下午
 */
@Component
public class ModelInstanceCreatorProcessor implements ContextHandler<InstanceBuildContext> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("--根据输入数据创建模型实例--");

        // 假装创建模型实例
        return true;
    }
}
