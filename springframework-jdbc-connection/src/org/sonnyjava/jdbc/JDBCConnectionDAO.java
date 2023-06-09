package org.sonnyjava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("db") //No need to define the Bean Object
public class JDBCConnectionDAO {

	@Value("${mysql.url}") //No need to create the Setter() and Getter()
 	private String url;

	@Value("${mysql.userName}")
	private String userName;

	@Value("${mysql.password}")
	private String password;

	@Value("${mysql.driver}")
	private String driver;

	private Connection conn;

	public void displayDBENV() {
		System.out.println("Below are Database ENV: ");
		System.out.println("Url: " + url + "\n" + "User Name: " + userName + "\n" + "Password: " + password + "\n"
				+ "Driver:" + driver);
		System.out.println("====================================================");
	}

	@PostConstruct //Automatically trigger the Connection (Initially)
	public void createDBConnection() throws ClassNotFoundException, SQLException {
		// 1. Driver:
		Class.forName(driver);
		// 2. Connection:
		conn = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Successfully!");
		System.out.println("====================================================");
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		// 3. Create a Statement:
		Statement stmt = conn.createStatement();
		// Step 4: Execute the Statement and Loop over the ResultSet:
		ResultSet rs = stmt.executeQuery("Select * from hb_student_tracker.food");

		while (rs.next()) {
			int id = rs.getInt(1);
			String item = rs.getString(2);
			float price = rs.getFloat(3);		
			System.out.println("Id:" + id + "\n" + "Item: " + item + "\n" + "Price: " + price);
		}
		
}

	public void deleteRow(int id) throws ClassNotFoundException, SQLException {
		// 3. Create a Statement:
		Statement stmt = conn.createStatement();
		// Step 4: Execute the Statement and delete the row as desired
		stmt.executeUpdate("Delete From hb_student_tracker.food where id = " + id);
		System.out.println("Record deleted with the id is: " + id);
		
	}
	
	@PreDestroy //Automatically clean up all connections afterward
	public void closeConnection() throws SQLException {		
		conn.close();
		System.out.println("Closing Connection Completed!");
	}

}
