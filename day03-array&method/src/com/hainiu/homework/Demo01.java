package com.hainiu.homework;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 * 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
 *       存期    年利率（%）
 *       一年    2.25
 *       两年    2.7
 *       三年    3.25
 *       五年    3.6
 * 请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
 * 提示：
 * 存入金额和存入年限均由键盘录入；
 * 本息计算方式：本金+本金×年利率×时间
 */
public class Demo01 {
    public static void main(String[] args) {
        // 键盘录入金额和年限
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您存钱的金额：");
        double money = sc.nextDouble();

        System.out.println("请输入您要存的年限：");
        int year = sc.nextInt();

        // 定义变量保存本息总额
        double totalMoney = money;

        // 对年限作出判断
        switch (year) {
            case 1:
                totalMoney += money * 0.0225 * year;
                break;
            case 2:
                totalMoney += money * 0.027 * year;
                break;
            case 3:
                totalMoney += money * 0.0325 * year;
                break;
            case 5:
                totalMoney += money * 0.036 * year;
                break;
            default:
                System.out.println("不存在这个年限的业务");
                break;
        }

        System.out.println(totalMoney);
    }
}
