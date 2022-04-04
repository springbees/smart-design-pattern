package com.smartfrank.pattern.builder;

import com.smartfrank.pattern.builder.bike.Builder;
import com.smartfrank.pattern.builder.internalexample.NewComputer;
import org.junit.Test;

/**
 * Description: 建造者模式测试类
 * <br/>
 * BuilderApiTest
 *
 * @author laiql
 * @date 2021/10/22 9:48 下午
 */
public class BuilderApiTest {

    @Test
    public void BuilderTest(){
        Builder builder = new Builder();

        System.out.println(builder.fengHuangBike("凤凰牌-自行车").getDetail());
        System.out.println(builder.haloBike("哈啰-自行车").getDetail());
        System.out.println(builder.moBaiBike("摩拜-自行车").getDetail());

        //内部类建造者模式
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("i5")
                .memory("16G")
                .mainboard("高通")
                .screen("TCL屏幕")
                .build();
        System.out.println("newComputer = " + newComputer);
    }
}
