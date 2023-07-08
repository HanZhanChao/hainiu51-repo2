package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description
 *
 * 循环的嵌套层级不要太深
 */
public class Demo15_LoopLoop {

    public static void main(String[] args) throws InterruptedException {
        // 一天24个小时 重复
        for (int i = 0; i <= 23; i++) {
            // 一个小时有60分 重复
            for (int j = 0; j <= 59; j++) {
                // 一分钟有60秒 重复
                for (int k = 0; k <= 59; k++) {
                    System.out.println(i + "时" + j + "分" + k + "秒");
                    Thread.sleep(1000); // 休眠一秒钟
                }
            }
        }
    }

}
