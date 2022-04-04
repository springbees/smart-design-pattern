package com.smartfrank.pattern.proxy.example;

/**
 * Description: 查询dao接口
 * <br/>
 * IUserDao
 *
 * @author laiql
 * @date 2021/11/1 11:22
 */
public interface IUserDao {

    @Select("select username from t_user where id = #{uId}")
    String queryUserInfo(String uId);
}
