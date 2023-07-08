package com.hainiu.apidemo;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author HaiNiu
 * @description
 */
public class Demo09_Date {
    public static void main(String[] args) throws ParseException {
        // 当前系统时间
        Date date = new Date();
        System.out.println(date); // Tue May 16 14:39:27 CST 2023

       /*
       int year = date.getYear();
        System.out.println(year);
        */

        // 日期的格式化（将日期对象按照模式转换成字符串）和解析（把字符串解析为日期对象）
        // SimpleDateFormat(String pattern)
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = format.format(date);
        System.out.println(s);

        System.out.println("----------");
        String str = "1999-09-09 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(str);
        System.out.println(d);
    }
}
