package com.hainiu.oop8;

/**
 * @author HaiNiu
 * @description
 *
 * 编译期  java -- class    编译期只检查语法
 * 运行期 class -- run
 *
 */
public class Test {

    public static void main(String[] args) {

        /*
        Fu fu = new Fu();
        fu.show();

        Zi zi = new Zi();
        zi.show();
        */

        // 父类引用指向子类对象
        Fu fu = new Zi();

        System.out.println(fu.num); // 父类

        fu.show(); // 子类重写之后的方法

    }

}
