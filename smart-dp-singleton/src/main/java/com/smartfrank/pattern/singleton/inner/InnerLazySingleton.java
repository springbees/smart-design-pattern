package com.smartfrank.pattern.singleton.inner;

/**
 * Description: 类加载器实现单例模式(线程安全效率最高)
 * <br/>
 * InnerLazySingleton
 *
 * @author laiql
 * @date 2021/10/22 8:58 下午
 */
public class InnerLazySingleton {

    /**
     * 私有化构造器
     */
    private InnerLazySingleton(){
        if (LazyHolder.INNER_LAZY_SINGLETON!=null){
            new RuntimeException("禁止创建单例对象对象");
        }
    }

    /**
     * 对外提供单例对象获取
     * @return
     */
    public final static InnerLazySingleton getInstance(){
        return LazyHolder.INNER_LAZY_SINGLETON;
    }


    public static  class LazyHolder{
        private static final InnerLazySingleton INNER_LAZY_SINGLETON = new InnerLazySingleton();
    }
}
