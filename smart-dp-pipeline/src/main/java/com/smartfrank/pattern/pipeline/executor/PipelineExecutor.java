package com.smartfrank.pattern.pipeline.executor;

import com.smartfrank.pattern.pipeline.context.PipelineContext;
import com.smartfrank.pattern.pipeline.handler.ContextHandler;
import com.smartfrank.pattern.pipeline.handler.RecordEndTimeHandler;
import com.smartfrank.pattern.pipeline.handler.RecordStartTimeHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Description: 管道执行器
 * <br/>
 * PipelineExecutor
 *
 * @author laiql
 * @date 2022/6/15 10:06 上午
 */
@Component
public class PipelineExecutor {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private RecordStartTimeHandler recordStartTimeHandler;
    @Resource
    private RecordEndTimeHandler recordEndTimeHandler;
    @Resource
    private Map<Class<? extends PipelineContext>,
            List<? extends ContextHandler<? super PipelineContext>>> pipelineRouteMap;

    /**
     * 同步处理输入的上下文数据<br/>
     * 如果处理时上下文数据流通到最后一个处理器且最后一个处理器返回 true，则返回 true，否则返回 false
     *
     * @param context 输入的上下文数据
     * @return 处理过程中管道是否畅通，畅通返回 true，不畅通返回 false
     */
    public boolean acceptSync(PipelineContext context) {
        //前置
        recordStartTimeHandler.handle(context);

        Objects.requireNonNull(context, "上下文数据不能为 null");
        //拿到数据类型
        Class<? extends PipelineContext> dataType = context.getClass();
        //获取数据处理的管道
        List<? extends ContextHandler<? super PipelineContext>> contextHandlers = pipelineRouteMap.get(dataType);
        if (CollectionUtils.isEmpty(contextHandlers)) {
            logger.error("{}的管道为空", dataType.getSimpleName());
            return false;
        }

        // 管道是否畅通
        boolean lastSuccess = true;
        for (ContextHandler<? super PipelineContext> contextHandler : contextHandlers) {
            try {
                lastSuccess = contextHandler.handle(context);
            } catch (Exception ex) {
                lastSuccess = false;
                logger.error("[{}] 处理异常，handler={}", context.getPipelineName(), contextHandler.getClass().getSimpleName(), ex);
            }
            // 不再向下处理
            if (!lastSuccess) {
                break;
            }
        }
        //后置
        recordEndTimeHandler.handle(context);
        return lastSuccess;
    }

    /**
     * 异步处理输入的上下文数据<br/>
     * 如果处理时上下文数据流通到最后一个处理器且最后一个处理器返回 true，则返回 true，否则返回 false
     *
     * @param context 输入的上下文数据
     * @return 处理过程中管道是否畅通，畅通返回 true，不畅通返回 false
     */
    public boolean acceptAsync(PipelineContext context) {
        return true;
    }
}
