package com.hainiu;

/**
 * @author HaiNiu
 * @description
 * 一个小球从高处落下，落地后反弹的高度是原来高度的一半，然后再次落下。请编写程序计算，如果小球的原始高度为100米，
 * 那么在第10次落地后，反弹高度是多少？在第10次反弹到达最高点时，经过的总路程是多少？
 */
public class Test01 {
    public static void main(String[] args) {
        // 原始高度
        double height = 100;
        // 总路程
        double total = 0;
        // 循环10次
        for (int i = 1; i <= 10; i++) {
            // 下降高度
            total += height;
            // 反弹高度
            height /= 2;
            System.out.println("第" + i + "次反弹高度是：" + height);
            // 加上反弹路程
            total += height;
        }
        System.out.println(total);
    }
}
