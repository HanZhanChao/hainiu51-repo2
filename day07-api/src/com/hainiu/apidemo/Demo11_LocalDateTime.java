package com.hainiu.apidemo;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author HaiNiu
 * @description
 *
 * LocalDateTime 日期和时间
 * LocalDate
 * LocalTime
 *
 * 4、与字符串之间的互换
 *      格式化    解析
 */
public class Demo11_LocalDateTime {
    public static void main(String[] args) throws ParseException {
        // 当前系统时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 按照我们需要的模式格式化
        // public static DateTimeFormatter ofPattern(String pattern)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化 public String format(TemporalAccessor temporal)
        String s = formatter.format(now);
        System.out.println(s);

        System.out.println("-----------");

        // 解析 用LocalDateTime类中  获取自己的对象的一种方式
        String str = "2023-05-16 15:16:04";
        // parse方法 第一个参数是要解析的字符串  第二个参数是与这个字符串相同的模式
        LocalDateTime dateTime = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateTime);
    }
}
