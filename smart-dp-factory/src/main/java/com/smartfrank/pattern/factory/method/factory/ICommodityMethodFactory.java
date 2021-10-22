package com.smartfrank.pattern.factory.method.factory;


import com.smartfrank.pattern.factory.method.IExchange;

/**
 * Description: 创建工厂方法
 * <br/>
 * ICommodityMethodFactory
 *
 * @author laiql
 * @date 2021/3/16 10:16 下午
 */
public interface ICommodityMethodFactory {

    /**
     * 创建业务工厂接口
     *
     * @return
     */
    IExchange create();
}
