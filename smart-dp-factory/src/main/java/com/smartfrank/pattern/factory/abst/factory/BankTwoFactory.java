package com.smartfrank.pattern.factory.abst.factory;



import com.smartfrank.pattern.factory.abst.AbstractFactory;
import com.smartfrank.pattern.factory.abst.customer.BankOfChinaTwo;
import com.smartfrank.pattern.factory.abst.customer.SwissBankTwo;
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
public class BankTwoFactory implements AbstractFactory {

    @Override
    public RmbMoney createRmb(BigDecimal money) {
        return new SwissBankTwo(money);
    }

    @Override
    public DollarMoney createDollar(BigDecimal money) {
        return new BankOfChinaTwo(money);
    }
}
