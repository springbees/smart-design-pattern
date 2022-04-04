package com.smartfrank.pattern.singleton;

import com.smartfrank.pattern.singleton.cas.AtomicSingleton;
import com.smartfrank.pattern.singleton.hungry.HungrySingleton;
import com.smartfrank.pattern.singleton.hungry.HungryStaticSingleton;
import com.smartfrank.pattern.singleton.inner.InnerLazySingleton;
import com.smartfrank.pattern.singleton.lazy.DoubleCheckLockLazySingleton;
import com.smartfrank.pattern.singleton.lazy.LazySingleton;
import com.smartfrank.pattern.singleton.registry.EnumSingleton;
import org.junit.Test;

/**
 * Description: 单例模式用例测试
 * <br/>
 * SingletonAppTest
 *
 * @author laiql
 * @date 2021/10/22 8:46 下午
 */
public class SingletonAppTest {

    @Test
    public void singletonTest(){
        System.out.println(AtomicSingleton.getInstance());

        System.out.println(EnumSingleton.getInstance());

        System.out.println(DoubleCheckLockLazySingleton.getInstance());

        System.out.println(LazySingleton.getInstance());

        System.out.println(InnerLazySingleton.getInstance());

        System.out.println(HungrySingleton.getInstance());
        
        System.out.println(HungryStaticSingleton.getInstance());
    }
}
