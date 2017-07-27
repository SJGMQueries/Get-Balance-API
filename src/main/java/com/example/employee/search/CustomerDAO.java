package com.example.employee.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {

	public static double getBalance(int id) throws ClassNotFoundException,
			SQLException {
		double balance = 0;
		String querry = "Enter querry";
		Class.forName("Enter Driver class name");
		String url = "Enter URL";
		String username = "user";
		String pwd = "pwd";
		Connection conn = DriverManager.getConnection(url, username, pwd);
		PreparedStatement ps = conn.prepareStatement(querry);
		ps.setInt(1, id);
		ResultSet resultSet = ps.executeQuery();
		while (resultSet.next()) {
			balance = resultSet.getDouble(1);
			System.out.println(balance);
		}
		return balance;
	}
}
