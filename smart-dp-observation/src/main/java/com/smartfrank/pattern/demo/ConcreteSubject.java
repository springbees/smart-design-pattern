package com.smartfrank.pattern.demo;

/**
 * Description:  具体主题对象
 * <br/>
 * ConcreteSubject
 *
 * @author laiql
 * @date 2021/11/3 10:05
 */
public class ConcreteSubject extends Subject {

    /**
     * 调用通知所有注册过的观察者对象
     */
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        for (Observer observer : observers) {
            //调用通知所有注册过的观察者对象执行业务
            observer.execute();
        }
    }
}
