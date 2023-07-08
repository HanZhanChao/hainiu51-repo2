package com.hainiu.method;

/**
 * @author HaiNiu
 * @description 具备某种功能的代码块
 * <p>
 * 修饰符 返回值类型 方法名(参数列表) {
 *      方法体;
 *      [return 数据]; // 可选的
 * }
 *
 * 修饰符 -- 限定方法的访问权限和调用方式
 *      照着main方法抄写 public static
 *
 * 返回值类型 -- 方法执行完毕得到的结果类型
 *          如果没有具体的返回值 写 void  返回值为空
 *
 * 方法名 -- 调用方法使用   遵循小驼峰式命名
 *
 * (参数列表) -- 实现这个方法需要的参数
 *              数据类型 变量名, 数据类型 变量名。。。
 *
 *  {} -- 方法体 实现这个方法功能的逻辑代码
 *
 *  [return 数据] -- 如果方法有明确的返回值，那么由return语句返回具体的结果，返回到方法的调用处
 *                  如果方法没有返回值，那么可以省略return，也可以写，表示将方法结束。
 *
 */
public class Demo01_Method {

    public static void main(String[] args) {

        /*int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);*/

        int x = 10;
        int y = 20;

        int a = add(x, y);
        System.out.println(a);

        int b = add(30, 40);
        System.out.println(b);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
