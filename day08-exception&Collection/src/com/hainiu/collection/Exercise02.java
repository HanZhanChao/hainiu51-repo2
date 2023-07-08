package com.hainiu.collection;

import java.util.LinkedList;

/**
 * @author HaiNiu
 * @description
 * 假设表达式中允许包含三种括号：（）、[]和{}。
 * 对于表达式中的其他符号，无需考虑，本例中采用点替代。
 * 但对于表达式中的括号必须正确的配对并且正确的嵌套，即括号必须左右呼应，可以相互包含，但不能交叉。
 *
 * 例如：
 * ..(..[..]..).. 是允许的
 * ..(...[...)....].... 是禁止的
 *
 * 对于主方法中的测试用例，应该返回如下结果：
 * false
 * true
 * false
 * false
 * 请编写一个算法判断表达式中的括号是否正确配对。
 *
 * 1、遍历字符串得到每个字符
 * 2、如果遇到括号
 *      遇到左边括号 添加对应的右边括号到集合中，添加到顶部
 *      遇到右边括号，使用这个右边括号根最顶部的元素比较，如果不相同 一定不是；如果相同，删除
 *      操作完毕，集合为空
 *
 */
public class Exercise02 {

    public static void main(String[] args) {
        System.out.println(isGoodBracket("...(..[.)..].{.(..).}..."));
        System.out.println(isGoodBracket("...(..[...].(.).).{.(..).}..."));
        System.out.println(isGoodBracket(".....[...].(.).){.(..).}..."));
        System.out.println(isGoodBracket("...(..[...].(.).){.(..)...."));
    }

    public static boolean isGoodBracket(String str) {
        // 创建集合
        LinkedList<Character> list = new LinkedList<>();
        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 判断  如果遇到左边 存储相应的右边
            if (c == '(') {
                list.addFirst(')');
            }
            if (c == '[') {
                list.addFirst(']');
            }
            if (c == '{') {
                list.addFirst('}');
            }
            // 如果遇到右边
            if (c == ')' || c == ']' || c == '}') {
                // 集合中没元素 说明先出现右边 错误
                if (list.isEmpty()) {
                    return false;
                }
                // 与最后添加的那个括号比较，如果不相同  错误
                if (list.removeFirst() != c) {
                    return false;
                }
            }
        }
        // 全部操作完毕，集合应该为空
        return list.isEmpty();
    }
}
