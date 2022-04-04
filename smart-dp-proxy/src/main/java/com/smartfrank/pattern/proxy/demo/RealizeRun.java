package com.smartfrank.pattern.proxy.demo;

/**
 * Description: 通用接口实现类定义
 * <br/>
 * RealizeRun
 *
 * @author laiql
 * @date 2021/11/1 9:55
 */
public class RealizeRun implements IRun {
    @Override
    public void run() {
        System.out.println("正在执行主流程保存数据库");
    }
}
