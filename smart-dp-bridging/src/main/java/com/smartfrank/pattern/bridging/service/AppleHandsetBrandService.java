package com.smartfrank.pattern.bridging.service;

import com.smartfrank.pattern.bridging.abst.HandsetBrand;

/**
 * Description: Apple 品牌手机运行软件服务
 * <br/>
 * AppleHandsetBrandService
 *
 * @author laiql
 * @date 2021/10/22 11:56
 */
public class AppleHandsetBrandService extends HandsetBrand {
    @Override
    public void run() {
        soft.run();
    }
}
