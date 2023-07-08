package com.hainiu.operator;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 * 我们使用的历法中年份有闰年和平年之分，平年一年365天，闰年多出一天，这是为了弥补历法规定造成的年度天数与地球实际公转周期的时间差而设立的。
 * 判定闰年的规则是：四年一闰，百年不闰，四百年再闰。
 * 也就是说，如果年份不是世纪年（被100整除的年份），那么需要被4整除；如果是世纪年，则需要被400整除。
 * 请通过键盘录入一个年份，判断该年份是否是闰年？
 */
public class Test04_Operator {

    public static void main(String[] args) {

        // 键盘录入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();

        // 判断  逻辑运算符连接多个条件
        System.out.println(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));

    }

}
