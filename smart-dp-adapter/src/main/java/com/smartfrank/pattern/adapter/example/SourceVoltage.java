package com.smartfrank.pattern.adapter.example;

/**
 * Description: 原电压220V
 * <br/>
 * SourceVoltage
 *
 * @author laiql
 * @date 2021/10/25 19:17
 */
public class SourceVoltage {

    private static Integer voltage = 220;

    /**
     * 输出电压
     */
    public Integer outVoltage() {
        return voltage;
    }
}
