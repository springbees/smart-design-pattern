package com.smartfrank.pattern.prototype.twocolor;

import java.math.BigDecimal;

/**
 * Description: 彩票开奖执行器
 * <br/>
 * LotteryActuator
 *
 * @author laiql
 * @date 2021/10/22 9:28 下午
 */
public class LotteryActuator {

    private TwoColorLotteryTicket lotteryTicket = new TwoColorLotteryTicket();

    /**
     * 开奖器
     *
     * @param numberOfPeriods
     * @param prizePool
     * @param lotteryName
     */
    public String draw(int numberOfPeriods, BigDecimal prizePool, String lotteryName) throws Exception {
        Thread.sleep(3000);
        return createLotteryTicket(numberOfPeriods, prizePool, lotteryName);
    }

    /**
     * 创建每一期彩票对象
     *
     * @param numberOfPeriods
     * @param prizePool
     * @param lotteryName
     * @return
     */
    private String createLotteryTicket(int numberOfPeriods, BigDecimal prizePool, String lotteryName) throws CloneNotSupportedException {
        TwoColorLotteryTicket lotteryTicket = (TwoColorLotteryTicket) this.lotteryTicket.clone();
        lotteryTicket.setNumberOfPeriods(numberOfPeriods);
        lotteryTicket.setLotteryName(lotteryName);
        lotteryTicket.setPrizePool(prizePool);
        return lotteryTicket.toString();
    }
}
