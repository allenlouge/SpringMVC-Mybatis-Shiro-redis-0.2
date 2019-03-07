package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 测试连接
 * 
 * @author 温暖wk
 *
 */
public class DBConnectionTestDemo {
	public static void main(String[] args) {
		String name;
        //加载驱动类
        try {
            //Class.forName("com.mysql.jdbc.Driver");   
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql8以上
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mytest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT&useSSL=false","root","root");
            if(!conn.isClosed())
 				System.out.println("Succeeded connecting to the Database!");
 				Statement statement = conn.createStatement();
 				String sql = "select * from u_user";
 				ResultSet rs = statement.executeQuery(sql);
 				while(rs.next()) {
 	               name = rs.getString("id");     
 	               System.out.println(rs.getString("id") + "\t" + name);
 	             } 
 				rs.close();       
 				conn.close(); 
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	public static int add(int a,int b) {
		return a + b;
	}
}
