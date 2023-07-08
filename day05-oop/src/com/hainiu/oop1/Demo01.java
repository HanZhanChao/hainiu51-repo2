package com.hainiu.oop1;

/**
 * @author HaiNiu
 * @description
 *
 * 类
 *      属性 -- 成员变量
 *      行为 -- 成员方法
 *      构造方法
 *
 * private
 * protected
 * public
 *
 *      this
 *      super
 *
 * extends
 *
 * static
 *      类变量
 *      类方法
 *      静态代码块
 *      内部类
 *
 */
public class Demo01 {
    public static void main(String[] args) {

//        Animal a = new Animal();

        Cat cat = new Cat();

        cat.setName("Tom");
        cat.setColor("灰色");

      /*
      System.out.println(cat.getName());
        System.out.println(cat.getColor());
        */

        cat.eat();

        Cat cat1 = new Cat("加菲", "棕色");
        cat1.eat();


    }
}
