package com.smartfrank.pattern.adapter.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class POPOrderService {


    public boolean isFirstOrder(String uId) {
        log.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }

}
