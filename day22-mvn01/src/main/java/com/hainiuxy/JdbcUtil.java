package com.hainiuxy;

import com.alibaba.druid.pool.DruidDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
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

    // DruidDataSource
    private static DruidDataSource dataSource;

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

        // 给连接池设置数据库相关属性
        dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        // 数据源其他常用参数
        /*
        dataSource.setInitialSize(2); // 初始化连接数量
        dataSource.setMaxActive(5); // 最大连接条数
        dataSource.setMaxWait(2000); // 最大等待超时时间
        */

    }


    /**
     * 获取连接
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    // 释放资源的close方法 不再是关闭连接  而是归还连接

}
