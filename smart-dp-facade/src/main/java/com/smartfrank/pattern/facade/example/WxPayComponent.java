package com.smartfrank.pattern.facade.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Description: 微信支付组件
 * <br/>
 * WxPayComponent
 *
 * @author laiql
 * @date 2021/10/26 17:24
 */
@Data
@AllArgsConstructor
public class WxPayComponent {

    private String userId;
    private BigDecimal money;

    /**
     * 支付方法
     */
    public void pay() {
        System.out.println("用户ID: " + userId + " 微信付款:" + money + "元");
    }
}
