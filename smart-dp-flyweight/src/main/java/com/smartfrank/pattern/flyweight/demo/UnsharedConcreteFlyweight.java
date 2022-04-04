package com.smartfrank.pattern.flyweight.demo;

/**
 * Description: 指那些不需要共享的Flyweight子类
 * <br/>
 * UnsharedConcreteFlyweight
 *
 * @author laiql
 * @date 2021/10/27 16:20
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    protected UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
