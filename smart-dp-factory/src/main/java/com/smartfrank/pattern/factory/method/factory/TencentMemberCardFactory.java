package com.smartfrank.pattern.factory.method.factory;


import com.smartfrank.pattern.factory.method.IExchange;
import com.smartfrank.pattern.factory.method.service.TencentMemberCardService;

/**
 * Description: 腾讯会员虚拟卡业务工厂
 * <br/>
 * TencentMemberCardFactory
 *
 * @author laiql
 * @date 2021/3/16 10:18 下午
 */
public class TencentMemberCardFactory implements ICommodityMethodFactory {

    @Override
    public IExchange create() {
        return new TencentMemberCardService();
    }
}
