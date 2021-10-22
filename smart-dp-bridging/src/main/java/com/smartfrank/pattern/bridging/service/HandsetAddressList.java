package com.smartfrank.pattern.bridging.service;

import com.smartfrank.pattern.bridging.abst.HandsetSoft;

/**
 * Description: 手机软件
 * <br/>
 * HandsetAddressList
 *
 * @author laiql
 * @date 2021/10/22 13:46
 */
public class HandsetAddressList extends HandsetSoft {
    @Override
    public void run() {
        System.out.println("运行手机通讯录");
    }
}
