package com.hainiu.file;

import java.io.File;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {

    public static void main(String[] args) throws IOException {

        /*// 创建文件
        File file = new File("D:\\FileTest\\abc.mp3");

        // 1、保证文件夹存在 -- 否则报错
        // 2、文件不存在才会创建成功
        System.out.println(file.createNewFile());*/

        // 创建文件夹 -- 要创建的文件夹只有一级
        /*File dir = new File("D:\\FileTest\\hello");
        System.out.println(dir.mkdir());*/

        // 创建多级目录 包含单级
        /*
        File dir = new File("D:\\FileTest\\java\\javase");
        System.out.println(dir.mkdirs());
        */

        // 不要以文件是否有后缀名来判断是文件还是文件夹
        File file = new File("D:\\FileTest\\test");
//        System.out.println(file.createNewFile());


//        File dir = new File("D:\\FileTest\\test.txt");
     //   System.out.println(dir.mkdirs());

        // 判断
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}
