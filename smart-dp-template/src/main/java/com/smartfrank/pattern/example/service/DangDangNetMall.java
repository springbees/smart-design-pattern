package com.smartfrank.pattern.example.service;

import cn.hutool.json.JSONUtil;
import com.smartfrank.pattern.example.AbstractNetMall;
import com.smartfrank.pattern.example.util.HttpClient;
import sun.misc.BASE64Encoder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description: 模拟当当商城实现
 * <br/>
 * DangDangNetMall
 *
 * @author laiql
 * @date 2021/11/5 11:53
 */
public class DangDangNetMall extends AbstractNetMall {

    public DangDangNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    public Boolean login(String uId, String uPwd) {
        logger.info("模拟当当用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    public Map<String, String> reptile(String skuUrl) {
        String str = HttpClient.doGet(skuUrl);
        Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        if (m9.find()) {
            map.put("name", m9.group());
        }
        map.put("price", "4548.00");
        logger.info("模拟当当商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    public String createBase64(Map<String, String> goodsInfo) {
        BASE64Encoder encoder = new BASE64Encoder();
        logger.info("模拟生成当当商品base64海报");
        return encoder.encode(JSONUtil.toJsonStr(goodsInfo).getBytes());
    }

}
