package com.smartfrank.pattern.example;

import java.math.BigDecimal;

/**
 * Description: 优惠卷策略上下文
 * <br/>
 * CouponContext
 *
 * @author laiql
 * @date 2021/11/4 9:36 下午
 */
public class CouponContext<T> {

    private ICouponDiscount<T> couponDiscount;

    public CouponContext(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * 调用具体折扣业务
     * @param couponInfo 折扣信息
     * @param skuPrice sku金额
     * @return 折扣后价格
     */
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

}
