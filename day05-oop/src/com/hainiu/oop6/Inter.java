package com.hainiu.oop6;

/**
 * @author HaiNiu
 * @description
 */
public interface Inter {

    // 供子类对象调用，也可以被子类重写
    default void test() {
        System.out.println("Inter...test");
    }

    // 接口名直接调用
    static void hello() {
        System.out.println("Inter...hello");
    }

    /*private void world() {
        System.out.println("World...");
    }*/

}
