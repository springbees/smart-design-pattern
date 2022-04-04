package com.smartfrank.pattern.factory.method.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Description: 腾讯会员虚拟兑换卡对象
 * <br/>
 * TencentMemberCard
 *
 * @author laiql
 * @date 2021/3/8 12:05 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TencentMemberCard {

    /**
     * Uid
     */
    private String id;

    /**
     * 虚拟会员卡号
     */
    private String cardId;

    /**
     * 虚拟会员卡名
     */
    private String cardName;

    /**
     * 虚拟卡号描述
     */
    private String cardDesc;

    /**
     * 虚拟卡价值
     */
    private BigDecimal price;

}
