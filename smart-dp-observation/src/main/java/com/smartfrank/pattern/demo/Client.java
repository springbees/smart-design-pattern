package com.smartfrank.pattern.demo;

/**
 * Description: 客户端类
 * <br/>
 * Client
 *
 * @author laiql
 * @date 2021/11/3 10:04
 */
public class Client {

    public static void main(String[] args) {
        //创建一个主题
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        //将观察者加入观察者容器
        concreteSubject.addObserver(observer);
        //开始活动
        concreteSubject.notifyObserver();
    }
}
