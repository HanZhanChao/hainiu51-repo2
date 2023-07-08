package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description
 * 水仙花数，指的是一个三位数，个位、十位、百位的数字立方和等于原数
 * 例如`153  3*3*3 + 5*5*5 + 1*1*1 = 153`
 *
 * 统计水仙花数个数
 */
public class Demo09_For {
    public static void main(String[] args) {

        // 计数器
        int count = 0;

        // 获取所有的三位数
        for (int i = 100; i <= 999; i++) {
            // 获取每一位数字进行判断
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            // 个位、十位、百位的数字立方和等于原数
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                System.out.println(i);
                // 找到一个符合要求的数据，计数器就累计一个
                count++;
            }
        }
        // 循环结束，计数器就记录了有多少个
        System.out.println("水仙花数有：" + count + "个");
    }
}
