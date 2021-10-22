package com.smartfrank.pattern.factory.method.service;

import cn.hutool.json.JSONUtil;
import com.smartfrank.pattern.factory.method.IExchange;
import com.smartfrank.pattern.factory.method.model.ReceiptReq;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * Description: 兑换实物业务类
 * <br/>
 * PhysicalGoodsService
 *
 * @author laiql
 * @date 2021/3/16 10:18 下午
 */
@Slf4j
public class PhysicalGoodsService implements IExchange {

    @Override
    public void commodityExchange(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        ReceiptReq deliverReq = new ReceiptReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = this.deliverGoods(deliverReq);
        log.info("请求参数[实物] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSONUtil.parse(extMap));
        log.info("测试结果[实物]：{}", isSuccess);

        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private Boolean deliverGoods(ReceiptReq deliverReq) {
        log.info("模拟发货实物商品一个：{}", JSONUtil.parse(deliverReq).toString());
        return true;
    }

    /**
     * 根据userId查询用户手机号
     *
     * @param userId
     * @return
     */
    private String queryUserPhoneNumber(String userId) {
        return "ID:" + userId + "手机号:19999999999";
    }

    /**
     * 模拟根据userId从数据库查询用户名
     *
     * @param userId
     * @return
     */
    private String queryUserName(String userId) {
        return "ID:" + userId + ":努力奋斗";
    }
}
