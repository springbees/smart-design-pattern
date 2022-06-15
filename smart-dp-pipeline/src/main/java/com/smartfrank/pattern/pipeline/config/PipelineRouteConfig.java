package com.smartfrank.pattern.pipeline.config;

import com.smartfrank.pattern.pipeline.context.InstanceBuildContext;
import com.smartfrank.pattern.pipeline.context.PipelineContext;
import com.smartfrank.pattern.pipeline.handler.ContextHandler;
import com.smartfrank.pattern.pipeline.processor.CustomizedBusinessProcessor;
import com.smartfrank.pattern.pipeline.processor.InputDataPreCheckerProcessor;
import com.smartfrank.pattern.pipeline.processor.ModelInstanceCreatorProcessor;
import com.smartfrank.pattern.pipeline.processor.ModelInstanceSaverProcessor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description: 管道的路由配置
 * <br/>
 * PipelineRouteConfig
 *
 * @author laiql
 * @date 2022/6/14 10:23 下午
 */
@Configuration
public class PipelineRouteConfig implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    /**
     * 数据类型->管道中处理器类型列表 的路由
     */
    private static final Map<Class<? extends PipelineContext>,
            List<Class<? extends ContextHandler<? extends PipelineContext>>>> PIPELINE_ROUTE_MAP = new HashMap<>(4);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    private void initPipelineRouteConfig() {
        PIPELINE_ROUTE_MAP.put(InstanceBuildContext.class,
                Arrays.asList(
                        InputDataPreCheckerProcessor.class,
                        CustomizedBusinessProcessor.class,
                        ModelInstanceCreatorProcessor.class,
                        ModelInstanceSaverProcessor.class
                ));
    }

    /**
     * 在 Spring 启动时，根据路由表生成对应的管道映射关系
     */
    @Bean
    public Map<Class<? extends PipelineContext>, List<? extends ContextHandler<? extends PipelineContext>>> pipelineRouteMap() {
        return PIPELINE_ROUTE_MAP.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, this::toPipeline));
    }

    /**
     * 根据给定的管道中 ContextHandler 的类型的列表，构建管道
     */
    private List<? extends ContextHandler<? extends PipelineContext>> toPipeline(
            Map.Entry<Class<? extends PipelineContext>, List<Class<? extends ContextHandler<? extends PipelineContext>>>> entry) {
        return entry.getValue()
                .stream()
                .map(applicationContext::getBean)
                .collect(Collectors.toList());
    }
}
