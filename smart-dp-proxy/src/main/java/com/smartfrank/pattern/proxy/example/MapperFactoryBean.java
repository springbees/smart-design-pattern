package com.smartfrank.pattern.proxy.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Description: Mapper工厂代理类
 * <br/>
 * MapperFactoryBean
 *
 * @author laiql
 * @date 2021/11/1 11:25
 */
@Slf4j
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = (proxy, method, args) -> {
            Select annotation = method.getAnnotation(Select.class);
            log.info("SQL：{}", annotation.value().replace("#{uId}", args[0].toString()));
            return args[0] + ",代理模式实战";
        };
        return (T) Proxy.newProxyInstance(this.mapperInterface.getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    /**
     * 对象为单例的
     *
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
