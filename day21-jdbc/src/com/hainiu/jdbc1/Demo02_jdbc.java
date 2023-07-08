package com.hainiu.jdbc1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02_jdbc {
    public static void main(String[] args) throws IOException, SQLException {

        // 加载驱动 mysql5开始省略

        // 建立连接 -- 将数据库相关属性放到配置文件中
        // 从配置文件读取数据库信息

        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

        Properties properties = new Properties();
        properties.load(in);

        String driver = properties.getProperty("jdbc.driver");
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");

        Connection connection = DriverManager.getConnection(url, username, password);
        // 处理对象

        Statement statement = connection.createStatement();
        String sql = "update category set cname = '图书电子书' where cid = 6";

        // 执行操作
        int rows = statement.executeUpdate(sql);
        if (rows > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }

        // 释放资源
        connection.close();
    }
}
