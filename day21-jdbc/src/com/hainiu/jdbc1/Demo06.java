package com.hainiu.jdbc1;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description
 */
public class Demo06 {

    public static void main(String[] args) {


        // 实现AutoCloseable 使用try-with-resources 语句自动释放流资源
        try ( FileOutputStream out = new FileOutputStream("day21-jdbc\\a.txt") ) {

            out.write("hello".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {

        }

        // out.close();

    }

}
