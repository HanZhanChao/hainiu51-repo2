package com.hainiu.innerclass;

/**
 * @author HaiNiu
 * @description
 */
public class Outer {

    private String name;

    // 也看作外部类的一个成员
    /*public class Inner {

        private int age;

        public void show() {
            // 内部类可以直接使用外部类的成员
            System.out.println(name);
        }
    }*/

    // 将内部类私有  外界无法访问  供外部类自己使用
    private class Inner {
        private int age;

        public void show() {
            // 内部类可以直接使用外部类的成员
            System.out.println(name);
        }
    }

    // 静态的内部类
    public static class InnerClass {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        // 静态内部类中的静态方法
        public static void fun() {
            System.out.println("InnerClass fun");
        }
    }


    // 外部类要访问内部类的成员，必须创建对象
    public void method() {
        Inner inner = new Inner();
        System.out.println(inner.age);
    }

}
