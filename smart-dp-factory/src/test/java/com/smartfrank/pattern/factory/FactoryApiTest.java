package com.smartfrank.pattern.factory;

import com.smartfrank.pattern.factory.abst.AbstractFactory;
import com.smartfrank.pattern.factory.method.factory.ICommodityMethodFactory;
import com.smartfrank.pattern.factory.method.factory.PhysicalGoodsFactory;
import com.smartfrank.pattern.factory.method.factory.TaoBaoCouponFactory;
import com.smartfrank.pattern.factory.method.factory.TencentMemberCardFactory;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Description: 工厂模式测试用例
 * <br/>
 * FactoryApiTest
 *
 * @author laiql
 * @date 2021/10/22 9:32 下午
 */
public class FactoryApiTest {

    @Test
    public void factoryMethodTest(){
        //发送虚拟卡
        ICommodityMethodFactory cardFactory = new TencentMemberCardFactory();
        cardFactory.create().commodityExchange("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);

        //发送优惠卷
        ICommodityMethodFactory couponFactory = new TaoBaoCouponFactory();
        couponFactory.create().commodityExchange("10001", "EGM1023938910232121323432", "791098764902132", null);

        //发送实物
        ICommodityMethodFactory appleFactory = new PhysicalGoodsFactory();
        appleFactory.create().commodityExchange("10001", "9820198721311", "1023000020112221113", new HashMap<String, String>(3) {{
            put("consigneeUserName", "jack");
            put("consigneeUserPhone", "13479975705");
            put("consigneeUserAddress", "广东省.深圳市.福田区.市花街道.长富金茂大厦.#60-2109");
        }});
    }

    @Test
    public void factoryAbstTest(){
        AbstractFactory oneFactory = AbstractFactory.createFactory("one");
        oneFactory.createDollar(new BigDecimal(100));
        oneFactory.createRmb(new BigDecimal(100));

        AbstractFactory twoFactory = AbstractFactory.createFactory("two");
        twoFactory.createDollar(new BigDecimal(1000));
        twoFactory.createRmb(new BigDecimal(1000));
    }
}
