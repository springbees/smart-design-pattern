package com.smartfrank.pattern.example.event.listener;

import com.smartfrank.pattern.example.LotteryResult;

/**
 * Description: 定义事件监听接口
 * <br/>
 * EventListener
 *
 * @author laiql
 * @date 2021/11/3 10:10
 */
public interface EventListener {

    void doEvent(LotteryResult lotteryResult);
}
