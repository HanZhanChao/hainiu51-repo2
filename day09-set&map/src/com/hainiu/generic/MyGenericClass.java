package com.hainiu.generic;

/**
 * @author HaiNiu
 * @description 泛型类
 *
 * 泛型类的泛型什么时机明确？ 创建对象时明确
 */
public class MyGenericClass<E> {

    // 在类中，这个泛型当成Object类型来使用
    public void show(E e) {
        System.out.println(e);
    }
}
