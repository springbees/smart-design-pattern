package com.smartfrank.pattern.prototype.twocolor;

import com.smartfrank.pattern.prototype.ILotteryTicket;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Description: 双色球彩票产品
 * <br/>
 * TwoColorLotteryTicket
 *
 * @author laiql
 * @date 2021/4/11 10:17 下午
 */
@Getter
@Setter
public class TwoColorLotteryTicket implements ILotteryTicket, Cloneable {

    /**
     * 期数
     */
    private int numberOfPeriods;
    /**
     * 奖池
     */
    private BigDecimal prizePool;

    /**
     * 彩票双色球
     */
    private String lotteryName;

    @Override
    public int numberOfPeriods() {
        return this.numberOfPeriods;
    }

    @Override
    public int winningNumbers() {
        //随机生成&位中奖号码
        return (int) ((Math.random() * 9 + 1) * 1000000);
    }

    @Override
    public String lotteryName() {
        return this.lotteryName;
    }

    @Override
    public BigDecimal prizePool() {
        return this.prizePool;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        TwoColorLotteryTicket cloneObject = (TwoColorLotteryTicket) super.clone();
        return cloneObject;
    }


    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("\r\n------------------------------------------------------\r\n" +
                "彩票产品:" + this.lotteryName() + "\r\n" +
                "彩票期数：" + this.numberOfPeriods() + "\r\n" +
                "开奖号码：" + this.winningNumbers() + "\r\n" +
                "奖池：" + this.prizePool() + "元\r\n");
        return detail.toString();
    }
}
