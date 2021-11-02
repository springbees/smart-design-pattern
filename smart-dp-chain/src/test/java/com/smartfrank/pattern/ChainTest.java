package com.smartfrank.pattern;

import com.smartfrank.pattern.example.AuthResult;
import com.smartfrank.pattern.example.ChainOfResponsibilityClient;
import com.smartfrank.pattern.example.Request;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ChainTest {

    @Test
    public void test() {
        //构造活动
        Request request = new Request.Builder().setActivityId("0000000000001")
                .setActivityName("618大促销")
                .setactivityTime(6).build();
        ChainOfResponsibilityClient chain = new ChainOfResponsibilityClient();
        AuthResult authResult = chain.execute(request);
        log.info("执行结果:{}", authResult);
    }
}
