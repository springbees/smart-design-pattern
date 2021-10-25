package com.smartfrank.pattern.decorate.example;

/**
 * Description: 装饰对象的抽象类，持有一个具体的被修饰的对象，并实现接口类的公共类
 * <br/>
 * AbstractDecorator
 *
 * @author laiql
 * @date 2021/10/25 10:41
 */
public abstract class AbstractDecorator implements Car {

    protected Car car;

    public AbstractDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void build() {
        car.build();
    }
}