package com.smartfrank.pattern.factory.method;

import java.util.Map;

/**
 * Description: 商品兑换业务接口
 * <br/>
 * IExchange
 *
 * @author laiql
 * @date 2021/3/8 12:13 下午
 */
public interface IExchange {

    /**
     * 兑换商品接口
     *
     * @param uId
     * @param commodityId
     * @param bizId
     * @param extMap
     */
    void commodityExchange(String uId, String commodityId, String bizId, Map<String, String> extMap);
}
