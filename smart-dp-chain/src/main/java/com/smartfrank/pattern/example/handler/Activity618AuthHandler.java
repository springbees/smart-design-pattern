package com.smartfrank.pattern.example.handler;

import com.smartfrank.pattern.example.AuthResult;
import com.smartfrank.pattern.example.Ratify;
import com.smartfrank.pattern.example.Request;
import lombok.extern.slf4j.Slf4j;

/**
 * Description: 活动618审批
 * <br/>
 * Activity618AuthHandler
 *
 * @author laiql
 * @date 2021/11/2 10:59
 */
@Slf4j
public class Activity618AuthHandler implements Ratify {
    @Override
    public AuthResult deal(Ratify.Chain chain) {
        Request request = chain.request();
        if (request.activityTime() <= 7) {
            Request buildRequest = new Request.Builder().newRequest(request).setLevelThree("3级审批 - " + "运营总监:[王五] - 审批意见:[同意]").build();
            log.info("活动状态:{}", buildRequest.toString());
        } else {
            log.info("活动状态:{}", request.toString());
            return new AuthResult(false, "审批失败！暂时不支持7天以上活动！");
        }
        return new AuthResult(true, "运营总监:[王五] - 审批意见:[同意]");
    }
}
