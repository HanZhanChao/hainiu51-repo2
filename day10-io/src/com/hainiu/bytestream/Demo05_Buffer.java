package com.hainiu.bytestream;

import java.io.*;

/**
 * @author HaiNiu
 * @description
 */
public class Demo05_Buffer {

    public static void main(String[] args) throws IOException {
        long a = System.currentTimeMillis();

        // 装饰设计模式 -- 想要读写的功能，但效率低下 -- 在构造方法中接收一个流对象，对这个流对象进行包装，加上缓冲区；
        // 读和写的功能还是依赖被包装的流
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\D\\Pictures\\Camera Roll\\aa.jpg"));

        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("day10-io\\bb.jpg"));

        /*
        int by;
        while ((by = in.read()) != -1) {
            out.write(by);
        }
        */

        // 一次读写一个字节数组
        byte[] bytes = new byte[8192]; // 缓冲区
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len); // 读取到的有效部分 写到目的地
        }

        // 释放
        in.close();
        out.close();

        long b = System.currentTimeMillis();
        System.out.println(b - a);

    }

}
