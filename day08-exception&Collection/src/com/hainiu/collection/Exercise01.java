package com.hainiu.collection;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author HaiNiu
 * @description 双色球 随机生成一注双色球
 * 红球：将可选的号码都放进集合 随机取1个 取出来的删除
 */
public class Exercise01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1-33
        for (int i = 1; i <= 33; i++) {
            list.add(i);
        }

        Random random = new Random();

        System.out.print("红球为：");
        // 循环取6次
        for (int i = 0; i < 6; i++) {
            // 随机获取一个索引
            int index = random.nextInt(list.size());
            System.out.print(list.get(index) + "\t");
            // 删除
            list.remove(index);
        }
        // 篮球
        int blue = random.nextInt(16) + 1;
        System.out.println("篮球是：" + blue);
    }
}
