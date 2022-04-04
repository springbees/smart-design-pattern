package com.smartfrank.pattern.demo.handler;

import com.smartfrank.pattern.demo.AbstractLogger;

/**
 * Description: 错误日志写出
 * <br/>
 * ErrorLogger
 *
 * @author laiql
 * @date 2021/11/2 14:25
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
