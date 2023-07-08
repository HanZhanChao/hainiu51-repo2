package com.hainiu.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description 文件拷贝
 */
public class Demo04_Copy {
    public static void main(String[] args) throws IOException {
        long a = System.currentTimeMillis();

        // 注意: 流对象只能指向文件，不能指向文件夹 -- 报错：拒绝访问
//        FileOutputStream out = new FileOutputStream("day10-io");

        // 创建输入流指向数据源文件
        FileInputStream in = new FileInputStream("C:\\Users\\D\\Pictures\\Camera Roll\\aa.jpg");

        // 创建输出流指向目标文件
        FileOutputStream out = new FileOutputStream("day10-io\\aa.jpg");

        // 读写操作 一次读一个字节
        /*int by;
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
