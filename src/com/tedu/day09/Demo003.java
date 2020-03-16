package com.tedu.day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo003 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hero?characterEcoding=UTF-8","root","123456");
		System.out.println("连接成功");
		Statement createStatement = connection.createStatement();
		String sql ="select count(*) from hero";
		ResultSet executeQuery = createStatement.executeQuery(sql);
		int total = 0 ;
		while(executeQuery.next()) {
			total = executeQuery.getInt(1);
		}
		System.out.println(total);
	}
	

}
