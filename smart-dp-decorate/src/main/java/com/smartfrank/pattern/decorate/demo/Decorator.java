package com.smartfrank.pattern.decorate.demo;

/**
 * Description: 装饰对象的抽象类，持有一个具体的被修饰对象，并实现接口类继承的公共接口
 * <br/>
 * Decorator
 *
 * @author laiql
 * @date 2021/10/25 10:07
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
