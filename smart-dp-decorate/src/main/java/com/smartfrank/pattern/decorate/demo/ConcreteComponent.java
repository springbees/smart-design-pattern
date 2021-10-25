package com.smartfrank.pattern.decorate.demo;

/**
 * Description: 被装饰对象的类定义
 * <br/>
 * ConcreteComponent
 *
 * @author laiql
 * @date 2021/10/25 10:06
 */
public class ConcreteComponent implements Component {
    @Override
    public void operate() {
        System.out.println("操作A");
    }
}
