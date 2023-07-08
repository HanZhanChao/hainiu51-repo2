package com.hainiu.statement;

import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 *
 * 对几个固定的值作出判断
 * switch (表达式) {
 * 	case 值1:
 * 		语句体1;
 * 		break;
 * 	case 值2:
 * 		语句体2;
 * 		break;
 * 	...
 * 	default:
 * 		语句体n+1;
 * 		break;
 * }
 *
 * 首先计算表达式的值：int、枚举、String；
 * 使用这个值从上往下依次匹配每个case 后面的值；
 *      如果匹配，就执行该case所控制的语句体；
 *      如果都不匹配，执行最终的default语句；
 *  遇到break关键字，就跳出switch语句
 *
 *
 */
public class Demo04_Switch {

    public static void main(String[] args) {
        // 对输入的数字进行判断，输出相应的满意度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的满意度（1-4）：");
        int num = sc.nextInt();

        // 对4种固定的情况作出判断
        switch (num) {
            case 1:
                System.out.println("非常满意");
                break;
            case 2:
                System.out.println("基本满意");
                break;
            case 3:
                System.out.println("不太满意");
                break;
            case 4:
                System.out.println("非常不满意");
                break;
            default:
                System.out.println("您输入的满意度有误");
                break;
        }
    }
}
