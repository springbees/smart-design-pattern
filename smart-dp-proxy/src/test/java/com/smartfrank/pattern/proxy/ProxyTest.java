package com.smartfrank.pattern.proxy;

import com.smartfrank.pattern.proxy.demo.IRun;
import com.smartfrank.pattern.proxy.demo.RealizeRun;
import com.smartfrank.pattern.proxy.demo.cglib.ProxyCglibFactory;
import com.smartfrank.pattern.proxy.demo.jdk.ProxyJdkFactory;
import com.smartfrank.pattern.proxy.demo.statics.StaticProxy;
import com.smartfrank.pattern.proxy.example.IUserDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Description: 代理模式测试用例
 * <br/>
 * ProxyTest
 *
 * @author laiql
 * @date 2021/10/22 10:03 下午
 */
@Slf4j
public class ProxyTest {

    @Test
    public void proxyTest() {
        System.out.println("----------demo------------");
        IRun run = new RealizeRun();
        StaticProxy staticProxy = new StaticProxy(run);
        staticProxy.run();

        System.out.println("----------------------");

        ProxyJdkFactory proxyJdkFactory = new ProxyJdkFactory(run);
        IRun proxy = proxyJdkFactory.getProxy();
        proxy.run();


        System.out.println("----------------------");

        ProxyCglibFactory proxyCglibFactory = new ProxyCglibFactory(new RealizeRun());
        RealizeRun cglibFactoryProxy = proxyCglibFactory.getProxy();
        cglibFactoryProxy.run();

        System.out.println("----------example------------");

        BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
        IUserDao userDao = factory.getBean("userDao", IUserDao.class);
        String userInfo = userDao.queryUserInfo("10001");
        log.info("预期测试验证结果: {}", userInfo);

    }
}
