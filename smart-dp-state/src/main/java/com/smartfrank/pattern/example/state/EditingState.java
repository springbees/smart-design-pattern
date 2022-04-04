package com.smartfrank.pattern.example.state;

import com.smartfrank.pattern.example.AbstractState;
import com.smartfrank.pattern.example.Context;
import com.smartfrank.pattern.example.Result;

/**
 * Description: 编辑提审核
 * <br/>
 * EditingState
 *
 * @author laiql
 * @date 2021/11/9 9:47 下午
 */
public class EditingState extends AbstractState {
    @Override
    public Result activityReview(Context context) {
        return new Result("0000", "活动提审成功");
    }
}
