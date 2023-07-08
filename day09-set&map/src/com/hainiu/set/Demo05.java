package com.hainiu.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author HaiNiu
 * @description
 *
 * public TreeSet(Comparator<? super E> comparator)
 *      int compare(T o1, T o2)
 */
public class Demo05 {

    public static void main(String[] args) {

        // 在构造方法中提供比较器
        /*TreeSet<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                // 首要条件 年龄
                int num = t1.getAge() - t2.getAge();
                if (num == 0) {
                    // 次要条件 姓名
                    num = t1.getName().compareTo(t2.getName());
                }
                return num;
            }
        });*/

        TreeSet<Teacher> set = new TreeSet<>((t1, t2) -> {
            // 首要条件 年龄
            int num = t1.getAge() - t2.getAge();
            if (num == 0) {
                // 次要条件 姓名
                num = t1.getName().compareTo(t2.getName());
            }
            return num;
        });
        Teacher t1 = new Teacher("Tom", 20);
        Teacher t2 = new Teacher("Tony", 19);
        Teacher t3 = new Teacher("John", 21);
        Teacher t7 = new Teacher("Rose", 21);
        Teacher t4 = new Teacher("Jack", 22);
        Teacher t5 = new Teacher("Lily", 19);
        Teacher t6 = new Teacher("Lily", 19);

        Collections.addAll(set, t1, t2, t3, t4, t5, t6, t7);

        for (Teacher t : set) {
            System.out.println(t);
        }

    }
}
