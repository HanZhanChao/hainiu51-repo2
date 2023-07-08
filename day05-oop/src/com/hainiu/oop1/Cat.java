package com.hainiu.oop1;

/**
 * @author HaiNiu
 * @description
 */
public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String name, String color) {
        // 把两个参数交给父类初始化
        super(name, color);
    }

    // 重写父类的抽象方法
    @Override
    public void eat() {
        System.out.println("猫的名字是：" + getName());
        System.out.println("猫的颜色是：" + getColor());
        System.out.println("猫吃鱼");
    }

}
