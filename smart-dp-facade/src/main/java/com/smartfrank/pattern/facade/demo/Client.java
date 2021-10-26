package com.smartfrank.pattern.facade.demo;

/**
 * Description: 客户端调用角色
 * <br/>
 * Client
 *
 * @author laiql
 * @date 2021/10/26 17:09
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
