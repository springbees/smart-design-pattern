package com.smartfrank.pattern.demo;

/**
 * Description: 抽象状态类
 * <br/>
 * State
 *
 * @author laiql
 * @date 2021/11/9 7:27 下午
 */
public abstract class State {

    /**
     * 抽象处理状态
     */
    public abstract void handlerState(Context context);
}
