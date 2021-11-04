package com.smartfrank.pattern.example;

import java.math.BigDecimal;

/**
 * Description: 直减业务实现
 * <br/>
 * ZJCouponDiscount
 *
 * @author laiql
 * @date 2021/11/4 9:33 下午
 */
public class ZJCouponDiscount implements ICouponDiscount<Double>{
    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
