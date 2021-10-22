package com.smartfrank.pattern.builder.bike;

import java.math.BigDecimal;

/**
 * Description: 自行车零件接口
 * <br/>
 * IBike
 *
 * @author laiql
 * @date 2021/4/11 7:42 下午
 */
public interface Bike {

    /**
     * 框架名字
     *
     * @return
     */
    String frameName();

    /**
     * 配件总价
     *
     * @return
     */
    BigDecimal totalPrice();
}
