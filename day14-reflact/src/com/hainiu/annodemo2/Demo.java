package com.hainiu.annodemo2;

/**
 * @author HaiNiu
 * @description 标记注解
 */
public class Demo {

    public void fun() {
        System.out.println("fun");
    }

    @TestMethod
    public void method() {
        System.out.println("method");
    }

    public void hello() {
        System.out.println("hello");
    }

//    @TestMethod(value = "run")
    @TestMethod("run")
    public void world() {
        System.out.println("world");
    }

}
