package com.hainiu.jdbc3;

import com.hainiu.jdbc2.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author HaiNiu
 * @description 转账操作   JDBC的事务处理 要结合try...catch语句完成
 */
public class Demo02_Account {


    public static void main(String[] args) throws SQLException {

        Connection connection = JdbcUtil.getConnection();


        String sql1 = "UPDATE account SET money = money - ? WHERE `name` = ?";
        String sql2 = "UPDATE account SET money = money + ? WHERE `name` = ?";

        // 预处理对象
        try (
                PreparedStatement ps1 = connection.prepareStatement(sql1);
                PreparedStatement ps2 = connection.prepareStatement(sql2);

        ) {
            // 通过连接对象开启事务
            connection.setAutoCommit(false);

            ps1.setInt(1, 1000);
            ps1.setString(2, "张三");

            ps2.setInt(1, 1000);
            ps2.setString(2, "李四");

            int i = ps1.executeUpdate();
            if (i > 0) {
                System.out.println("张三转出成功");
            }

             System.out.println(1/0);

            int j = ps2.executeUpdate();
            if (j > 0) {
                System.out.println("李四转入成功");
            }

            // 如果try中所有代码执行完毕，说明没有出现异常  提交事务
            connection.commit();
        } catch (Exception e) {
            // 如果捕获异常 说明出问题 回滚
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
