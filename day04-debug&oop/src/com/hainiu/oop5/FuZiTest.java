package com.hainiu.oop5;

/**
 * @author HaiNiu
 * @description
 *
 * 构造方法并不存在继承的概念
 *  但是，子类构造方法执行之前，都会优先执行父类的空参构造。
 *  在子类的每一个构造方法的第一行 都默认包含一个super()
 *
 *  根据参数匹配调用父类的某个构造方法
 *
 *  java中有一个类Obejct 是所有类的顶级基类
 *  Obejct类只提供了无参构造
 *
 */
public class FuZiTest {
    public static void main(String[] args) {


//        Zi zi = new Zi();

        Zi zi = new Zi(8);


    }
}
