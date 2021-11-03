package com.smartfrank.pattern.demo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Description: 抽象主题类
 * <br/>
 * Subject
 *
 * @author laiql
 * @date 2021/11/3 9:58
 */
public abstract class Subject {

    /**
     * 观察者容器
     */
    protected List<Observer> observers = new CopyOnWriteArrayList<>();

    /**
     * 向观察者容器增加
     *
     * @param observer 观察者对象
     */
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * 删除容器中的观察者类
     *
     * @param observer 观察者对象
     */
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public abstract void notifyObserver();


}
