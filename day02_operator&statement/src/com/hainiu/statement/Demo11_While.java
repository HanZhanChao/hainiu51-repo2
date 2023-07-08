package com.hainiu.statement;

/**
 * @author HaiNiu
 * @description
 * 世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
 * 假如我有一张足够大的纸，它的厚度是0.1毫米。请问，我折叠多少次，可以超过珠穆朗玛峰的高度?
 */
public class Demo11_While {
    public static void main(String[] args) {
        // 定义变量表示 山的高度 纸的厚度
        double zf = 8844430;
        double paper = 0.1;
        // 计数器
        int count = 0;

        // 循环折叠 结束的条件是纸的厚度超过珠峰
        while (paper <= zf) {
            // 纸的厚度变为原来的2倍
            paper *= 2;
            // 折叠一次 计数器就记录一次
            count++;
            System.out.println(paper);
        }

        /*int count = 0;
        for (double zf = 8844430, paper = 0.1; paper <= zf; ) {
            paper *= 2;
            count++;
        }*/
        // 循环停止，纸的厚度超过山的高度，输出折叠的次数
        System.out.println(count);
    }
}
