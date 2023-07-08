package com.hainiu.obejctstream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author HaiNiu
 * @description 把多个对象序列化到文件中 并反序列化重构对象
 */
public class Demo03_ObjectStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();

        read();

    }

    public static void write() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("day10-io\\obj.txt"));
        // 写出多个对象
        Student s1 = new Student("Tom", 20, 8000);
        Student s2 = new Student("Jerry", 21, 9000);
        Student s3 = new Student("Jack", 22, 10000);

        // 放入集合
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1, s2, s3);

        // 写一次
        out.writeObject(list);

        out.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("day10-io\\obj.txt"));

        // 读一次
        ArrayList<Student> list = (ArrayList<Student>) in.readObject();
        // 遍历集合
        list.forEach(s -> System.out.println(s));

        in.close();
    }

    /*public static void write() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("day10-io\\obj.txt"));
        // 写出多个对象
        Student s1 = new Student("Tom", 20, 8000);
        Student s2 = new Student("Jerry", 21, 9000);
        Student s3 = new Student("Jack", 22, 10000);

        out.writeObject(s1);
        out.writeObject(s2);
        out.writeObject(s3);

        out.close();
    }

    /*public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("day10-io\\obj.txt"));

        *//*Object obj;
        // 读取一个对象，如果到底文件末尾，抛出异常 EOFException  end of file
        while ((obj = in.readObject()) != null) {
            Student s = (Student) obj;
            System.out.println(s);
        }*//*

        while (true) {
            try {
                Student s = (Student) in.readObject();
                System.out.println(s);
            } catch (EOFException e) { // 捕获到EOFException 就结束程序
                break;
            }
        }

        in.close();
    }*/

}
