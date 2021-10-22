package com.smartfrank.pattern.builder.bike;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: 自行车组合包装类
 * <br/>
 * BikeConcreteBuilderMenu
 *
 * @author laiql
 * @date 2021/4/11 8:58 下午
 */
@NoArgsConstructor
public class BikeConcreteBuilderMenu implements IBike {

    /**
     * 配件清单
     */
    private List<Bike> partsList = new ArrayList<>();

    /**
     * 自行车总价
     */
    private BigDecimal price = BigDecimal.ZERO;

    private String name;

    public BikeConcreteBuilderMenu(String name) {
        this.name = name;
    }

    @Override
    public IBike appendFrame(Bike bike) {
        partsList.add(bike);
        price = price.add(bike.totalPrice());
        return this;
    }

    @Override
    public IBike appendTires(Bike bike) {
        partsList.add(bike);
        price = price.add(bike.totalPrice());
        return this;
    }

    @Override
    public IBike appendCushion(Bike bike) {
        partsList.add(bike);
        price = price.add(bike.totalPrice());
        return this;
    }


    @Override
    public String getDetail() {

        StringBuilder detail = new StringBuilder("\r\n------------------------------------------------------\r\n" +
                "配件清单" + "\r\n" +
                "自行车品牌：" + name + "\r\n" +
                "总价：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n");

        for (Bike bike : partsList) {
            detail.append(bike.frameName()).append("：").append(bike.totalPrice() + "\n");
        }

        return detail.toString();
    }
}
