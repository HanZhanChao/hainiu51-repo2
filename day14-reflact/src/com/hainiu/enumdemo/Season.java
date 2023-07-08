package com.hainiu.enumdemo;

/**
 * @author HaiNiu
 * @description
 */
public enum Season {
    // 枚举项必须在枚举类的其他代码前面
    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天"); // ctrl + shift + u  大小写切换

    Season(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
