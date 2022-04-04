package com.smartfrank.pattern.builder.bike.fitting.cushion;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 摩拜品牌-自行车坐垫
 * <br/>
 * MoBaiCushion
 *
 * @author laiql
 * @date 2021/4/11 8:53 下午
 */
public class MoBaiCushion implements Bike {
    @Override
    public String frameName() {
        return "MB-坐垫";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(79.5);
    }
}
