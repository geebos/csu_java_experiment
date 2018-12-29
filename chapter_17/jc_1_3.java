/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_17;

import java.sql.*;

public class jc_1_3 {
    public static void main(String args[]){
        String url = "jdbc:mysql://localhost:3307/test";
        String queryString = "SELECT name,born,address FROM student";

        try {
            Connection con;
            Statement stmt;
            con=DriverManager.getConnection(url,"root","1234");
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(queryString);

            while(rs.next()){
                String s=rs.getString("name");
                Date d=rs.getDate("born");
                String p=rs.getString("address");
                System.out.println(s+" "+d+" "+p);
            }

            stmt.close();
            con.close();
        }catch(SQLException ex){}
    }
}

