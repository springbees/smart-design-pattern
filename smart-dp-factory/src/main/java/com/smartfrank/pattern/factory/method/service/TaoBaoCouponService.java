package com.smartfrank.pattern.factory.method.service;

import cn.hutool.json.JSONUtil;
import com.smartfrank.pattern.factory.method.IExchange;
import com.smartfrank.pattern.factory.method.model.TaoBaoCouponResult;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * Description: 淘宝优惠卷业务实现
 * <br/>
 * TaoBaoCouponService
 *
 * @author laiql
 * @date 2021/3/8 12:10 下午
 */
@Slf4j
public class TaoBaoCouponService implements IExchange {

    @Override
    public void commodityExchange(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        TaoBaoCouponResult couponResult = this.sendCoupon(uId, commodityId, bizId);
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSONUtil.parse(extMap));
        log.info("测试结果[优惠券]：{}", JSONUtil.parse(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }

    private TaoBaoCouponResult sendCoupon(String uId, String commodityId, String uuid) {
        log.info("模拟发放优惠券一张：UID: {} - 优惠卷号码: {} - UUID: {}", uId, commodityId, uuid);
        return new TaoBaoCouponResult("0000", "发放成功");
    }
}
