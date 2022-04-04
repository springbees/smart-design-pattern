package com.smartfrank.pattern.factory.method.factory;


import com.smartfrank.pattern.factory.method.IExchange;
import com.smartfrank.pattern.factory.method.service.PhysicalGoodsService;

/**
 * Description: 兑换实物商品业务工厂类
 * <br/>
 * PhysicalGoodsFactory
 *
 * @author laiql
 * @date 2021/3/16 10:20 下午
 */
public class PhysicalGoodsFactory implements ICommodityMethodFactory {

    @Override
    public IExchange create() {
        return new PhysicalGoodsService();
    }
}
