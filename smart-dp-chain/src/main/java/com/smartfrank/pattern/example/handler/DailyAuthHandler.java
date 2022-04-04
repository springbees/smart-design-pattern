package com.smartfrank.pattern.example.handler;

import com.smartfrank.pattern.example.AuthResult;
import com.smartfrank.pattern.example.Ratify;
import com.smartfrank.pattern.example.Request;
import lombok.extern.slf4j.Slf4j;

/**
 * Description: 日常授权审批
 * <br/>
 * DailyAuthHandler
 *
 * @author laiql
 * @date 2021/11/2 10:57
 */
@Slf4j
public class DailyAuthHandler implements Ratify {
    @Override
    public AuthResult deal(Chain chain) {
        Request request = chain.request();
        if (request.activityTime() > 1) {
            Request newRequest = new Request.Builder().newRequest(request).setLevelOne("1级审批 - " + "运营人员:[张三] - 审批意见:[同意]").build();
            log.info("活动状态:{}", newRequest.toString());
            //交给二级人员审批
            return chain.proceed(newRequest);
        }
        return new AuthResult(true, "运营人员:[张三] - 审批意见:[同意]");
    }
}
