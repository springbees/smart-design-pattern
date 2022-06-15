package com.smartfrank.pattern.pipeline.processor;

import com.smartfrank.pattern.pipeline.context.InstanceBuildContext;
import com.smartfrank.pattern.pipeline.handler.ContextHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Description: 保存模型实例到相关DB表处理器
 * <br/>
 * ModelInstanceSaverProcessor
 *
 * @author laiql
 * @date 2022/6/14 10:20 下午
 */
@Component
public class ModelInstanceSaverProcessor implements ContextHandler<InstanceBuildContext> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("--保存模型实例到相关DB表--");

        // 假装保存模型实例

        return true;
    }
}
