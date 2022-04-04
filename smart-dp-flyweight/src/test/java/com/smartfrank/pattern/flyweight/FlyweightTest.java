package com.smartfrank.pattern.flyweight;

import com.smartfrank.pattern.flyweight.example.AbstractDataSource;
import com.smartfrank.pattern.flyweight.example.DataSource;
import com.smartfrank.pattern.flyweight.example.DataSourceFactory;
import org.junit.Test;

/**
 * Description: 享元模式测试用例
 * <br/>
 * FlyweightTest
 *
 * @author laiql
 * @date 2021/10/22 10:01 下午
 */
public class FlyweightTest {

    @Test
    public void flyweightTest() {
        AbstractDataSource datasource = DataSourceFactory.getDatasource("K");
        datasource.getDatasource();
        DataSourceFactory.getDatasource("K").getDatasource();
        DataSourceFactory.getDatasource("Y").getDatasource();
    }
}
