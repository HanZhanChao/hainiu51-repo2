package com.hainiu.innerclass;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {
    public static void main(String[] args) {

        // 访问一个类的内部类  外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        /*Outer.Inner oi = new Outer().new Inner();

        oi.show();*/

        Outer outer = new Outer();
        outer.method();

        // 静态内部类  外部类名.内部类名 对象名 = new 外部类名.内部类名();
        Outer.InnerClass oi = new Outer.InnerClass();

        oi.setId("hainiu001");
        System.out.println(oi.getId());

        Outer.InnerClass.fun();

        OuterClass oc = new OuterClass();
        oc.test();

    }

}
