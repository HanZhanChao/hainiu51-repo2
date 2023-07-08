package com.hainiu.recursion;

/**
 * @author HaiNiu
 * @description
 *
 * 递归算法：通过重复将问题分解为同类的子问题而解决问题的方法。当子问题得到答案，原问题就可以反推得到解答。
 * 求5的阶乘：
 *      5! = 5 * 4!
 *          4! = 4 * 3!
 *              3! = 3 * 2!
 *                  2! = 2 * 1!
 *                  2! = 2 * 1 = 2
 *              3! = 3 * 2 = 6
 *          4! = 4 * 6 = 24
 *      5! = 5 * 24 = 120
 *
 * 语法：方法内部调用自己
 *
 * 递归：
 *      分解的规律
 *      出口 -- 分解若干次之后 停止
 *
 * 简洁的代码表示重复的复杂逻辑
 *
 *      注意：递归的层级不能太深
 *
 */
public class Demo01 {

    public static void main(String[] args) {

        System.out.println(jc(5));

    }

    // 求n的阶乘
    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return jc(n - 1) * n;
        }
    }
}
