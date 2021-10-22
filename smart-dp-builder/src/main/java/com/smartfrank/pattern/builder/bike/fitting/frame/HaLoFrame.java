package com.smartfrank.pattern.builder.bike.fitting.frame;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 哈啰品牌自行车框架
 * <br/>
 * HaLoFrame
 *
 * @author laiql
 * @date 2021/4/11 8:51 下午
 */
public class HaLoFrame implements Bike {
    @Override
    public String frameName() {
        return "HL-框架";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(699.0);
    }
}
