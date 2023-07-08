package com.hainiu.set;

/**
 * @author HaiNiu
 * @description
 *
 * Teacher对象要存入Tree结构的集合，需要进行排序，那么必然需要排序的规则。
 * 需要Teacher类实现java.lang.Comparable接口 -- 自然顺序
 */
public class Teacher /*implements Comparable<Teacher>*/ {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public int compareTo(Teacher t) {
        // 根据业务分析出排序的规则
        // 年龄从小到大排序，如果年龄相等，按照姓名的自然顺序排序；如果所有属性都相同，认为重复对象，不添加

        // this代表的是新添加的元素  参数t代表的就是已经存在的元素
        int num = this.age - t.age;
        if (num == 0) {
            // 姓名是字符串 字符串也实现了compareTo方法
            num = this.name.compareTo(t.name);
        }
        // 只要让这个返回值不可能为0，就不会去重
        *//*if (num == 0) {
            num = 1;
        }*//*
        return num;
    }*/
}
