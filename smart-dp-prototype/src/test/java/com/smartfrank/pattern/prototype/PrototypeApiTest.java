package com.smartfrank.pattern.prototype;

import com.smartfrank.pattern.prototype.twocolor.LotteryActuator;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Description: 原型模式测试
 * <br/>
 * PrototypeApiTest
 *
 * @author laiql
 * @date 2021/10/22 9:30 下午
 */
public class PrototypeApiTest {

    @Test
    public void prototypeTest() throws Exception {
        LotteryActuator lotteryActuator = new LotteryActuator();
        int index = 0;
        while (true) {
            System.out.println(lotteryActuator);
            System.out.println(lotteryActuator.draw(++index, new BigDecimal(10000000 + index), "双色球彩票"));
        }
    }
}
