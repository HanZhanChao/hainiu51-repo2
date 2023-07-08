package com.hainiu.operator;

/**
 * @author HaiNiu
 * @description
 *
 * alt + enter 代码修复快捷键
 *
 * | &&   | 逻辑与 | 对两个布尔表达式执行条件与操作 |
 * | ---- | ------ | ------------------------------ |
 * | || | 逻辑或 | 对两个布尔表达式执行条件或操作 |
 *
 */
public class Demo04_Operator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        // 逻辑与，只有两个条件都为真，结果才真。
        // 与运算的短路：如果左边的表达式为false，右边不参与运算
        System.out.println(a > b && a > c); // false && false
        System.out.println(a > b && a < c); // false && true
        System.out.println(a < b && a > c); // true && false
        System.out.println(a < b && a < c); // true && true

        System.out.println("===========");
        // 逻辑或，只有两个条件都为假，结果才假。
        // 或运算的短路：如果左边的表达式为true，右边不参与运算
        System.out.println(a > b || a > c); // false || false
        System.out.println(a > b || a < c); // false || true
        System.out.println(a < b || a > c); // true || false
        System.out.println(a < b || a < c); // true || true

        System.out.println("===========");
        System.out.println(!(a > b));

        System.out.println("===========");
        int x = 10;
        int y = 10;
        System.out.println(x++ > 10 & y-- < 10); // 单与 不具备短路
        System.out.println(x);
        System.out.println(y);


    }
}
