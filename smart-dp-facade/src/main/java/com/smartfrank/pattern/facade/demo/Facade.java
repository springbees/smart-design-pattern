package com.smartfrank.pattern.facade.demo;

/**
 * Description: 提供一个外观接口，对外，它提供一个易于客户端访问的接口，对内，它可以访问子系统中的所有功能。
 * <br/>
 * Facade
 *
 * @author laiql
 * @date 2021/10/26 17:05
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }

    public void method() {
        System.out.println("对外提供接口执行");
        subSystemOne.method();
        subSystemTwo.method();
    }
}
