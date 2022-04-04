package com.smartfrank.pattern.singleton.hungry;

/**
 * Description: 饿汉式静态代码块单例模式
 * <br/>
 * HungryStaticSingleton
 *
 * @author laiql
 * @date 2021/10/22 8:50 下午
 */
public class HungryStaticSingleton {
    private static HungryStaticSingleton INSTANCE;

    private HungryStaticSingleton(){
    }
    static {
        INSTANCE = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return INSTANCE;
    }
}
