package com.smartfrank.pattern.factory.abst.product;

import java.math.BigDecimal;

/**
 * Description: 美元抽象接口
 * <br/>
 * DollarMoney
 *
 * @author laiql
 * @date 2021/3/28 10:22 下午
 */
public interface DollarMoney {

    /**
     * 实现人民币转美元
     *
     * @param rmb
     * @return
     */
    void transform(BigDecimal rmb);
}
