package com.hainiu.obejctstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author HaiNiu
 * @description ObjectOutputStream 实现对象的序列化操作
 */
public class Demo01_WriteObject {
    public static void main(String[] args) throws IOException {

        // 创建流对象指向文件
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("day10-io\\obj.txt"));
        // 写出对象
        Student s = new Student("Tom", 20, 9999);

        out.writeObject(s); // NotSerializableException 序列化异常

        out.close();
    }
}
