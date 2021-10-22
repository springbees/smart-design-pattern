package com.smartfrank.pattern.singleton.lazy;

/**
 * Description: 双重检验锁单例模(线程安全)
 * <br/>
 * DoubleCheckLockLazySingleton
 *
 * @author laiql
 * @date 2021/10/22 9:02 下午
 */
public class DoubleCheckLockLazySingleton {
    private static volatile DoubleCheckLockLazySingleton INSTANCE;

    /**
     * 私有化构造器
     */
    private DoubleCheckLockLazySingleton(){
    }

    /**
     * volatile解决JVM指令重排问题
     * 线程安全
     * @return
     */
    public static DoubleCheckLockLazySingleton getInstance() {
        if (null == INSTANCE){
            synchronized (DoubleCheckLockLazySingleton.class){
                if (null == INSTANCE){
                    return INSTANCE = new DoubleCheckLockLazySingleton();
                }
            }
        }
        return null;
    }
}
