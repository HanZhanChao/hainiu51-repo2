package com.hainiu.file;

import java.io.File;

/**
 * @author HaiNiu
 * @description File类
 *
 */
public class Demo01 {

    public static void main(String[] args) {

        // 绝对路径：从盘符开始的路径
        File f1 = new File("D:/FileTest/words.txt");
        System.out.println(f1);

        File f2 = new File("D:/FileTest", "words.txt");
        System.out.println(f2);

        File f3 = new File("D:/FileTest"); // 文件夹
        File f4 = new File(f3, "words.txt");
        System.out.println(f4);

        File f5 = new File("D:/FileTest/aaa.txt");
        System.out.println(f5);

        System.out.println(f1.exists());
        System.out.println(f5.exists());

        // 目前针对java项目，相对路径是从项目根路径开始的
        File f6 = new File("day10-io\\a.txt");

    }
}
