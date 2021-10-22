package com.smartfrank.pattern.builder.bike.fitting.frame;


import com.smartfrank.pattern.builder.bike.Bike;

import java.math.BigDecimal;

/**
 * Description: 摩拜品牌-自行车框架
 * <br/>
 * MoBaiFrame
 *
 * @author laiql
 * @date 2021/4/11 8:50 下午
 */
public class MoBaiFrame implements Bike {
    @Override
    public String frameName() {
        return "MB-框架";
    }

    @Override
    public BigDecimal totalPrice() {
        return new BigDecimal(799.0);
    }
}
