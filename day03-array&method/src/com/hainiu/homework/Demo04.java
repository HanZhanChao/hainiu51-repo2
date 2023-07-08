package com.hainiu.homework;

/**
 * @author HaiNiu
 * @description
 *
 * 1 2 3 4 四个数据，从中选择3个数字 组成一个三位数，要求选择的数字不重复。这样的三位数有多少个？
 *
 *
 *
 */
public class Demo04 {
    public static void main(String[] args) {
        int count = 0;
        // 四个数据取三遍
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(i * 100 + j * 10 + k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
