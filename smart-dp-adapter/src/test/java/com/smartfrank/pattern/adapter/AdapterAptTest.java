package com.smartfrank.pattern.adapter;

import cn.hutool.json.JSONUtil;
import com.smartfrank.pattern.adapter.example.AdapterVoltage;
import com.smartfrank.pattern.adapter.example.SourceVoltage;
import com.smartfrank.pattern.adapter.example.TargetVoltage;
import com.smartfrank.pattern.adapter.message.Account;
import com.smartfrank.pattern.adapter.message.MessageAdapter;
import com.smartfrank.pattern.adapter.message.MessageInfo;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Description: 适配器模式测试用例
 * <br/>
 * AdapterAptTest
 *
 * @author laiql
 * @date 2021/10/22 9:52 下午
 */
public class AdapterAptTest {

    @Test
    public void adapterTest() throws ParseException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s.parse("2021-10-21 23:20:16");

        Account account = new Account();
        account.setNumber("100001");
        account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        account.setAccountDate(parse);
        account.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        MessageInfo rebateInfo01 = MessageAdapter.filter(account.toString(), link01);
        System.out.println("mq.account(适配前)" + account.toString());
        System.out.println("mq.account(适配后)" + JSONUtil.toJsonStr(rebateInfo01));

        System.out.println("");


        TargetVoltage targetVoltage = new AdapterVoltage(new SourceVoltage());
        System.out.println("输出电压：" + targetVoltage.convert() + "V");

    }
}
