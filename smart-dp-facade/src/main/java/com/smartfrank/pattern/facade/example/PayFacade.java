package com.smartfrank.pattern.facade.example;

import java.math.BigDecimal;

/**
 * Description: 组合付款门面
 * <br/>
 * PayFacade
 *
 * @author laiql
 * @date 2021/10/26 17:27
 */
public class PayFacade {

    private WxPayComponent wxPayComponent;
    private ZFBPayComponent zfbPayComponent;

    public PayFacade(WxPayComponent wxPayComponent, ZFBPayComponent zfbPayComponent) {
        this.wxPayComponent = wxPayComponent;
        this.zfbPayComponent = zfbPayComponent;
    }

    /**
     * 统一组合支付门面
     */
    public void unifiedPayment() {
        this.zfbPayComponent.pay();
        this.wxPayComponent.pay();
        System.out.println("合计：" + new BigDecimal("0").add(wxPayComponent.getMoney()).add(zfbPayComponent.getMoney()));
    }
}
