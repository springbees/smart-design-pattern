package com.smartfrank.pattern.factory.method.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Description: 实物商品
 * <br/>
 * PhysicalGoods
 *
 * @author laiql
 * @date 2021/3/8 2:21 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalGoods {

    /**
     * Uid
     */
    private String id;

    /**
     * 商品名
     */
    private String goodsName;

    /**
     * 商品描述
     */
    private String goodsDesc;

    /**
     * 商品价格
     */
    private BigDecimal price;
}
