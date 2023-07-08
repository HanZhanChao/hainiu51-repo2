package com.hainiu.exception;

/**
 * @author HaiNiu
 * @description
 * 1、自定义异常类 以Exception作为结尾  见名知意
 * 2、继承异常体系的一个类，一般情况下继承自RuntimeException
 * 3、提供构造方法
 */
public class AgeOutOfBoundsException extends RuntimeException {

    public AgeOutOfBoundsException() {
    }

    // 参数的意思时 创建异常对象时传递的异常信息
    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
