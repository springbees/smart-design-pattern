package com.smartfrank.pattern.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 授权结果
 * <br/>
 * AuthResult
 *
 * @author laiql
 * @date 2021/11/2 10:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResult {
    private boolean isRatify;
    private String info;
}
