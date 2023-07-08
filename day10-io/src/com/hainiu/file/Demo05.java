package com.hainiu.file;

import java.io.File;

/**
 * @author HaiNiu
 * @description
 * 获取文件夹的大小，返回字节值。
 * public long length() -- 只能由文件对象调用
 */
public class Demo05 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\D\\Desktop\\新建文件夹");

        long len = length(file);
        System.out.println(len);
    }

    public static long length(File dir) {
        if (dir.isFile()) {
            return dir.length();
        }
        // 文件夹打开
        File[] files = dir.listFiles();
        // 定义变量存储结果
        long length = 0L;
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // 是文件夹，累加文件的大小
                    length += file.length();
                } else {
                    // 是文件夹 递归 累加这个文件夹的大小
                    length += length(file);
                }
            }
        }
        return length;
    }
}
