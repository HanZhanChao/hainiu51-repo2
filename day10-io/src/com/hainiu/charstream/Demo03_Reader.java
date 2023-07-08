package com.hainiu.charstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description 字符流读数据
 */
public class Demo03_Reader {

    public static void main(String[] args) throws IOException {

        // 创建输入流
        FileReader reader = new FileReader("day10-io\\c.txt");

        // 读一个字符
        /*int ch = reader.read();
        System.out.println((char) ch);*/
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.println((char) ch);
        }

        reader.close();

    }
}
