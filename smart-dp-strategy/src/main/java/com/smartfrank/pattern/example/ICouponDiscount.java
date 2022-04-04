package com.smartfrank.pattern.example;

import java.math.BigDecimal;

/**
 * Description: 抽象优惠卷接口
 * <br/>
 * ICouponDiscount
 *
 * @author laiql
 * @date 2021/11/4 9:25 下午
 */
public interface ICouponDiscount<T> {

    /**
     * 优惠券金额计算
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @return           优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
