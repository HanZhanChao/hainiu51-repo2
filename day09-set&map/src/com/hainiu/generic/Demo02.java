package com.hainiu.generic;

/**
 * @author HaiNiu
 * @description
 *
 * 当创建对象时 用引用数据类型来替代这个泛型
 */
public class Demo02 {
    public static void main(String[] args) {

        MyGenericClass<String> mg = new MyGenericClass<String>();
        mg.show("hello");


        MyGenericClass<Integer> mg2 = new MyGenericClass<Integer>();
        mg2.show(100);

    }

}
