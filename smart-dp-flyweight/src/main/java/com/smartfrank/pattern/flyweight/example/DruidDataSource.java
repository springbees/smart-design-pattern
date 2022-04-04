package com.smartfrank.pattern.flyweight.example;

/**
 * Description: 具体数据源对象
 * <br/>
 * DruidDataSource
 *
 * @author laiql
 * @date 2021/10/27 17:16
 */
public class DruidDataSource extends AbstractDataSource {

    public DruidDataSource(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public DataSource getDatasource() {
        System.out.println(super.dataSource.toString());
        return super.dataSource;
    }
}
