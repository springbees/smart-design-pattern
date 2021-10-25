package com.smartfrank.pattern.adapter.demo;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
