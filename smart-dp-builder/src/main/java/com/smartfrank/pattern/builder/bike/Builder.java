package com.smartfrank.pattern.builder.bike;


import com.smartfrank.pattern.builder.bike.fitting.cushion.FengHuangCushion;
import com.smartfrank.pattern.builder.bike.fitting.cushion.HaLoCushion;
import com.smartfrank.pattern.builder.bike.fitting.cushion.MoBaiCushion;
import com.smartfrank.pattern.builder.bike.fitting.frame.FengHuangFrame;
import com.smartfrank.pattern.builder.bike.fitting.frame.MoBaiFrame;
import com.smartfrank.pattern.builder.bike.fitting.tires.FengHuangTires;
import com.smartfrank.pattern.builder.bike.fitting.tires.HaLoTires;
import com.smartfrank.pattern.builder.bike.fitting.tires.MoBaiTires;

/**
 * Description: 构建着类
 * <br/>
 * Builder
 *
 * @author laiql
 * @date 2021/4/11 8:32 下午
 */
public class Builder {

    /**
     * 凤凰牌自行车
     *
     * @param name
     * @return
     */
    public IBike fengHuangBike(String name) {
        return new BikeConcreteBuilderMenu(name)
                .appendCushion(new FengHuangCushion())
                .appendFrame(new FengHuangFrame())
                .appendTires(new FengHuangTires());
    }

    /**
     * 摩拜品牌自行车
     *
     * @param name
     * @return
     */
    public IBike moBaiBike(String name) {
        return new BikeConcreteBuilderMenu(name)
                .appendCushion(new MoBaiCushion())
                .appendFrame(new MoBaiFrame())
                .appendTires(new MoBaiTires());
    }

    /**
     * 哈啰品牌自行车
     *
     * @param name
     * @return
     */
    public IBike haloBike(String name) {
        return new BikeConcreteBuilderMenu(name)
                .appendCushion(new HaLoCushion())
                .appendTires(new HaLoTires())
                .appendFrame(new MoBaiFrame());
    }
}
