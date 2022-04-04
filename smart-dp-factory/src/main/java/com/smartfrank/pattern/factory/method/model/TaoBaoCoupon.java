package com.smartfrank.pattern.factory.method.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Description: 淘宝优惠卷对象
 * <br/>
 * TaoBaoCoupon
 *
 * @author laiql
 * @date 2021/3/8 12:08 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaoBaoCoupon {

    /**
     * Uid
     */
    private String id;

    /**
     * 优惠卷ID
     */
    private String couponId;

    /**
     * 优惠卷名字
     */
    private String couponName;

    /**
     * 优惠卷描述
     */
    private String couponDesc;

    /**
     * 优惠卷大小
     */
    private BigDecimal couponAmount;
}
