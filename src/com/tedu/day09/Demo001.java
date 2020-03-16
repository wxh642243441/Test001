package com.tedu.day09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo001 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/hero?characterEcoding=UTF-8", "root", "123456");
			System.out.println("连接成功" + connection);
			Statement statement = connection.createStatement();
			/*for (int i = 0; i < 100; i++) {
				String insert = "insert into hero values(null,'timo"+i+"',100.5)";
				statement.execute(insert);
			}*/
			System.out.println("插入成功");
			String delete ="delete from hero where id =2";
			//statement.execute(delete);
			System.out.println("刪除成功");
			String sql = "select * from hero";
			ResultSet executeQuery = statement.executeQuery(sql);
			while(executeQuery.next()) {
				int id = executeQuery.getInt("id");
				String name =executeQuery.getString("name");
				int  hp = executeQuery.getInt("hp");
				System.out.println("id:"+id+"  name:"+name+"  hp:"+hp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
