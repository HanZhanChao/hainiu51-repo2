package com.hainiu.annodemo;

import java.lang.annotation.*;

// 定义注解
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@Inherited
public @interface Test {

    // 注解中的元素
    String author() default "";
    String date() default "1970-1-1";
    int version() default 1;
    String[] reviewers() default {};

    String[] value();

}
