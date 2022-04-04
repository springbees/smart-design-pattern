package com.smartfrank.pattern.decorate;

import com.smartfrank.pattern.decorate.example.BmwCarComponent;
import com.smartfrank.pattern.decorate.example.Car;
import com.smartfrank.pattern.decorate.example.CarComponent;
import org.junit.Test;

/**
 * Description: 装饰者模式测试用例
 * <br/>
 * DecorateTest
 *
 * @author laiql
 * @date 2021/10/22 9:57 下午
 */
public class DecorateTest {

    @Test
    public void decorateTest() {
        //构造一辆Bwm品牌车
        Car car = new BmwCarComponent(new CarComponent());
        car.build();
    }
}
