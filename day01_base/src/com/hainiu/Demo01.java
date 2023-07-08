package com.hainiu;

/**
 * @author HaiNiu
 * @description 注释
 */
public class Demo01 {

    /*
        这是主方法
        是程序的入口方法
        程序从这个方法开始执行
     */
    public static void main(String[] args) {
        // 这是一条输出语句
        System.out.println("hello world");

        int sum = add(10, 20);
        System.out.println(sum);

    }

    /**
     * 实现两个整数想加
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 返回a和b的和
     */
    public static int add(int a, int b) {
        return a + b;
    }

}
