package com.smartfrank.pattern.pipeline.test;

import com.smartfrank.pattern.pipeline.context.InstanceBuildContext;
import com.smartfrank.pattern.pipeline.executor.PipelineExecutor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collections;

/**
 * Description: 管道测试用例
 * <br/>
 * PipelineApplicationTest
 *
 * @author laiql
 * @date 2022/6/15 10:30 上午
 */
public class PipelineApplicationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.smartfrank.pattern.pipeline");
        PipelineExecutor pipelineExecutor = context.getBean(PipelineExecutor.class);
        InstanceBuildContext instanceBuildContext = new InstanceBuildContext();
        instanceBuildContext.setFormInput(Collections.singletonMap("instanceName", "zhansan"));
        instanceBuildContext.setInstanceId(10001L);
        instanceBuildContext.setUserId(100000000L);
        pipelineExecutor.acceptSync(instanceBuildContext);

    }
}
