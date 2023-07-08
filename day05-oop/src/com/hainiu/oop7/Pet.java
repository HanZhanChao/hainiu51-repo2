package com.hainiu.oop7;

/**
 * @author HaiNiu
 * @description
 */
public abstract class Pet {

    private String name;
    private int age;

    public Pet() {
    }

    public Pet(String name, int age) {
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

    // 方法
    public abstract void eat();

    public void drink() {
        System.out.println("名字叫" + name + "的宠物在喝水");
    }
}
