package com.smartfrank.pattern.demo;

/**
 * Description: 炒酸辣大白菜
 * <br/>
 * ConcreteClassA
 *
 * @author laiql
 * @date 2021/11/5 9:49
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    public void processServiceA() {
        System.out.println("ConcreteClassA.processServiceA - [起锅]");
    }

    @Override
    public void processServiceB() {
        System.out.println("ConcreteClassA.processServiceB - [倒油]");
    }

    @Override
    public void processServiceC() {
        System.out.println("ConcreteClassA.processServiceC - [炒土豆丝]");
    }

    @Override
    public void processServiceD() {
        System.out.println("ConcreteClassA.processServiceD - [出锅-酸辣土豆丝]");
    }

}
