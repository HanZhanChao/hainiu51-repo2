package com.hainiu.apidemo;

import javax.sound.sampled.SourceDataLine;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description
 * LocalDateTime 日期和时间
 * LocalDate
 * LocalTime
 * <p>
 * 5、时间间隔
 * Period
 * Duration
 */
public class Demo12_LocalDateTime {
    public static void main(String[] args) throws ParseException {
        // 当前系统日期
        LocalDate now = LocalDate.now();
        System.out.println(now);
        // 指定日期
        LocalDate date = LocalDate.of(2000, 1, 1);

        // 时间间隔
        Period period = Period.between(date, now);

        System.out.println(period);

        int years = period.getYears();
        System.out.println(years);
        int months = period.getMonths();
        System.out.println(months);
        int days = period.getDays();
        System.out.println(days);

       /* // 当前时间
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime date = LocalDateTime.of(2000, 1, 1, 10, 10 ,10);
        // 时间间隔
        Duration duration = Duration.between(date, now);

        // 获取秒
        long seconds = duration.getSeconds(); // 间隔的秒数
        System.out.println(seconds);

        // 获取两个时间对象间隔的天数
        long days = duration.toDays();
        System.out.println(days);

        long millis = duration.toMillis();
        System.out.println(millis);

        long nanos = duration.toNanos();
        System.out.println(nanos);*/

    }
}
