package com.smartfrank.pattern;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.smartfrank.pattern.example.LotteryResult;
import com.smartfrank.pattern.example.LotteryServiceImpl;
import org.junit.Test;

/**
 * Description: 观察者模式测试用例
 * <br/>
 * ObservationTest
 *
 * @author laiql
 * @date 2021/11/3 9:55
 */
public class ObservationTest {

    @Test
    public void test() {
        LotteryServiceImpl lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("10000003");
        System.out.println("抽奖结果:" + JSONUtil.toJsonStr(result));
    }
}
