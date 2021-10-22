package com.smartfrank.pattern.builder.internalexample;

import lombok.Data;

/**
 * Description: 使用构造模式的方式
 * <br/>
 * NewComputer
 *
 * @author laiql
 * @date 2021/3/31 10:53 下午
 */
@Data
public class NewComputer {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public NewComputer() {
        throw new RuntimeException("can't init");
    }

    private NewComputer(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder {

        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {
        }

        public Builder cpu(String value) {
            cpu = value;
            return this;
        }

        public Builder screen(String value) {
            screen = value;
            return this;
        }

        public Builder memory(String value) {
            memory = value;
            return this;
        }

        public Builder mainboard(String value) {
            mainboard = value;
            return this;
        }

        public NewComputer build() {
            return new NewComputer(this);
        }
    }
}
