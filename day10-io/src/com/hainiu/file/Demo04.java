package com.hainiu.file;


import java.io.File;
import java.util.Objects;

/**
 * @author HaiNiu
 * @description 遍历文件夹
 *
 * public File[] listFiles()
 *      必须是文件夹对象来调用，而且必须拥有操作权限
 *      如果是文件调用这个方法，返回null
 */
public class Demo04 {
    public static void main(String[] args) {
        /*
        File file = new File("D:\\FileTest\\words.txt");

        // 查看文件夹下面的子内容
        File[] files = file.listFiles();
        if (!Objects.isNull(files)) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        */

        File file = new File("D:\\FileTest");

        delete(file);

    }

    // 定义方法实现删除文件夹
    public static void delete(File dir) {
        // 判断
        if (dir.isFile()) {
            dir.delete();
            return;
        }
        // 文件夹 -- 打开文件夹 删除子内容
        File[] files = dir.listFiles();
        // 避免空指针异常
        if (files != null) {
            // 遍历
            for (File file : files) {
                if (file.isFile()) {
                    // 如果是文件 直接删除
                    file.delete();
                } else {
                    // 如果是文件夹 递归
                    delete(file);
                }
            }
            // 如果循环执行完毕，说明当前文件夹下面的子内容删除完毕，当前文件夹也删除
            dir.delete();
        }
    }
}
