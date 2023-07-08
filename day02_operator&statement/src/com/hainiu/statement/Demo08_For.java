package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description 需求：求1-100之间的偶数数据和，并把求和结果在控制台输出
 */
public class Demo08_For {
    public static void main(String[] args) {

        // 定义变量存储最终的累加结果
        int sum = 0;

        // 获取1-100的数据  fori + Enter
        /*for (int i = 1; i <= 100; i++) {
            // 符合条件的数据才累加求和
            if (i % 2 == 0) {
                sum += i;
            }
        }*/

        // 获取1-100的偶数
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }

        // 循环结束 所有的数据都累加完毕
        System.out.println(sum);
    }
}
