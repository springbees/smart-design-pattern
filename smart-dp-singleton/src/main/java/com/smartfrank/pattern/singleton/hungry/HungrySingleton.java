package com.smartfrank.pattern.singleton.hungry;

/**
 * Description: 饿汉式单例
 * <br/>
 * HungrySingleton
 *
 * @author laiql
 * @date 2021/10/22 8:47 下午
 */
public class HungrySingleton {
    private static HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 私有化构造器
     */
    private HungrySingleton(){
    }

    /**
     * 优点：
     * 线程安全
     * 缺点：
     * 浪费资源
     *
     * @return 返回 HungrySingleton 对象
     */
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
