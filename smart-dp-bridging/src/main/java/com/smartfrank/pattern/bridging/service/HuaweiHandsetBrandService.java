package com.smartfrank.pattern.bridging.service;

import com.smartfrank.pattern.bridging.abst.HandsetBrand;

/**
 * Description: 华为品牌手机运行软件服务
 * <br/>
 * HuaweiHandsetBrandService
 *
 * @author laiql
 * @date 2021/10/22 11:57
 */
public class HuaweiHandsetBrandService extends HandsetBrand {
    @Override
    public void run() {
        //运行软件
        soft.run();
    }
}
