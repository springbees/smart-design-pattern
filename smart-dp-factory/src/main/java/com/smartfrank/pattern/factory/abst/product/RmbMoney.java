package com.smartfrank.pattern.factory.abst.product;

import java.math.BigDecimal;

/**
 * Description: 人民币抽象接口
 * <br/>
 * RmbMoney
 *
 * @author laiql
 * @date 2021/3/28 10:22 下午
 */
public interface RmbMoney {

    /**
     * 实现美元转人民币
     *
     * @param dollar
     * @return
     */
    void transform(BigDecimal dollar);
}
