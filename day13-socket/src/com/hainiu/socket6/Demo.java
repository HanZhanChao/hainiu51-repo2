package com.hainiu.socket6;

import java.io.*;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        /*FileInputStream in = new FileInputStream("aaa");

        // 转换成字符流  如果没有第二个参数 采用平台默认编码
        InputStreamReader reader = new InputStreamReader(in, "UTF-8");

        // 加缓冲区
        BufferedReader r = new BufferedReader(reader);

        r.readLine();*/


        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("day13-socket\\b.txt"), "UTF-8"));

        // 缓冲区满了 会自动刷新
        writer.write("abc");
        writer.newLine();
        writer.write("xyz");
        writer.newLine();
        // 没满手动刷新
        writer.flush();

        writer.close();
    }

}
