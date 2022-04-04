package com.smartfrank.pattern.factory.abst.factory;



import com.smartfrank.pattern.factory.abst.AbstractFactory;
import com.smartfrank.pattern.factory.abst.customer.BankOfChinaOne;
import com.smartfrank.pattern.factory.abst.customer.SwissBankOne;
import com.smartfrank.pattern.factory.abst.product.DollarMoney;
import com.smartfrank.pattern.factory.abst.product.RmbMoney;

import java.math.BigDecimal;

/**
 * Description: 定义一号银行工厂类
 * <br/>
 * BankOneFactory
 *
 * @author laiql
 * @date 2021/3/28 10:52 下午
 */
public class BankOneFactory implements AbstractFactory {

    @Override
    public RmbMoney createRmb(BigDecimal money) {
        return new SwissBankOne(money);
    }

    @Override
    public DollarMoney createDollar(BigDecimal money) {
        return new BankOfChinaOne(money);
    }
}
