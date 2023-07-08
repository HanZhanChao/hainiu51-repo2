package com.hainiu.charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02_Writer {

    public static void main(String[] args) throws IOException {

        // 根据编码表 写出字符， 默认使用平台编码
        FileWriter writer = new FileWriter("day10-io\\c.txt", true);

        // 写出一个字符
        writer.write('a');
        writer.write("\r\n");

        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e'};
        // 写出一个字符数组
        writer.write(chars);
        writer.write("\r\n");
        // 写出一个字符数组的一部分
        writer.write(chars, 1, 3);
        writer.write("\r\n");

        // 写出字符串
        writer.write("你好");
        writer.write("\r\n");


        writer.close();

    }
}
