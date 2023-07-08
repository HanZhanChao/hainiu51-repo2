package com.hainiu.generic;

/**
 * @author HaiNiu
 * @description
 *
 * 接口的子类仍然使用泛型，本身成为泛型类
 */
public class MyGenericInterImp<T> implements MyGenericInter<T> {

    @Override
    public void show(T value) {
        System.out.println(value);
    }
}
