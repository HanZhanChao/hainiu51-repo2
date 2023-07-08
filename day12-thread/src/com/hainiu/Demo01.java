package com.hainiu;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {

    public static void main(String[] args) {
        String s = "古人有很多描述桃花的诗句。白居易在《大林寺桃花》中说：人间四月芳菲尽，山寺桃花始盛开；崔护在《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...春来遍是桃花水，不辨仙源何处寻；唐寅在《桃花庵歌》中也描述：桃花坞里桃花庵，桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱...";
        String key = "桃花";

        int count = search(s, key);
        System.out.println(count);
    }

    /**
     * 在字符串str中查找关键词key出现的次数
     *
     * @param str
     * @param key
     * @return
     */
    public static int search(String str, String key) {
        // 计数器
        int count = 0;
        // 定义变量表示查找到的位置
        int index = 0;
        // 查找 赋值 并比较
        while ((index = str.indexOf(key, index)) != -1) {
            // 记录
            count++;
            // 下次的查询位置 = 本次查找到的索引 + 关键词的长度
            index += key.length();
        }
        return count;
    }
}
