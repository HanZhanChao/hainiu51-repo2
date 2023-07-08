package com.hainiu.oop3;

/**
 * @author HaiNiu
 * @description 该类用于描述教师的信息
 * 当我们定义一个类时，发现与之前的类有很多雷同的地方，为了减少重复，没必要从头重新定义这个类
 * 而是由之前的类衍生出来
 */
public class Teacher extends Person { // Teacher类继承自Person
    // 工号
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
