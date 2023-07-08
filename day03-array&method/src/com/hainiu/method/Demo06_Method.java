package com.hainiu.method;

/**
 * @author HaiNiu
 * @description 同一个类中 方法名相同 参数列表不同 形成重载关系
 *
 * 好处：对于相似的功能，采用相同的名称，避免记忆大量的方法名。
 *
 */
public class Demo06_Method {
    public static void main(String[] args) {
        // 调用 -- 根据参数自动匹配
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(2.5, 3.5));

    }

    // 求两个整数的和
    public static int add(int a, int b) {
        return a + b;
    }

    // 求三个整数的和
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 求两个小数的和
    public static double add(double a, double b) {
        return a + b;
    }

    // 只有顺序不同 实际应用没有意义
    public static double add(double a, int b) {
        return a + b;
    }
    public static double add(int a, double b) {
        return a + b;
    }
}
