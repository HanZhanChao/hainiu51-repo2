package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description 格式：
 * if (布尔表达式) {
 * 语句体;
 * }
 * 对一种情况作出判断，如果满足条件就执行if控制的语句，否则就什么都不做
 */
public class Demo01_If {

    public static void main(String[] args) {
        System.out.println("程序开始执行");

        int age = 17;

        /*if (age >= 18) {
            System.out.println("可以去闯荡世界");
        }*/

        // 如果if语句控制的语句体只有一条语句，那么{}可以省略
        if (age >= 18)
            System.out.println("可以去闯荡世界");
        System.out.println("程序结束执行");
    }

}
