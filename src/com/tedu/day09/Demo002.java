package com.tedu.day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo002 {
	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/hero?characterEcoding=UTF-8", "root", "123456");
			Statement createStatement = connection.createStatement();
			String name ="admin";
			String password ="123456";
			String sql ="select * from user where name='"+name+"' and password='"+password+"'";
			ResultSet executeQuery = createStatement.executeQuery(sql);
			if(executeQuery.next()) {
				System.out.println("用户名："+name+"  密码："+password);
			}else {
				System.out.println("无");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
