package com.hainiu.operator; // 当前类所属的包

// import关键字用于导入其他包的下的类或者接口
import java.util.Scanner;


/**
 * @author HaiNiu
 * @description 数据输入
 *  Java提供了一个类Scanner，文本扫描器 能够扫描键盘录入的基本数据类型和字符串
 *      1、导入 导包
 *      2、创建对象
 *      3、调用对象的方法接收键盘录入的数据
 *
 */
public class Demo06_Operator {

    public static void main(String[] args) {

        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in); // 标准输入 默认从设备输入

        // 调用对象的方法接收键盘录入的数据
        System.out.println("请输入一个整数：");
        int num = sc.nextInt(); // 对象.方法 -- 返回整数 -- 定义变量接收这个返回值
        // 如果输入错误数据会报错：InputMismatchException
        System.out.println(num);

        System.out.println("请输入一个小数：");
        double x = sc.nextDouble(); // 对象.方法 -- 返回浮点数 -- 定义变量接收这个返回值
        System.out.println(x);
    }
}
