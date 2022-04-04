package com.smartfrank.pattern.demo;

/**
 * Description: 业务状态B
 * <br/>
 * ConcreteStateB
 *
 * @author laiql
 * @date 2021/11/9 7:43 下午
 */
public class ConcreteStateB extends State {
    @Override
    public void handlerState(Context context) {
        System.out.println("ConcreteStateB.handlerState - 当前状态是B");
        context.setState(new ConcreteStateB());
    }
}
