package com.hainiu.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03_Read {
    public static void main(String[] args) throws IOException {

        // 创建流对象
        FileInputStream in = new FileInputStream("day10-io\\b.txt");

        // 读数据
        /*
        // 一次读一个字节
        int by; // 读取到的字节值
        while ((by = in.read()) != -1) { // 读取字节 -- 赋值给by -- 与-1比较
            System.out.println((char) by);
        }
        */

        // 一次读一个字节数组
        byte[] bytes = new byte[8192]; // 8K
        int len = in.read(bytes); // 表示本次读取到的有效字节个数
//        System.out.println(len);

        String str = new String(bytes, 0, len); // 把有效的部分转换成数据
        System.out.println(str);


        // 释放资源
        in.close();

    }
}
