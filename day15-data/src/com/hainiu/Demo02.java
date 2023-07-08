package com.hainiu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();

        Student s1 = new Student("2023050501", "Tom", 20);
        Student s2 = new Student("2023050502", "Tom12", 20);
        Student s3 = new Student("2023050503", "Tom23", 20);
        Student s4 = new Student("2023050504", "Tom23", 20);
        Student s5 = new Student("2023050505", "Tom34", 20);


        Collections.addAll(list, s1, s2, s3, s4, s5);

        Scanner sc = new Scanner(System.in);
        /*
        请输入学号：
        2023050502
        学生信息：
        学号：2023050502，姓名：Jerry，年龄：19
         */
        System.out.println("请输入学号：");
        String s = sc.nextLine();
        Student stu = getStudentById(list, s);
        if (stu != null) {
            System.out.println("学生信息：");
            System.out.println("学号：" + stu.getId() + "，姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        } else {
            System.out.println("没有学号为" + s + "的学生");
        }

    }

    /**
     * 在list集合中查找学号为id的学生
     * @param list
     * @param id
     * @return
     */
    public static Student getStudentById(ArrayList<Student> list, String id) {
        if (list == null || list.isEmpty()) return null;

        for (Student stu : list) {
            if (id.equals(stu.getId())) return stu;
        }
        return null;
    }
}
