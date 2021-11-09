package com.smartfrank.pattern.demo;

/**
 * Description: 业务状态A
 * <br/>
 * ConcreteStateA
 *
 * @author laiql
 * @date 2021/11/9 7:41 下午
 */
public class ConcreteStateA extends State {
    @Override
    public void handlerState(Context context) {
        System.out.println("ConcreteStateA.handlerState - 当前状态是A");
        context.setState(new ConcreteStateA());
    }
}
