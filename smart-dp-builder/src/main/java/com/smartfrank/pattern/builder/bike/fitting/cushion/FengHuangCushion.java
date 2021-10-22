package com.smartfrank.pattern.builder.bike.fitting.cushion;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 凤凰品牌-自行车坐垫
 * <br/>
 * FengHuangCushion
 *
 * @author laiql
 * @date 2021/4/11 8:52 下午
 */
public class FengHuangCushion implements Bike {
    @Override
    public String frameName() {
        return "FH-坐垫";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(99.0);
    }
}
