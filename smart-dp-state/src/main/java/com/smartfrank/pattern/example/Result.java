package com.smartfrank.pattern.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 统一响应结果
 * <br/>
 * Result
 *
 * @author laiql
 * @date 2021/11/9 8:55 下午
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {
    private String code;
    private String info;
}
