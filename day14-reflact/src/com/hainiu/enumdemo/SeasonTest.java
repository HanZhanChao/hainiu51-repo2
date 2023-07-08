package com.hainiu.enumdemo;

/**
 * @author HaiNiu
 * @description
 */
public class SeasonTest {
    public static void main(String[] args) {

        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        int index = Season.SUMMER.ordinal();
        System.out.println(index);

        Season s = Season.valueOf("AUTUMN");
        System.out.println(s);


        int i = Season.AUTUMN.compareTo(Season.SUMMER);
        System.out.println(i);

        System.out.println("--------");

        System.out.println(Season.WINTER.getName());

    }
}
