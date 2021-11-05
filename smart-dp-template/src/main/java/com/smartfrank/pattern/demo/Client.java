package com.smartfrank.pattern.demo;

/**
 * Description: 客户端调用
 * <br/>
 * Client
 *
 * @author laiql
 * @date 2021/11/5 9:58
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        concreteClassA.execute();
        System.out.println("---------------------");
        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassB.execute();
    }
}
