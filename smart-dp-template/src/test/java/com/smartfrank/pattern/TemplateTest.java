package com.smartfrank.pattern;

import com.smartfrank.pattern.example.AbstractNetMall;
import com.smartfrank.pattern.example.service.JDNetMall;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Description: 模板模式测试
 * <br/>
 * TemplateTest
 *
 * @author laiql
 * @date 2021/11/5 9:41
 */
@Slf4j
public class TemplateTest {

    @Test
    public void test() {
        AbstractNetMall abstractNetMall = new JDNetMall("1000001", "*******");
        String base64 = abstractNetMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
        log.info("测试结果：{}", base64);
    }
}
