package com.hainiu.apidemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author HaiNiu
 * @description
 *
 * LocalDateTime 日期和时间
 * LocalDate 日期
 * LocalTime 时间
 *
 * 1、创建对象
 * 2、获取日期某个字段的值
 * 3、将日期对象中的某个字段的值推移指定的时间
 */
public class Demo10_LocalDateTime {
    public static void main(String[] args) throws ParseException {
        // 当前系统时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 指定时间
        LocalDateTime dateTime = LocalDateTime.of(2088, 8, 8, 10, 10, 10);
        System.out.println(dateTime);

        // 获取日期中某个字段的值
        int year = now.getYear();
        System.out.println(year);

        int month = now.getMonthValue();
        System.out.println(month);

        int day = now.getDayOfMonth();
        System.out.println(day);

        int hour = now.getHour();
        System.out.println(hour);

        int minute = now.getMinute();
        System.out.println(minute);

        int second = now.getSecond();
        System.out.println(second);

        System.out.println("-----------");

        // 向未来 正数   向过去 负数
        LocalDateTime localDateTime = now.plusDays(100);
        System.out.println(localDateTime);
    }
}
