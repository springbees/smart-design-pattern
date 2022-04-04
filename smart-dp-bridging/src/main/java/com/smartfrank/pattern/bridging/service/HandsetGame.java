package com.smartfrank.pattern.bridging.service;

import com.smartfrank.pattern.bridging.abst.HandsetSoft;

/**
 * Description: 各类手机软件
 * <br/>
 * HandsetGame
 * 游戏软件
 * @author laiql
 * @date 2021/10/22 13:45
 */
public class HandsetGame extends HandsetSoft {
    @Override
    public void run() {
        System.out.println("运行手机游戏");
    }
}
