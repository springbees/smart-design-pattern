package com.smartfrank.pattern.flyweight.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description: 数据源工厂类
 * <br/>
 * DataSourceFactory
 *
 * @author laiql
 * @date 2021/10/27 17:17
 */
public class DataSourceFactory {

    private static Map<String, DruidDataSource> POOL = new ConcurrentHashMap<>(265);

    public static AbstractDataSource getDatasource(String key) {
        if (!POOL.containsKey(key)) {
            DataSource dataSource = new DataSource();
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            dataSource.setDriveClassName("com.mysql.jdbc.Drive");
            POOL.put(key, new DruidDataSource(dataSource));
            System.out.print("创建 " + key + " 并从池中取出---->");
            return POOL.get(key);
        }
        System.out.print("已有 " + key + " 直接从池中取---->");
        return POOL.get(key);
    }
}
