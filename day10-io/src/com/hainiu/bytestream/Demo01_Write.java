package com.hainiu.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description 字节流写出数据
 */
public class Demo01_Write {

    public static void main(String[] args) throws IOException {

        // 创建流对象指向文件
        // 1、果文件不存在，那么会自动创建一个文件，但是必须保证目录存在，否则报错：系统找不到指定的路径
        // 2、如果文件存在，默认会覆盖写入
        // 3、如果想追加数据，需要在构造方法中传入第二个参数，为true
        FileOutputStream out = new FileOutputStream("day10-io\\a.txt", true);

        // 写出数据
        out.write(97); // -128 ~ 127  写出一个字节
        out.write("\r\n".getBytes());

        byte[] data = new byte[]{49, 50, 51, 52, 53, 54, 55};

        out.write(data); // 写出一个字节数组
        out.write("\r\n".getBytes());

        out.write(data, 1, 3); // 写出字节数组的一部分

        // 换行 "\r\n"
        out.write("\r\n".getBytes());

        // 释放资源 -- 关流 -- 造成流不可用
        out.close();
    }
}
