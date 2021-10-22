package com.smartfrank.pattern.factory.method.factory;


import com.smartfrank.pattern.factory.method.IExchange;
import com.smartfrank.pattern.factory.method.service.TaoBaoCouponService;

/**
 * Description: 淘宝优惠卷业务工厂
 * <br/>
 * TaoBaoCouponFactory
 *
 * @author laiql
 * @date 2021/3/16 10:20 下午
 */
public class TaoBaoCouponFactory implements ICommodityMethodFactory {

    @Override
    public IExchange create() {
        return new TaoBaoCouponService();
    }
}
