package com.smartfrank.pattern.example;

import com.smartfrank.pattern.example.event.EventManager;
import com.smartfrank.pattern.example.event.listener.MQEventListener;
import com.smartfrank.pattern.example.event.listener.MessageEventListener;

/**
 * Description: 抽奖业务抽象类定义
 * <p>
 * <br/>
 * LotteryService
 *
 * @author laiql
 * @date 2021/11/3 11:04
 */
public abstract class LotteryService {
    private EventManager eventManager;

    public LotteryService() {
        //初始化事件处理器
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.MESSAGE);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.MESSAGE, new MessageEventListener());
    }

    /**
     * 抽奖后通知事件类型
     *
     * @param uId 用户id
     * @return
     */
    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        //调用通知
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        eventManager.notify(EventManager.EventType.MESSAGE, lotteryResult);
        return lotteryResult;
    }

    /**
     * 真正执行抽奖业务
     *
     * @param uId
     * @return
     */
    protected abstract LotteryResult doDraw(String uId);
}
