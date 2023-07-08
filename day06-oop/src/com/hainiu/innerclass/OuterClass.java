package com.hainiu.innerclass;

/**
 * @author HaiNiu
 * @description
 */
public class OuterClass {


    public void test() {
        // 方法内部 局部内部类
        class Inner {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
                System.out.println(1);
            }
        }
        // 局部内部类 只在方法中使用
        Inner inner = new Inner();
        inner.setName("Tom");
        System.out.println(inner.getName());

    }

}
