package com.hainiu.jdbc1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description 获取连接和释放资源的工具类
 */
public class JDBCUtil {

    // 私有构造器
    private JDBCUtil() {}

    private static String driverName;
    private static String url;
    private static String username;
    private static String password;

    // 静态代码块 -- 加载数据库属性
    static {
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

        Properties properties = new Properties();
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driverName = properties.getProperty("jdbc.driver");
        url = properties.getProperty("jdbc.url");
        username = properties.getProperty("jdbc.username");
        password = properties.getProperty("jdbc.password");

        // 加载驱动
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 静态方法 获取连接
    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(url, username, password);
    }


    // 静态方法 释放资源
    /*public static void close(Statement statement, Connection connection) throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        close(statement, connection);
    }*/

    // ResultSet Statement Connection 都继承自AutoCloseable 释放资源的方法都在AutoCloseable接口中定义
    public static void close(AutoCloseable... autoCloseables) throws Exception {
        if (autoCloseables != null) {
            for (AutoCloseable autoCloseable : autoCloseables) {
                if (autoCloseable != null) {
                    autoCloseable.close();
                }
            }
        }
    }

}
