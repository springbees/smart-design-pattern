package com.smartfrank.pattern.bridging.abst;

/**
 * Description: 手机软件抽象类
 * <br/>
 * HandsetSoft
 * 桥梁的另一头B,两者通过一条聚合线连接，表示一个手机品牌可以有多个软件。
 *
 * @author laiql
 * @date 2021/10/22 11:51
 */
public abstract class HandsetSoft {

    /**
     * 软件运行方法
     */
    public abstract void run();
}
