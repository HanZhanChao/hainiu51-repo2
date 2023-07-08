package com.hainiu.stringdemo;

/**
 * @author HaiNiu
 * @description
 *
 *
 * Java是一种面向对象的编程语言。
 *
 * 分布性：Java设计成支持在网络上应用，它是分布式语言。编译和解释性：Java编译程序生成字节码，而不是通常的机器码，这使得Java开发程序比用其他语言开发程序快很多。稳健性：Java刚开始被设计出来就是为了写高可靠和稳健的软件的。安全性：Java的存储分配模型是它防御恶意代码的主要方法之一。可移植性：Java并不依赖平台，用Java编写的程序可以运用到任何操作系统上。
 *
 * 统计这段文本中的单词Java出现了多少次？
 * 1、循环查找 将查过的部分截取掉 直到所有字符查找完毕
 *
 * 2、循环查找，改变查询的范围，而不是截取子串
 *
 */
public class Demo09 {

    public static void main(String[] args) {
        String str = "分布性：Java" +
                "设计成支持在网络上应用，它是分布式语言。编译和解释性：Java" +
                "编译程序生成字节码，而不是通常的机器码，这使得Java" +
                "开发程序比用其他语言开发程序快很多。稳健性：Java" +
                "刚开始被设计出来就是为了写高可靠和稳健的软件的。安全性：Java" +
                "的存储分配模型是它防御恶意代码的主要方法之一。可移植性：Java" +
                "并不依赖平台，用Java" +
                "编写的程序可以运用到任何操作系统上。JavaJava";
        String key = "Java";
        int i = search(str, key);
        System.out.println(i);

        int j = search2(str, key);
        System.out.println(j);

    }

    public static int search2(String str, String key) {
        // 定义计数器
        int count = 0;
        // 查找的位置
        // 第一次从0索引开始找
        int index = 0;
        // 从index开始找 将查找到的位置赋值给index
        while ((index = str.indexOf(key, index)) != -1) {
            // 找到了
            count++;
            // 下一次查询的位置改变：找到的索引 + key的长度
            index = index + key.length();
        }
        return count;
    }


    /**
     * 查找str字符串中key关键词出现的次数
     * @param str -- 在字符串str中查找
     * @param key -- 要查找的关键词
     * @return 出现的次数
     */
    public static int search(String str, String key) {
        // 定义计数器
        int count = 0;

        int index; // 表示查找到的所以位置
        // 循环
        while ((index = str.indexOf(key)) != -1) { // 查找  赋值  比较    说明找到了
            // 循环进入一次 说明找到一次
            count++;
            // 截取掉查找过的部分
            str = str.substring(index + key.length()); // 从找到的索引 + key的长度 截取   截取后覆盖原串
        }
        return count;
    }

}
