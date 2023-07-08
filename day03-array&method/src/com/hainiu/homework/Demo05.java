package com.hainiu.homework;

/**
 * @author HaiNiu
 * @description
 * 20元，买可乐，3元一瓶，一个空瓶子能退1元，请问能买多少瓶？？ 不允许赊账。
 */
public class Demo05 {
    public static void main(String[] args) {
        // 定义变量表示数据
        int money = 20;
        int cola = 3;
        int ping = 1;

        int count = 0;

        // 循环 -- 只要钱够买，继续买
        while (money >= cola) {
            // 本次够买几瓶
            int t = money / cola;
            count += t;
            // 本次剩余
            money = money % cola;
            // 退瓶子
            money = money + t * ping;
        }

        System.out.println(count);

    }
}
