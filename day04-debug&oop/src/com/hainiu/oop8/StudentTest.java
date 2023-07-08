package com.hainiu.oop8;

/**
 * @author HaiNiu
 * @description
 */
public class StudentTest {


    public static void main(String[] args) {

        // 访问方式  类名.静态属性
        System.out.println(Student.school);
        Student.school = "海牛大学";


        Student s1 = new Student("Tom", 20);
        Student s2 = new Student("Jerry", 21);

//        s1.school = "海牛小学";
//        System.out.println(s1.school);
//        System.out.println(s2.school);

        /*StudentTest test = new StudentTest();
        test.test();*/

    }

    /*public void test() {

    }*/
}
