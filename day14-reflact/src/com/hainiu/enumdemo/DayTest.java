package com.hainiu.enumdemo;

/**
 * @author HaiNiu
 * @description
 */
public class DayTest {
    public static void main(String[] args) {


        // 枚举类名.枚举项
        Day day = Day.WEDNESDAY;
        System.out.println(day);

        switch (day) {
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
        }

    }
}
