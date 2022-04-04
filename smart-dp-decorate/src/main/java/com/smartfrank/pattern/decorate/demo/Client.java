package com.smartfrank.pattern.decorate.demo;

/**
 * Description: 操作客户端
 * <br/>
 * Client
 *
 * @author laiql
 * @date 2021/10/25 10:13
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operate();

        System.out.println("===================");
        //对原有对象包装
        Component concreteDecorator = new ConcreteDecorator(component);
        concreteDecorator.operate();
    }
}
