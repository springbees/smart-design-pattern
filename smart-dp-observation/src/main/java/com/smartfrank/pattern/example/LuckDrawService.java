package com.smartfrank.pattern.example;

/**
 * Description: 抽奖业务
 * <br/>
 * LuckDrawService
 *
 * @author laiql
 * @date 2021/11/3 14:26
 */
public class LuckDrawService {

    /**
     * 模拟抽奖
     * @param uId
     * @return
     */
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编码[".concat(uId).concat("]").concat("在本次活动中奖") : "很遗憾，编码[".concat(uId).concat("]").concat("在本次抽奖未中奖！");
    }
}
