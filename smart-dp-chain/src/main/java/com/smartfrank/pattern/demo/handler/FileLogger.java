package com.smartfrank.pattern.demo.handler;

import com.smartfrank.pattern.demo.AbstractLogger;

/**
 * Description:文件日志写出
 * <br/>
 * FileLogger
 *
 * @author laiql
 * @date 2021/11/2 14:27
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
