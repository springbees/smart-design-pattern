package com.smartfrank.pattern.demo;

/**
 * Description: 客户端测试
 * <br/>
 * StateClient
 *
 * @author laiql
 * @date 2021/11/9 8:29 下午
 */
public class StateClient {

    public static void main(String[] args) {
        //设置开始状态
        Context context = new Context(new ConcreteStateA());
        //执行A状态
        context.executeState();

        //流转新的状态
        context.setState(new ConcreteStateB());
        //执行B状态
        context.executeState();
    }
}
