package com.smartfrank.pattern.bridging.abst;

/**
 * Description: 手机品牌抽象类
 * <br/>
 * HandsetBrand
 * 桥梁的一头A
 *
 * @author laiql
 * @date 2021/10/22 11:51
 */
public abstract class HandsetBrand {

    protected HandsetSoft soft;

    /**
     * 设置手机运行软件
     *
     * @param soft 软件
     */
    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    /**
     * 手机运行软件方法
     */
    public abstract void run();
}
