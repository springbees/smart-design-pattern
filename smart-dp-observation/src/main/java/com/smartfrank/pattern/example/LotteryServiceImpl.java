package com.smartfrank.pattern.example;

import java.util.Date;

/**
 * Description: 实现抽奖业务
 * <br/>
 * LotteryServiceImpl
 *
 * @author laiql
 * @date 2021/11/3 11:10
 */
public class LotteryServiceImpl extends LotteryService {
    private LuckDrawService luckDrawService = new LuckDrawService();

    @Override
    protected LotteryResult doDraw(String uId) {
        return new LotteryResult(uId, luckDrawService.lottery(uId), new Date());
    }
}
