package com.hainiu.method;

import java.util.Random;

/**
 * @author HaiNiu
 * @description
 * 请定义方法实现，获取[1-100]之间的随机数。
 * 参数 不需要
 * 返回值 int
 */
public class Demo04_Method {
    public static void main(String[] args) {
        // 调用有返回值的方法
        int i = getRandomNumber();
        System.out.println(i);
    }


    public static int getRandomNumber() {
        // Random类实现了这个功能  在自己的方法中调用别人的方法
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        return num;
    }

}
