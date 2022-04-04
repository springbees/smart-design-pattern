package com.smartfrank.pattern.prototype;

import java.math.BigDecimal;

/**
 * Description: 彩票功能接口
 * <br/>
 * ILotteryTicket
 *
 * @author laiql
 * @date 2021/4/11 10:11 下午
 */
public interface ILotteryTicket {

    /**
     * 期数
     *
     * @return
     */
    int numberOfPeriods();

    /**
     * 开奖号码
     *
     * @return
     */
    int winningNumbers();

    /**
     * 彩票名称
     *
     * @return
     */
    String lotteryName();

    /**
     * 奖池
     *
     * @return
     */
    BigDecimal prizePool();

}
