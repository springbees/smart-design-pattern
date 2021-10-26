package com.smartfrank.pattern.facade;

import com.smartfrank.pattern.facade.example.PayFacade;
import com.smartfrank.pattern.facade.example.WxPayComponent;
import com.smartfrank.pattern.facade.example.ZFBPayComponent;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Description: 外观模式测试用例
 * <br/>
 * FacadeTest
 *
 * @author laiql
 * @date 2021/10/22 9:59 下午
 */
public class FacadeTest {

    @Test
    public void facadeTest() {
        PayFacade payFacade = new PayFacade(new WxPayComponent("10001", new BigDecimal(10)),
                new ZFBPayComponent("10001", new BigDecimal(10)));
        payFacade.unifiedPayment();

    }
}
