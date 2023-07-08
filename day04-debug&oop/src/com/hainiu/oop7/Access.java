package com.hainiu.oop7;

/**
 * @author HaiNiu
 * @description
 */
public class Access {
    // 私有
    private void test1() {
        System.out.println("private");
    }

    // 默认
    void test2() {
        System.out.println("默认");
    }

    // 收保护的
    protected void test3() {
        System.out.println("protected");
    }

    // 公共的
    public void test4() {
        System.out.println("public");
    }
}
