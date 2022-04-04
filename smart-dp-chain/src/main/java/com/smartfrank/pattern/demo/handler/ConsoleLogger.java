package com.smartfrank.pattern.demo.handler;

import com.smartfrank.pattern.demo.AbstractLogger;

/**
 * Description: 控制台写日志操作
 * <br/>
 * ConsoleLogger
 *
 * @author laiql
 * @date 2021/11/2 14:22
 */
public class ConsoleLogger extends AbstractLogger {


    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
