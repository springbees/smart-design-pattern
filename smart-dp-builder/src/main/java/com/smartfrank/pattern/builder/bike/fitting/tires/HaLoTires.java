package com.smartfrank.pattern.builder.bike.fitting.tires;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 哈啰平台自行车轮胎
 * <br/>
 * HaLoTires
 *
 * @author laiql
 * @date 2021/4/11 8:48 下午
 */
public class HaLoTires implements Bike {
    @Override
    public String frameName() {
        return "HL-轮胎";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(51.0);
    }
}
