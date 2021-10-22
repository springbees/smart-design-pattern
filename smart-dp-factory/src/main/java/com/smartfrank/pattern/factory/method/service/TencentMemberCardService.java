package com.smartfrank.pattern.factory.method.service;

import cn.hutool.json.JSONUtil;
import com.smartfrank.pattern.factory.method.IExchange;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * Description: 腾讯会员虚拟卡号
 * <br/>
 * TencentMemberCardService
 *
 * @author laiql
 * @date 2021/3/8 12:30 下午
 */
@Slf4j
public class TencentMemberCardService implements IExchange {

    @Override
    public void commodityExchange(String userId, String commodityId, String bizId, Map<String, String> extMap) {
        //获取兑换人的手机号
        String mobile = queryUserMobile(userId);
        authorizeToRedeemVirtualCard(mobile, commodityId);
        log.info("请求参数[腾讯会员兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", userId, commodityId, bizId, JSONUtil.parse(extMap));
        log.info("测试结果[腾讯会员兑换卡]：success");
    }

    private void authorizeToRedeemVirtualCard(String mobile, String bizId) {
        log.debug("模拟发腾讯会员卡一张-绑定手机号:{} - 兑换卡号:{}", mobile, bizId);
    }

    private String queryUserMobile(String userId) {
        //模拟从数据库查询
        String mobile = "13412345675";
        return mobile;
    }
}
