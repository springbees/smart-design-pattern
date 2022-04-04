package com.smartfrank.pattern.builder.bike.fitting.tires;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 凤凰牌-自行车轮胎
 * <br/>
 * FengHuangTires
 *
 * @author laiql
 * @date 2021/4/11 8:39 下午
 */
public class FengHuangTires implements Bike {

    @Override
    public String frameName() {
        return "FH-轮胎";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(50.0);
    }
}
