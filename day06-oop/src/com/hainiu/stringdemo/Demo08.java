package com.hainiu.stringdemo;

/**
 * @author HaiNiu
 * @description
 */
public class Demo08 {

    public static void main(String[] args) {
        /*
        public int indexOf(String str)
            返回指定的子字符串在调用方法的字符串中第一次出现的索引。如果没有，返回-1
        public int indexOf(String str, int fromIndex)
            返回指定的子字符串在调用方法的字符串中第一次出现的索引，以指定的索引开始搜索。如果没有，返回-1
         */
        String str = "hello world java world";

       /* int i = str.indexOf("world", 8);
        System.out.println(i);*/

        /*
        public String substring(int beginIndex)
            将调用方法的字符串从索引beginIndex处开始截取，一直到字符串结尾。返回一个新的字符串。
        public String substring(int beginIndex, int endIndex)
            将调用方法的字符串从索引beginIndex处开始截取，一直到索引endIndex - 1处。返回一个新的字符串，长度为endIndex - beginIndex。
         */

        // 注意：截取字符串得到的是一个新串，记得接收

        /*String s = str.substring(6);
        System.out.println(s);

        String s2 = str.substring(6, 11);
        System.out.println(s2);*/

        str = str.substring(6); // 覆盖原来的
        System.out.println(str);

    }

}
