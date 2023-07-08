package com.hainiu.set;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author HaiNiu
 * @description
 * HashSet 存储学生对象
 *      HashSet存储元素保证唯一的原理
 *      添加到集合中的元素需要与集合中已经存在的元素进行比较
 *          先比较哈希值，如果哈希值不同，那么一定是不同对象，直接存储；
 *          如果哈希值相同，再进行equals比较
 *              equals返回了false，那么只是哈希值相同，对象不想等，继续存储
 *              equals返回true，哈希值相同，对象也相等，元素重复，不存储
 *
 * HashSet存储的数据保证唯一，需要重写equals()和hashCode()方法
 */
public class Demo02 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student("貂蝉", 17);
        Student s2 = new Student("西施", 18);
        Student s3 = new Student("王昭君", 17);
        Student s4 = new Student("杨玉环", 19);
        Student s5 = new Student("杨玉环", 19);

        set.add(s1);
        set.add(s1);
        set.add(s1);
        set.add(s1);
        set.add(s1);
        Collections.addAll(set, s1, s2, s3, s4, s5);

        // 遍历
        for (Student s : set) {
            System.out.println(s);
        }
    }
}
