package com.smartfrank.pattern.demo;

/**
 * Description: 环境上下文类
 * <br/>
 * Context
 *
 * @author laiql
 * @date 2021/11/9 7:27 下午
 */
public class Context {

    private State state;

    /**
     * 初始化具体状态对象
     */
    public Context(State state) {
        this.state = state;
    }

    /**
     * 获取状态
     */
    public State getState() {
        return state;
    }

    /**
     * 设置状态
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 执行处理状态
     */
    public void executeState(){
        this.state.handlerState(this);
    }
}
