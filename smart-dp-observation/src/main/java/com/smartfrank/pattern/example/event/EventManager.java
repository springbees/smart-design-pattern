package com.smartfrank.pattern.example.event;

import com.smartfrank.pattern.example.LotteryResult;
import com.smartfrank.pattern.example.event.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: 事件处理器
 * <br/>
 * EventManager
 *
 * @author laiql
 * @date 2021/11/3 10:19
 */
public class EventManager {

    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * 订阅
     *
     * @param eventType 事件类型
     * @param listener  监听器
     */
    public void subscribe(Enum<EventType> eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.add(listener);
    }


    /**
     * 取消订阅
     *
     * @param eventType 事件类型
     * @param listener  监听
     */
    public void unsubscribe(Enum<EventType> eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(listener);
    }

    /**
     * 通知
     *
     * @param eventType     事件类型
     * @param lotteryResult 通知结果
     */
    public void notify(Enum<EventType> eventType, LotteryResult lotteryResult) {
        List<EventListener> eventListeners = listeners.get(eventType);
        for (EventListener eventListener : eventListeners) {
            eventListener.doEvent(lotteryResult);
        }
    }


    /**
     * 事件类型枚举
     */
    public enum EventType {
        MQ, MESSAGE
    }


}
