package com.hainiu.exam;

/**
 * @author HaiNiu
 * @description
 * 一个小球从高处落下，落地后反弹的高度是原来高度的一半，然后再次落下。
 * 请编写程序计算，如果小球的原始高度为100米，那么在第10次落地后，反弹高度是多少？
 * 在第10次反弹到达最高点时，经过的总路程是多少？
 *
 *
 */
public class Demo01 {

    public static void main(String[] args) {
        // 原始高度
        double h = 100;
        // 次数
        int time = 10;
        // 总路程
        double total = 0;

        for (int i = 1; i <= time; i++) {
            // 落下
            total += h;
            // 反弹
            h /= 2;
            // 再加上反弹的高度
            total += h;
        }
        System.out.println(h);
        System.out.println(total);
    }
}
