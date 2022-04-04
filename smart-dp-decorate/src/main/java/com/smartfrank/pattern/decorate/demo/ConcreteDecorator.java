package com.smartfrank.pattern.decorate.demo;

/**
 * Description: 具体的装饰器，负责对其添加额外的功能
 * <br/>
 * ConcreteDecorator
 *
 * @author laiql
 * @date 2021/10/25 10:12
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        component.operate();
        System.out.println("扩展操作A功能");
    }
}
