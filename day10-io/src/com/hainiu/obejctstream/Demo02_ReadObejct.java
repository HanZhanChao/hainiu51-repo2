package com.hainiu.obejctstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author HaiNiu
 * @description ObjectInputStream 实现对象的反序列化操作
 */
public class Demo02_ReadObejct {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 创建对象输入流
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("day10-io\\obj.txt"));

        // 读取一个对象
        Student s = (Student) in.readObject();
        System.out.println(s);

        // 释放资源
        in.close();
    }

}
