package com.smartfrank.pattern.pipeline.processor;

import com.smartfrank.pattern.pipeline.context.InstanceBuildContext;
import com.smartfrank.pattern.pipeline.handler.ContextHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * Description: 输入参数校验处理器
 * <br/>
 * InputDataPreCheckerProcessor
 *
 * @author laiql
 * @date 2022/6/14 10:15 下午
 */
@Component
public class InputDataPreCheckerProcessor implements ContextHandler<InstanceBuildContext> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean handle(InstanceBuildContext context) {
        logger.info("--输入数据校验--");

        Map<String, Object> formInput = context.getFormInput();

        if (CollectionUtils.isEmpty(formInput)) {
            context.setErrorMsg("表单输入数据不能为空");
            return false;
        }

        String instanceName = (String) formInput.get("instanceName");

        if (!StringUtils.hasText(instanceName)) {
            context.setErrorMsg("表单输入数据必须包含实例名称");
            return false;
        }

        return true;
    }
}
