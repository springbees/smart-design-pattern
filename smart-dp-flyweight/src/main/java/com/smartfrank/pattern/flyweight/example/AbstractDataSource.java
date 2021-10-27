package com.smartfrank.pattern.flyweight.example;

/**
 * Description: 享元抽象数据源对象
 * <br/>
 * AbstractDataSource
 *
 * @author laiql
 * @date 2021/10/27 17:13
 */
public abstract class AbstractDataSource {

    protected DataSource dataSource;

    public AbstractDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //委派工作的类
    public abstract DataSource getDatasource();
}
