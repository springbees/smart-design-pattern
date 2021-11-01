package com.smartfrank.pattern.proxy.demo.statics;

import com.smartfrank.pattern.proxy.demo.IRun;

/**
 * Description: 通用接口代理类
 * <br/>
 * StaticProxy
 *
 * @author laiql
 * @date 2021/11/1 9:56
 */
public class StaticProxy implements IRun {

    private IRun run;

    public StaticProxy(IRun run) {
        super();
        this.run = run;
    }

    @Override
    public void run() {
        begin();
        run.run();
        end();
    }

    public void end() {
        System.out.println("static-代理-开启事务");
    }

    public void begin() {
        System.out.println("static-代理-提交事务");
    }
}
