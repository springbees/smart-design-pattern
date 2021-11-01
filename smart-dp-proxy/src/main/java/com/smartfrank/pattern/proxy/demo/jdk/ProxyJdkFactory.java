package com.smartfrank.pattern.proxy.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description: Jdk代理（基于接口代理）
 * <br/>
 * ProxyJdkFactory
 *
 * @author laiql
 * @date 2021/11/1 10:16
 */
public class ProxyJdkFactory implements InvocationHandler {

    //定义目标对象
    private Object target;

    public ProxyJdkFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取被代理接口实例对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        begin();
        Object invoke = method.invoke(target, args);
        end();
        return invoke;
    }

    private void begin() {
        System.out.println("jdk-代理-开启事务");
    }

    private void end() {
        System.out.println("jdk-代理-提交事务");
    }
}
