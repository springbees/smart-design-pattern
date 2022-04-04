package com.smartfrank.pattern.example.handler;

import com.smartfrank.pattern.example.AuthResult;
import com.smartfrank.pattern.example.Ratify;
import com.smartfrank.pattern.example.Request;
import lombok.extern.slf4j.Slf4j;

/**
 * Description: 促销审批
 * <br/>
 * PromotionAuthHandler
 *
 * @author laiql
 * @date 2021/11/2 10:58
 */
@Slf4j
public class PromotionAuthHandler implements Ratify {
    @Override
    public AuthResult deal(Ratify.Chain chain) {
        Request request = chain.request();
        if (request.activityTime() > 3) {
            Request newRequest = new Request.Builder().newRequest(request).setLevelTwo("2级审批 - " + "运营经理:[李四] - 审批意见:[同意]").build();
            log.info("活动状态:{}", newRequest.toString());
            //交给三级人员审批
            return chain.proceed(newRequest);
        }
        return new AuthResult(true, "运营经理:[李四] - 审批意见:[同意]");
    }
}
