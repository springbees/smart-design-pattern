package com.smartfrank.pattern.flyweight.demo;

/**
 * Description: 享元角色抽象类
 * <br/>
 * Flyweight
 *
 * @author laiql
 * @date 2021/10/27 16:15
 */
public abstract class Flyweight {

    /**
     * 内部状态
     */
    private String intrinsic;

    /**
     * 外部状态
     */
    protected final String extrinsic;

    protected Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    /**
     * 抽象定义业务操作
     *
     * @param extrinsic
     */
    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
