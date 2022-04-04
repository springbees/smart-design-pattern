package com.smartfrank.pattern.facade.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Description: 支付宝支付组件
 * <br/>
 * ZFBPayComponent
 *
 * @author laiql
 * @date 2021/10/26 17:24
 */
@Data
@AllArgsConstructor
public class ZFBPayComponent {

    private String userId;
    private BigDecimal money;

    /**
     * 支付方法
     */
    public void pay() {
        System.out.println("用户ID: " + userId + " 支付宝付款:" + money + "元");
    }
}
