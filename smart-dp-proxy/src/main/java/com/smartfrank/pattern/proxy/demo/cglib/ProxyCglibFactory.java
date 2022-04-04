package com.smartfrank.pattern.proxy.demo.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description: Cglib动态代理
 * <br/>
 * ProxyCglibFactory
 *
 * @author laiql
 * @date 2021/11/1 10:50
 */
public class ProxyCglibFactory implements MethodInterceptor {

    //代理的目标对象
    private Object target;

    public ProxyCglibFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取被代理类实例对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        //Cglib 获取代理对象工具
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        begin();
        Object invoke = method.invoke(target, args);
        end();
        return invoke;
    }

    private void begin() {
        System.out.println("cglib-代理-开始事务");
    }

    private void end() {
        System.out.println("cglib-代理-提交事务");
    }
}
