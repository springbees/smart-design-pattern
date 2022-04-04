package com.smartfrank.pattern.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description: 抽奖结果
 * <br/>
 * LotteryResult
 *
 * @author laiql
 * @date 2021/11/3 10:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LotteryResult {

    /**
     * 用户ID
     */
    private String uId;
    /**
     * 抽奖信息
     */
    private String msg;
    /**
     * 业务时间
     */
    private Date dateTime;
}
