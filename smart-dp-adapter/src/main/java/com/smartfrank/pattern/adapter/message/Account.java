package com.smartfrank.pattern.adapter.message;

import cn.hutool.json.JSONUtil;

import java.util.Date;

/**
 * Description: 开户消息
 * <br/>
 * Account
 *
 * @author laiql
 * @date 2021/10/21 10:37 下午
 */
public class Account {


    private String number;      // 开户编号
    private String address;     // 开户地
    private Date accountDate;   // 开户时间
    private String desc;        // 开户描述

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}
