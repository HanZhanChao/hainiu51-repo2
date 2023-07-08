package com.hainiu.jdbc4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author HaiNiu
 * @description
 */
public class Demo_query {
    public static void main(String[] args) {
        // 通过工具类获取连接
        try (Connection connection = JdbcUtil.getConnection()){
            // 获取预处理对象
            String sql = "select p.pid, p.pname, p.price, c.cid, c.cname from product p JOIN category c on p.cid = c.cid where p.price > ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, 5000);
            // 执行
            ResultSet resultSet = preparedStatement.executeQuery();
            // 处理结果集
            while (resultSet.next()) {
                int cid = resultSet.getInt("cid");
                String cname = resultSet.getString("cname");
                Category category = new Category(cid, cname);

                int pid = resultSet.getInt("pid");
                String pname = resultSet.getString("pname");
                double price = resultSet.getDouble("price");

                Product product = new Product(pid, pname, price, category);
                System.out.println(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
