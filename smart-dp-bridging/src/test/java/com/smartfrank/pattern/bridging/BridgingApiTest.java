package com.smartfrank.pattern.bridging;

import com.smartfrank.pattern.bridging.abst.HandsetBrand;
import com.smartfrank.pattern.bridging.service.AppleHandsetBrandService;
import com.smartfrank.pattern.bridging.service.HandsetAddressList;
import com.smartfrank.pattern.bridging.service.HandsetGame;
import com.smartfrank.pattern.bridging.service.HuaweiHandsetBrandService;
import org.junit.Test;

/**
 * Description: 桥接模式策略用例
 * <br/>
 * BridgingApiTest
 *
 * @author laiql
 * @date 2021/10/22 13:47
 */
public class BridgingApiTest {

    @Test
    public void test() {
        //创建一个Apple品牌手机实例
        HandsetBrand appleHandsetBrandService = new AppleHandsetBrandService();
        System.out.println("Apple:");
        //手机运行游戏软件
        appleHandsetBrandService.setSoft(new HandsetGame());
        appleHandsetBrandService.run();

        HandsetBrand huaweiHandsetBrandService = new HuaweiHandsetBrandService();

        System.out.println("Huawei:");
        //手机运行通讯录
        huaweiHandsetBrandService.setSoft(new HandsetAddressList());
        huaweiHandsetBrandService.run();
    }

}
