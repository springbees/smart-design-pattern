package com.smartfrank.pattern.pipeline.handler;

import com.smartfrank.pattern.pipeline.context.PipelineContext;

/**
 * Description: 管道中的上下文处理器接口
 * <br/>
 * ContextHandler
 *
 * @author laiql
 * @date 2022/6/14 10:09 下午
 */
public interface ContextHandler<T extends PipelineContext> {

    /**
     * 处理上下文数据
     *
     * @param context 处理上下文数据
     * @return 返回true，则表示有下一个Handler继续处理，返回false表示处理结束
     */
    boolean handle(T context);
}
