package com.hainiu.oop3;

/**
 * @author HaiNiu
 * @description
 *
 * 子类继承了父类后 可以继承使用父类的非私有成员
 */
public class TeacherTest {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setId("123");
        t.setName("张三");
        t.setAge(30);

        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}
