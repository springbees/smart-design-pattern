package com.smartfrank.pattern.factory.abst.customer;


import com.smartfrank.pattern.factory.abst.product.DollarMoney;

import java.math.BigDecimal;

/**
 * Description: 创建中国银行类-并实现我们抽象产品
 * <br/>
 * BankOfChina
 *
 * @author laiql
 * @date 2021/3/28 10:26 下午
 */
public class BankOfChinaTwo implements DollarMoney {

    public BankOfChinaTwo(BigDecimal money) {
        this.transform(money);
    }

    @Override
    public void transform(BigDecimal rmb) {
        //100人民币转美元
        System.out.println("BankOfChinaTwo-人民币转美元：" + rmb.divide(new BigDecimal(6.9), 0, BigDecimal.ROUND_HALF_UP));
    }
}
