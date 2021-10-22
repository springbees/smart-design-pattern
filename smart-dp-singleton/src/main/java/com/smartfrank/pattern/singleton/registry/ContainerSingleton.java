package com.smartfrank.pattern.singleton.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description: 容器注册式单例（线程安全）
 * <br/>
 * ContainerSingleton
 *
 * @author laiql
 * @date 2021/10/22 9:10 下午
 */
public class ContainerSingleton {

    private static Map<String,Object> INSTANCE = new ConcurrentHashMap<>();

    /**
     * 注册式单例
     */
    public static Object getInstance(String className){
        synchronized (INSTANCE){
            //判断对象是否已经在容器存在了
            if (!INSTANCE.containsKey(className)){
                Object instance = null;
                try {
                    instance = Class.forName(className).newInstance();
                    //将对象加入到容器
                    INSTANCE.put(className,instance);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return instance;
            }else {
                //已经存在的话，直接从容器中取走
                return INSTANCE.get(className);
            }
        }
    }

}
