package com.smartfrank.pattern.example.event.listener;

import com.smartfrank.pattern.example.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * Description: 短信事件监听
 * <br/>
 * MessageEventListener
 *
 * @author laiql
 * @date 2021/11/3 10:24
 */
@Slf4j
public class MessageEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        log.info("记录用户:{} -Message- 抽奖结果:{}", lotteryResult.getUId(), lotteryResult.getMsg());
    }
}
