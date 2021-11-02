package com.smartfrank.pattern.demo;

/**
 * Description: 抽象日志类
 * <br/>
 * AbstractLogger
 *
 * @author laiql
 * @date 2021/11/2 14:12
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    /**
     * 日志级别
     */
    protected Integer level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(Integer level, String message) {
        if (this.level <= level) {
            write(message);
        }
        //转发给下一个责任链
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 抽象具体写日志方法
     *
     * @param message
     */
    protected abstract void write(String message);
}
