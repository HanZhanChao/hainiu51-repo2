package com.hainiu.regex;

/**
 * @author HaiNiu
 * @description
 */
public class Demo05 {

    public static void main(String[] args) {
        // 现得到如下的字符串：
        String s = "我..我....我.我...我.就是要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";
        // 替换所有的点
        String s1 = s.replaceAll("\\.", "");
        System.out.println(s1); // 我我我我我就是要要要要要要学学学学学编编编编编程程程程
        // 叠词 (.)\\1+    再第二个参数中  使用$n 取第一个参数中的组
        String s2 = s1.replaceAll("(.)\\1+", "$1");
        System.out.println(s2);

    }
}
