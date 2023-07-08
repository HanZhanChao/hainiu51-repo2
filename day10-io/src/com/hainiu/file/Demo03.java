package com.hainiu.file;

import java.io.File;

/**
 * @author HaiNiu
 * @description
 *
 */
public class Demo03 {

    public static void main(String[] args) {
        /*File f1 = new File("D:\\FileTest\\test");
        // 删除文件 直接从磁盘删除 不走回收站 慎重
        System.out.println(f1.delete());*/

        // 删除文件夹 -- 只能删除空文件夹
       /* File f2 = new File("D:\\FileTest\\java");
        System.out.println(f2.delete());
        */

        File f3 = new File("D:\\FileTest\\刘德华 - 今天.mp3");
        System.out.println(f3.getAbsolutePath()); // 获取绝对路径
        System.out.println(f3.getPath()); // 获取构造方法中传递的路径
        System.out.println(f3.getName()); // 获取文件或者文件夹的名称


        File f4 = new File("day10-io\\a.txt");
        System.out.println(f4.getAbsolutePath());
        System.out.println(f4.getPath());
        System.out.println(f4.getName());

        File f5 = new File("D:\\FileTest");
        System.out.println(f5.getName());
    }
}
