package com.smartfrank.pattern;

import com.smartfrank.pattern.example.CouponContext;
import com.smartfrank.pattern.example.ZJCouponDiscount;
import com.smartfrank.pattern.example.ZKCouponDiscount;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Description: 策略模式测试用例
 * <br/>
 * StrategyTest
 *
 * @author laiql
 * @date 2021/11/4 9:12 下午
 */
@Slf4j
public class StrategyTest {

    @Test
    public void test(){
        CouponContext<Double> couponContext = new CouponContext<>(new ZJCouponDiscount());
        BigDecimal discountAmount = couponContext.discountAmount(10D, new BigDecimal(100));
        log.info("测试结果：直减优惠后金额 {}", discountAmount);
    }
}
