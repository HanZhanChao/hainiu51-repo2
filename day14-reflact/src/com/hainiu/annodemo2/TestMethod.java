package com.hainiu.annodemo2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 定义注解 -- 实现的作用是 在方法上标记注解  并且元素值是run  这个方法才能运行
@Retention(RetentionPolicy.RUNTIME) // 存活到运行期
@Target(ElementType.METHOD) // 只允许使用在方法上
public @interface TestMethod {
    String value() default "";
}
