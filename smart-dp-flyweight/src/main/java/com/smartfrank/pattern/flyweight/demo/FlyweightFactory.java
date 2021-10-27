package com.smartfrank.pattern.flyweight.demo;

import java.util.HashMap;

/**
 * Description: 一个享元工厂，用来创建并管理Flyweight对象，主要是用来确保合理地共享Flyweight，当用户请求一个Flyweight时，FlyweightFactory对象提供一个已创建的实例或创建一个实例
 * <br/>
 * FlyweightFactory
 *
 * @author laiql
 * @date 2021/10/27 16:21
 */
public class FlyweightFactory {

    /**
     * 定义一个池容器
     */
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;

        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
            System.out.print("已有 " + extrinsic + " 直接从池中取---->");
        } else {
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight(extrinsic);
            //放入共享池
            pool.put(extrinsic, flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取出---->");
        }
        return flyweight;
    }
}
