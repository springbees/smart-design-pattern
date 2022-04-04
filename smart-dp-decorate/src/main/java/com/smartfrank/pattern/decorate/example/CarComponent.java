package com.smartfrank.pattern.decorate.example;

/**
 * Description: 汽车被装饰对象定义
 * <br/>
 * CarComponent
 *
 * @author laiql
 * @date 2021/10/25 10:38
 */
public class CarComponent implements Car {
    @Override
    public void build() {
        System.out.println("轮子+外壳+发动机=标准Car");
    }
}
