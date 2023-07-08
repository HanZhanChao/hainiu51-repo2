package com.hainiu.jdbc2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author HaiNiu
 * @description
 */
public class JdbcUtil {
    private JdbcUtil() {
    }

    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        // 读取配置文件
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("jdbc.url");
        username = properties.getProperty("jdbc.username");
        password = properties.getProperty("jdbc.password");

        // 注册驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    /**
     * 释放资源
     * @param autoCloseables
     * @throws Exception
     */
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
