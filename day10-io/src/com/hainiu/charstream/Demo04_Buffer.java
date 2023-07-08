package com.hainiu.charstream;

import java.io.*;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04_Buffer {

    public static void main(String[] args) throws IOException {
        // 写
        BufferedWriter writer = new BufferedWriter(new FileWriter("day10-io\\d.txt"));

        writer.write("hello world");
        writer.newLine(); // 根据平台写出一个换行符

        writer.write("你好");
        writer.newLine();

        writer.close();

    }

    private static void read() throws IOException {
        // 读
        BufferedReader reader = new BufferedReader(new FileReader("day10-io\\a.txt"));

        // 带缓冲区的字符输入流 特有的API  读一行
        /*
        String s = reader.readLine();

        System.out.println(s);
        */

        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }

        reader.close();
    }
}
