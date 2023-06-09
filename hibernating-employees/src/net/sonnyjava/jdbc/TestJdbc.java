package net.sonnyjava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/employees?"
				+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "hbstudent";
		String password = "hbstudent";
		
		//1. Just load the Driver:
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get a connection:
		Connection conn = DriverManager.getConnection(url, username, password);
		
		System.out.println("Successfully Connected!");

	}

}
