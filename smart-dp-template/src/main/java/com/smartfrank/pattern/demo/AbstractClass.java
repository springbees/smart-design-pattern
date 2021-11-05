package com.smartfrank.pattern.demo;

/**
 * Description: 抽象模板类
 * <br/>
 * AbstractClass
 *
 * @author laiql
 * @date 2021/11/5 9:43
 */
public abstract class AbstractClass {

    /**
     * 模板流程编排执行
     */
    protected void execute() {
        this.processServiceA();
        this.processServiceB();
        this.processServiceC();
        this.processServiceD();
    }

    /**
     * 流程A
     */
    public abstract void processServiceA();

    /**
     * 流程B
     */
    public abstract void processServiceB();

    /**
     * 流程C
     */
    public abstract void processServiceC();

    /**
     * 流程D
     */
    public abstract void processServiceD();

}
