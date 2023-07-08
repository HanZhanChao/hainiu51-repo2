package com.hainiu.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04_jdbc {
    public static void main(String[] args) throws Exception {

        // 通过工具类获取连接
        Connection connection = JDBCUtil.getConnection();

        // 处理sql语句
        Statement statement = connection.createStatement();
        String sql = "select * from product";

        ResultSet resultSet = statement.executeQuery(sql);

        ArrayList<Product> list = new ArrayList<>();
        // 解析结果集
        while (resultSet.next()) {
            int id = resultSet.getInt("pid");
            String name = resultSet.getString("pname");
            double price = resultSet.getDouble("price");

            // 封装成一个javabean对象
            Product product = new Product(id, name, price);
            list.add(product);
        }

        // 整个集合存储的数据 传递到下一步
        for (Product product : list) {
            System.out.println(product);
        }

        // resultSet.close();
        // 通过工具类释放资源
        JDBCUtil.close(resultSet, statement, connection);
    }
}
