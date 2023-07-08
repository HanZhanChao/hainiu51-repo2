package com.hainiu.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description 字节流写出数据 加入异常处理 -- 将创建流和读写操作放到try中，而将释放资源放到finally
 *
 */
public class Demo02_Write {

    public static void main(String[] args) {
        /*FileOutputStream out = null;
        try {
            // 创建流
            out = new FileOutputStream("day10-io\\b.txt");
            // 写出数据
            out.write(97);
            out.write(98);
            out.write(99);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 不管有没有异常 都会执行 -- 除非JVM退出 -- 通常用于执行必须的操作
            // 释放资源 -- 总是要执行的
            if (out != null) { // 流对象如果没有创建成功
                try { // close方法本身还有异常
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}
