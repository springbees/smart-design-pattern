package com.smartfrank.pattern.singleton.cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Description: 基于CAS单例模式
 * <br/>
 * AtomicSingleton
 *
 * @author laiql
 * @date 2021/10/22 9:18 下午
 */
public class AtomicSingleton {
    private static AtomicReference<AtomicSingleton> INSTANCE = new AtomicReference<>();

    private static AtomicSingleton instance;

    public static final AtomicSingleton getInstance(){
        while (true){
            AtomicSingleton atomicSingleton = INSTANCE.get();
            if (null !=atomicSingleton){
                return atomicSingleton;
            }
            INSTANCE.compareAndSet(null,new AtomicSingleton());
            return INSTANCE.get();
        }
    }

}
