package com.smartfrank.pattern.builder.internalexample;

import lombok.Data;

/**
 * Description: 传统没有使用建造者模式
 * <br/>
 * Computer
 *
 * @author laiql
 * @date 2021/3/31 10:52 下午
 */
@Data
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
    public Computer(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }
}
