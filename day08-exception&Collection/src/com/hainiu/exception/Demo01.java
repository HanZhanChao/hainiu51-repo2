package com.hainiu.exception;

/**
 * @author HaiNiu
 * @description
 *
 * 运行时异常
 *      声明异常 -- 抛出去
 *          在方法声明的后面 用 throws关键字 声明当前方法内出现的异常
 *          声明运行时异常，没有意义 -- 需要改代码
 *
 *
 *      捕获异常 -- 抓起来
 *          try {
 *              // 可能出现异常的代码
 *          } catch (捕获的异常类型 变量名) {
 *              // 异常处理的代码
 *          }
 *          捕获异常，如果没问题，那么try中的代码正常执行完毕；
 *          如果出现问题，并且能够被捕获，那么try中后续代码将不再执行，进入catch语句执行；
 *          捕获异常后，不会影响后续代码的执行。
 *
 */
public class Demo01 {

    public static void main(String[] args) {


        test();

        System.out.println("这能执行吗？");
    }


    public static void test() {

        int[] arr = new int[3];
        // 当程序出现异常时，JVM会自动创建一个该异常的对象
        try {
            System.out.println(arr[3]);
            // 抛出什么异常就抓什么异常  或者捕获这个异常的父类
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            // 当程序出现异常时，JVM会自动创建一个该异常的对象，catch语句捕获这个对象
            System.out.println(e);
        }
    }


    // 告知调用者 方法内可能出现的问题
    /*public static void test() throws ArrayIndexOutOfBoundsException {

        int[] arr = new int[3];
        // 当程序出现异常时，JVM会自动创建一个该异常的对象
        System.out.println(arr[2]);

    }*/

}
