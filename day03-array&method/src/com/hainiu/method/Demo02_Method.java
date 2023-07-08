package com.hainiu.method;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02_Method {
    public static void main(String[] args) {
        // 调用
        print99();

        print99();

    }

    // 定义方法打印九九乘法表
    public static void print99() {
        // 9行
        for (int i = 1; i <= 9; i++) {
            // 每一行的列
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }

}
