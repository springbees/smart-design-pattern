package com.smartfrank.pattern.builder.bike.fitting.frame;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 凤凰拍-自行车框架
 * <br/>
 * FengHuangFrame
 *
 * @author laiql
 * @date 2021/4/11 8:49 下午
 */
public class FengHuangFrame implements Bike {
    @Override
    public String frameName() {
        return "FH-框架";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(666.0);
    }
}
