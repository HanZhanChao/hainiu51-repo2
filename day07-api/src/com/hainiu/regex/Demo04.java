package com.hainiu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04 {

    public static void main(String[] args) {

        // 获取模式对象 -- 将字符串形式的正则表达式 编译成 Pattern对象
        Pattern pattern = Pattern.compile("1[3-9]\\d{9}");

        // 通过模式对象调用matcher方法 将要解析的字符串作为参数 得到匹配器对象
        Matcher matcher = pattern.matcher("张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。");

        // 整体匹配
        /*boolean b = matcher.matches();
        System.out.println(b);*/

        while (matcher.find()) {
            String s = matcher.group();
            System.out.println(s);
        }

        System.out.println("==========");
        /*String str = "abc234123412helloworld21341234!@#$this is test1324this is testaaa";
        String r = "[a-zA-Z\\s]+";

        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(str);

        String result = "";

        while (m.find()) {
            String s = m.group();
            if (s.length() > result.length()) {
                result = s;
            }
        }
        System.out.println(result);
*/
    }

}
