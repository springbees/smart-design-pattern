package com.smartfrank.pattern.example;

import java.math.BigDecimal;

/**
 * Description: n元购业务实现
 * <br/>
 * NYGCouponDiscount
 *
 * @author laiql
 * @date 2021/11/4 9:34 下午
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }

}
