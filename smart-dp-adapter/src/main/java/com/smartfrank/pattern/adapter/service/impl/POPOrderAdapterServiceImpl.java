package com.smartfrank.pattern.adapter.service.impl;

import com.smartfrank.pattern.adapter.service.OrderAdapterService;
import com.smartfrank.pattern.adapter.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
