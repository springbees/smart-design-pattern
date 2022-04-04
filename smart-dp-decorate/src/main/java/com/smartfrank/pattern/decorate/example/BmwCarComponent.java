package com.smartfrank.pattern.decorate.example;

/**
 * Description: 具体的装饰器，负责对其添加额外的功能对象
 * <br/>
 * BmwCarComponent
 *
 * @author laiql
 * @date 2021/10/25 10:45
 */
public class BmwCarComponent extends AbstractDecorator {

    public BmwCarComponent(Car car) {
        super(car);
    }

    @Override
    public void build() {
        super.build();
        //拓展额外功能
        System.out.println("增加宝马车牌，装饰成宝马！！！");
    }
}
