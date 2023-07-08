package com.hainiu.jdbc1;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description
 */
public class Demo06_jdbc {
    public static void main(String[] args) throws Exception {

        // 通过工具类获取连接
        Connection connection = JDBCUtil.getConnection();

        /*
        // 处理sql语句
        Statement statement = connection.createStatement();
        // 查询商品价格大于5000的
        // 接收参数 进行拼接
        String p = "5000 or 1=1";
        // 把用户输入的参数当成了sql语句的关键词 从而改变了原来sql的语义 -- SQL注入
        String sql = "select * from product where price > " + p;

        ResultSet resultSet = statement.executeQuery(sql);
        */

        // 获取预处理对象 预处理sql语句  语句中的参数 先试用?占位符 占位
        String sql = "select * from product where price > ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        String p = "5000 or 1=1";
        // 设置参数
        preparedStatement.setString(1, p);

        // 执行
        ResultSet resultSet = preparedStatement.executeQuery();


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

        // 通过工具类释放资源
        JDBCUtil.close(resultSet, preparedStatement, connection);
    }
}
