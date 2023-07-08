package com.hainiu.oop10;

/**
 * @author HaiNiu
 * @description
 *
 * Singleton 单例设计模式  程序运行期间 类只有一个对象
 */
public class Test {

    public static void main(String[] args) {

//        HungrySingleton hs = new HungrySingleton();

       /* for (int i = 0; i < 10; i++) {
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(instance);
        }*/

        for (int i = 0; i < 100; i++) {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }


    }

}
