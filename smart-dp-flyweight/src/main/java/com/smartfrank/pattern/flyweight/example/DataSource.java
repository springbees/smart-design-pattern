package com.smartfrank.pattern.flyweight.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 数据源对象定义
 * <br/>
 * DataSource
 *
 * @author laiql
 * @date 2021/10/27 17:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class DataSource {
    private String driveClassName;
    private String username;
    private String password;
}
