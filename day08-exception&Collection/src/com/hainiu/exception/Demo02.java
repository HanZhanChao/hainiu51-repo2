package com.hainiu.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author HaiNiu
 * @description
 *
 * 编译时异常：
 *      声明异常 -- 抛出去
 *          在方法声明的后面 用 throws关键字 声明当前方法内出现的异常
 *          声明编译时异常，可以使得编译通过。如果没问题，代码正常执行；如果出现异常，最终抛给了JVM。
 *
 *      捕获异常 -- 抓起来
 *          try {
 *              // 可能出现异常的代码
 *          } catch (捕获的异常类型 变量名) {
 *              // 异常处理的代码
 *          }
 *          捕获编译时异常，不但可以是编译通过，真正的处理了异常。
 *
 * 运行时异常，如果需要处理，只能try。。。catch  为了后续代码能正常执行
 * 编译时异常，抛出为了编译通过；捕获还可以让后续代码能够执行。
 *
 */
public class Demo02 {

    public static void main(String[] args)  {

        test();

        System.out.println("这能执行吗？");
    }


    public static void test() {
        // 解析字符串得到日期对象
        String str = "1999-09-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);
    }




}
