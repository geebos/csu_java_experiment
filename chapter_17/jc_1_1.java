/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_17;


import java.sql.*;

public class jc_1_1 {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3307/test";
        String dropString = "drop table student";
        String createString = "create table student" + "(xuehao INTEGER,"
                + "name VARCHAR(8)," + "born date," + "sex char(2),"
                + "address VARCHAR(32))";

        try {
            Connection con;
            Statement stmt;
            con = DriverManager.getConnection(url, "root", "1234");
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            System.out.println("学生信息表成功删除！");
            stmt.executeUpdate(createString);
            System.out.println("学生信息表创建成功！");
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

