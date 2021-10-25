package com.smartfrank.pattern.adapter.message;

import cn.hutool.json.JSONUtil;

import java.util.Date;

/**
 * Description: 订单下单消息
 * <br/>
 * Order
 *
 * @author laiql
 * @date 2021/10/21 10:37 下午
 */
public class Order {

    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private Date createOrderTime; // 下单时间

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}
