package com.smartfrank.pattern.demo;

import com.smartfrank.pattern.demo.handler.ConsoleLogger;
import com.smartfrank.pattern.demo.handler.ErrorLogger;
import com.smartfrank.pattern.demo.handler.FileLogger;

/**
 * Description: 测试
 * <br/>
 * ChainPatternDemo
 *
 * @author laiql
 * @date 2021/11/2 14:28
 */
public class ClientTest {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "info");

        loggerChain.logMessage(AbstractLogger.DEBUG, "debug");

        loggerChain.logMessage(AbstractLogger.ERROR, "error");
    }
}
