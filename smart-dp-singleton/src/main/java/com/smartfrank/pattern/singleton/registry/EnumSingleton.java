package com.smartfrank.pattern.singleton.registry;

/**
 * Description: 枚举单例
 * <br/>
 * EnumSingleton
 *
 * @author laiql
 * @date 2021/10/22 9:15 下午
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    /**
     * 对外提供调用
     */
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
