package com.hainiu.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01_jdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver"); // 让驱动类加载即可  类中的静态代码块 注册驱动

        // 建立连接
        /*
            连接数据库四大属性
                1、数据库驱动 com.mysql.jdbc.Driver
                2、连接的地址url -- 数据库服务器地址
                3、用户名
                4、密码
         */

        String url = "jdbc:mysql://11.26.164.142:3306/jdbc_study?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "hainiu";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 处理sql语句的对象
        Statement statement = conn.createStatement();

        String sql = "insert into category (cid, cname) values (6, '图书/电子书')";

        // 执行操作 -- 业务
        int rows = statement.executeUpdate(sql);
        if (rows > 0) {
            System.out.println("插入数据成功");
        } else {
            System.out.println("插入数据失败");
        }

        // 释放资源
//        statement.close(); // 执行对象
        conn.close(); // 连接
    }
}
