package com.hainiu.regex;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 * // 将下面文本中的手机号码全部使用****代替
 * String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
 */
public class Demo03 {

    public static void main(String[] args) {

        /*String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";

        String regex = "1[3-9]\\d{9}";

        String s = str.replaceAll(regex, "****");

        System.out.println(s);*/

        String word = "你T  M  D别送了，真TMD服了你";
        String regex = "T\\s*M\\s*D";
        String s = word.replaceAll(regex, "!@#"); // $有特殊含义
        System.out.println(s);


        String str = "11 22   33  44     55";
// 将上面文本中的有效数据拆分出来，注意：数据中间的空格数量不确定。
        String[] strs = str.split("\\s+"); // 按照一个或多个空白字符拆分
        System.out.println(Arrays.toString(strs)); // [11, 22, 33, 44, 55]
    }
}
