package com.hainiu.recursion;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {

    public static void main(String[] args) {

        System.out.println(lx(0, 0));

    }

    // 0 0    4  4
    public static int lx(int x, int y) {
        if (x == 4 || y == 4) {
            return 1;
        }
        // 当前点的最优路线 = 右边和下面点的最优路线之和
        return lx(x + 1, y) + lx(x, y + 1);
    }
}
