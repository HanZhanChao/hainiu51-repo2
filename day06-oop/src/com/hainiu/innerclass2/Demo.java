package com.hainiu.innerclass2;

import java.io.FileInputStream;

/**
 * @author HaiNiu
 * @description
 */
public class Demo {

    public static void main(String[] args) {
        /*
        new 类名/接口名() {
            // 重写类或者接口中的方法
        }
        // 匿名内部类 -- new出来的是继承了这个类或者实现了这个接口的匿名子类对象

         */

        /*
        new Father() {
            @Override
            public void show() {
                System.out.println("override show");
            }
        }.show();
        */

        /*
        Father father = new Father();
        father.show();
        father.show();
        father.show();

        new Father().show(); // 匿名对象 -- 只用一次时 简化书写
        */

//        new InterImpl().test();

        /*
        new Inter() {
            @Override
            public void test() {
                System.out.println("实现的test方法");
            }
        }.test();
        */

        // 多态
        /*Inter inter = new Inter() {
            @Override
            public void test() {
                System.out.println("实现的test方法");
            }
        };

        inter.test();*/

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("我们去喝水吧");
            }
        });

        // 用lambda表达式
        goSwimming(() -> {
            System.out.println("我们去水上乐园玩");
        });

    }

    // 应用场景：如果发现一个方法的参数是接口  接口中只有一个抽象方法，此时我们就使用匿名内部类的方式传参 来简化书写
    /**
     * 使用接口的方法
     */
    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }

}
