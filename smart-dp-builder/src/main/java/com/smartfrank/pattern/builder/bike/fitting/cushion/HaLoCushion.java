package com.smartfrank.pattern.builder.bike.fitting.cushion;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 哈啰品牌-自行车坐垫
 * <br/>
 * HaLoCushion
 *
 * @author laiql
 * @date 2021/4/11 8:53 下午
 */
public class HaLoCushion implements Bike {
    @Override
    public String frameName() {
        return "HL-坐垫";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(89.0);
    }
}
