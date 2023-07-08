package com.hainiu.statement;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description case穿透现象
 *  如果省略了switch语句中break，一旦匹配，下一个条件将不做判断，直接进入执行。
 *
 *  一年有12个月，分属于春夏秋冬4个季节，键盘录入一个月份，请用程序实现判断该月份属于哪个季节，并输出。
 *
 */
public class Demo05_Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();

        // 对月份作判断
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入的月份有误");
                break;
        }

    }

}
