package com.hainiu.oop7;

/**
 * @author HaiNiu
 * @description
 *
 * 养宠物的场景
 *  Pet -- 宠物类   属性：姓名 年龄    行为： 吃饭（抽象）  喝水（实现）
 *      Cat extends Pet   属性：颜色  行为：重写吃饭
 *      Dog  extends Pet implements Jump   行为：重写吃饭 重写跳高
 *
 * 不同宠物的有共性的内容，抽取到父类实现，抽象类。
 * 把宠物狗送去马戏团，学习跳高。 接口
 *
 * 接口被实现  体现 like a
 *      定义规则 体现一个体系扩展内容
 *
 */
public class Demo {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("Tom");
        c.setAge(2);
        c.setColor("blue");

        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getColor());

        c.drink();
        c.eat();

        System.out.println("----------");

        Dog dog = new Dog("八公", 3);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        dog.drink();
        dog.jump();
        dog.eat();
    }

}
