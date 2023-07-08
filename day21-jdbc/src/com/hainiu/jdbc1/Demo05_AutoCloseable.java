package com.hainiu.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author HaiNiu
 * @description JDK7 出现的自动关流   try-with-resources 语句
 *
 * 在try语句 中添加一对小括号 将获取流对象的代码放到小括号中，能够实现流的自动关闭
 *
 */
public class Demo05_AutoCloseable {

    public static void main(String[] args) {

        // 通过工具类获取连接

        try (Connection connection = JDBCUtil.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from product");

            while (resultSet.next()) {
                int pid = resultSet.getInt("pid");
                String pname = resultSet.getString("pname");
                double price = resultSet.getDouble("price");

                System.out.println(pid);
                System.out.println(pname);
                System.out.println(price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
