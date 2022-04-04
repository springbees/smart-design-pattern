package com.smartfrank.pattern.demo;

/**
 * Description: 煮红烧肉
 * <br/>
 * ConcreteClassB
 *
 * @author laiql
 * @date 2021/11/5 9:49
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void processServiceA() {
        System.out.println("ConcreteClassB.processServiceA - [起锅]");
    }

    @Override
    public void processServiceB() {
        System.out.println("ConcreteClassB.processServiceB - [倒油]");
    }

    @Override
    public void processServiceC() {
        System.out.println("ConcreteClassB.processServiceC - [煮红烧肉]");
    }

    @Override
    public void processServiceD() {
        System.out.println("ConcreteClassB.processServiceD - [出锅-红烧肉]");
    }
}
