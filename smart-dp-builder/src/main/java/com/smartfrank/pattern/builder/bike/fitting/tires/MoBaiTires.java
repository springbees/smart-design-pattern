package com.smartfrank.pattern.builder.bike.fitting.tires;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 摩拜品牌-自行车轮胎
 * <br/>
 * MoBaiTires
 *
 * @author laiql
 * @date 2021/4/11 8:47 下午
 */
public class MoBaiTires implements Bike {
    @Override
    public String frameName() {
        return "MB-轮胎";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(48.5);
    }
}
