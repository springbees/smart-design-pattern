package com.smartfrank.pattern.adapter.example;

/**
 * Description: 目标电压接口
 * <br/>
 * TargetVoltage
 *
 * @author laiql
 * @date 2021/10/25 19:13
 */
public interface TargetVoltage {

    /**
     * 将220v转换成110v（原有插头（Adaptee）没有的）
     */
    Integer convert();
}
