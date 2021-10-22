package com.smartfrank.pattern.adapter;

import cn.hutool.json.JSONUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Description: 消息适配器
 * <br/>
 * MessageAdapter
 *
 * @author laiql
 * @date 2021/10/21 10:23 下午
 */
public class MessageAdapter {

    public static MessageInfo filter(String message, Map<String,String> link) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        return filter(JSONUtil.toBean(message,Map.class),link);
    }

    /**
     * 将消息统一适配
     * @param obj
     * @param link
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static MessageInfo filter(Map obj, Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MessageInfo messageInfo = new MessageInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            MessageInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase()
                    + key.substring(1), String.class).invoke(messageInfo, val.toString());
        }
        return messageInfo;
    }
}
