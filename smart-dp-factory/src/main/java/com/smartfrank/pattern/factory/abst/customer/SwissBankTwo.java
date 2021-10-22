package com.smartfrank.pattern.factory.abst.customer;


import com.smartfrank.pattern.factory.abst.product.RmbMoney;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Description: 创建瑞士银行-实现我们抽象产品
 * <br/>
 * SwissBank
 *
 * @author laiql
 * @date 2021/3/28 10:27 下午
 */
public class SwissBankTwo implements RmbMoney {

    public SwissBankTwo(BigDecimal money) {
        this.transform(money);
    }

    @Override
    public void transform(BigDecimal dollar) {
        //100美元转人民币
        System.out.println("SwissBankTwo-美元转人民币操作：" + dollar.multiply(new BigDecimal(6.9, MathContext.DECIMAL32)));
    }
}
