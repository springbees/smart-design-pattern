package com.smartfrank.pattern.singleton.lazy;

/**
 * Description: 懒汉式单例模式(线程不安全)
 * <br/>
 * LazySingleton
 *
 * @author laiql
 * @date 2021/10/22 9:07 下午
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton(){
    }

    /**
     * 线程不安全
     * @return
     */
    public static LazySingleton getInstance(){
        if (null ==INSTANCE){
            return INSTANCE = new LazySingleton();
        }
        return new LazySingleton();
    }
}
