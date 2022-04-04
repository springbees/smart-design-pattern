package com.smartfrank.pattern.example.event.listener;

import com.smartfrank.pattern.example.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * Description: MQ消息监听
 * <br/>
 * MQEventListener
 *
 * @author laiql
 * @date 2021/11/3 10:22
 */
@Slf4j
public class MQEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        log.info("记录用户:{} -MQ- 抽奖结果:{}", lotteryResult.getUId(), lotteryResult.getMsg());
    }
}
