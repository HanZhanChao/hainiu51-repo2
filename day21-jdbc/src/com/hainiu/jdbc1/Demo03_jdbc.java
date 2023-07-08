package com.hainiu.jdbc1;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03_jdbc {

    public static void main(String[] args) throws Exception {

        // 通过工具类获取连接
        Connection connection = JDBCUtil.getConnection();

        // 处理sql语句
        Statement statement = connection.createStatement();
        String sql = "delete from category where cid = 6";
        int rows = statement.executeUpdate(sql);
        System.out.println(rows);

        // 通过工具类释放资源
        JDBCUtil.close(statement, connection);

    }
}
