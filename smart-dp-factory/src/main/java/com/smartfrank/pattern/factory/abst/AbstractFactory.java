package com.smartfrank.pattern.factory.abst;



import com.smartfrank.pattern.factory.abst.factory.BankOneFactory;
import com.smartfrank.pattern.factory.abst.factory.BankTwoFactory;
import com.smartfrank.pattern.factory.abst.product.DollarMoney;
import com.smartfrank.pattern.factory.abst.product.RmbMoney;

import java.math.BigDecimal;

/**
 * Description: 创建一个人民币转换美元抽象工厂
 * <br/>
 * AbstractFactory
 *
 * @author laiql
 * @date 2021/3/28 10:15 下午
 */
public interface AbstractFactory {

    /**
     * 创建人民币转换接口
     *
     * @param money
     * @return
     */
    RmbMoney createRmb(BigDecimal money);

    /**
     * 创建美元转换接口
     *
     * @param money
     * @return
     */
    DollarMoney createDollar(BigDecimal money);

    static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("one")) {
            return new BankOneFactory();
        } else if (name.equalsIgnoreCase("two")) {
            return new BankTwoFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }

}
