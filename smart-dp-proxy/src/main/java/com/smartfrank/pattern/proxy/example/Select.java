package com.smartfrank.pattern.proxy.example;

import java.lang.annotation.*;

/**
 * Description: 查询注解
 * <br/>
 * Select
 *
 * @author laiql
 * @date 2021/11/1 11:18
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {

    /**
     * sql语句
     * @return
     */
    String value() default "";
}
