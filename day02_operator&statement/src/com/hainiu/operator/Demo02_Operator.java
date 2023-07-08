package com.hainiu.operator;

/**
 * @author HaiNiu
 * @description 自增运算符
 * 作用：让变量的值自增1
 * ++
 *  前置运算 ++a
 *  后置运算 a++
 *
 *      如果单独运算，前置和后置没有区别。
 *      如果参与运算（赋值、算术、输出、比较），前置++先加后用，后置++先用后加。
 *
 *      单独使用
 */
public class Demo02_Operator {

    public static void main(String[] args) {

        int a = 1;
//        a++;
        ++a;
        System.out.println(a);

        System.out.println("-------");
        int x = 1;
//        int y = x++;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);

        System.out.println("-------");
        int m = 1;
//        int n = 1 + m++;
        int n = 1 + ++m;
        System.out.println(m);
        System.out.println(n);

        System.out.println("-------");
        int k = 10;
        System.out.println(k++);
        System.out.println(k);


        // 应用场景  控制循环的次数
        for (int i = 0; i < 10; ++i) { // 重复执行10次 0 1 2 3 。。。。9

        }

    }

}
