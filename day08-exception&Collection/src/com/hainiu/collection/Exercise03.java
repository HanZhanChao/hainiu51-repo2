package com.hainiu.collection;

import java.util.Stack;

/**
 * @author HaiNiu
 * @description
 */
public class Exercise03 {

    public static void main(String[] args) {
        /*Stack<String> stack = new Stack<>();

        // 压栈
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        stack.push("java");

        // 弹栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

        System.out.println(isGoodBracket("...(..[.)..].{.(..).}..."));
        System.out.println(isGoodBracket("...(..[...].(.).).{.(..).}..."));
        System.out.println(isGoodBracket(".....[...].(.).){.(..).}..."));
        System.out.println(isGoodBracket("...(..[...].(.).){.(..)...."));
    }

    private static boolean isGoodBracket(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            }
            if (c == '[') {
                stack.push(']');
            }
            if (c == '{') {
                stack.push('}');
            }
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) { // 多了右边
                    return false;
                }
                if (stack.pop() != c) { // 交叉嵌套
                    return false;
                }
            }
        }
        return stack.isEmpty(); // 多了左边
    }
}
