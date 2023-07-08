package com.hainiu.exam;

/**
 * @author HaiNiu
 * @description
 * 有一群猴子，摘到若干个桃子，当即吃了一半，还不过瘾，又多吃了一个；
 * 第二天又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天都吃掉前一天剩下的一半零一个。
 * 到第10天想再吃时，见只剩下一个桃子了。求第一天共摘了多少？
 *
 *
 * 前一天 = (当前天 + 1) * 2;
 *
 * 倒推
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        // 桃子数量
        int t = 1;
        // 天数
        int d = 10;
        // 第10天倒推回第1天
        for (int i = d; i >= 1; i--) {
            t = (t + 1) * 2;
        }
        System.out.println(t);
    }
}
