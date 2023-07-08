package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description 九九乘法表
 * <p>
 * 1*1=1
 * 1*2=2 2*2=4
 * 1*3=3 2*3=6 3*3=9
 * 。。。
 */
public class Demo16_LoopLoop {

    public static void main(String[] args) {

        /*
        System.out.println(111); // 打印并换行
        System.out.print(111); // 打印不换行
        */

        // 表达式有9行 需要循环
        for (int i = 1; i <= 9; i++) {
            // 每一行有多个表达式，又是重复的动作
            // 每一行的式子 有行数个
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t"); // 使用制表符tab分隔
            }
            // 内存的循环结束一轮 说明一行打印完毕
            System.out.println();
        }
    }

}
