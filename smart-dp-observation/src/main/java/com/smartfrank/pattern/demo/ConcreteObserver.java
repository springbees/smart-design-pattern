package com.smartfrank.pattern.demo;

/**
 * Description: 具体观察者
 * <br/>
 * ConcreteObserver
 *
 * @author laiql
 * @date 2021/11/3 10:03
 */
public class ConcreteObserver implements Observer {

    @Override
    public void execute() {
        System.out.println("收到消息，开始处理业务");
    }
}
