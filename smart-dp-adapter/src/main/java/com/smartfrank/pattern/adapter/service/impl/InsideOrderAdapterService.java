package com.smartfrank.pattern.adapter.service.impl;


import com.smartfrank.pattern.adapter.service.OrderAdapterService;
import com.smartfrank.pattern.adapter.service.OrderService;

public class InsideOrderAdapterService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }

}
