package com.smartfrank.pattern.builder.bike;

/**
 * Description: 自行车抽象包装接口
 * <br/>
 * Bike
 *
 * @author laiql
 * @date 2021/4/11 7:53 下午
 */
public interface IBike {

    /**
     * 自行车框架
     *
     * @return
     */
    IBike appendFrame(Bike bike);


    /**
     * 自行车轮胎
     *
     * @return
     */
    IBike appendTires(Bike bike);

    /**
     * 自行车坐垫
     *
     * @return
     */
    IBike appendCushion(Bike bike);

    /**
     * 明细
     */
    String getDetail();
}
