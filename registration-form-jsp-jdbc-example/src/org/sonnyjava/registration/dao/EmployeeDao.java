package org.sonnyjava.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.sonnyjava.registration.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException, SQLException {

		String INSERT_USERS_SQL = "INSERT INTO employee"
				+ "(first_name,last_name, username, password, address, contact) VALUES" + "(?,?,?,?,?,?);";

		int result = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?"
				+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"hbstudent", "hbstudent");

		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
	
		preparedStatement.setString(1, employee.getFirstName());
		preparedStatement.setString(2, employee.getLastName());
		preparedStatement.setString(3, employee.getUserName());
		preparedStatement.setString(4, employee.getPassword());
		preparedStatement.setString(5, employee.getAddress());
		preparedStatement.setString(6, employee.getContact());

		System.out.println(preparedStatement);

		result = preparedStatement.executeUpdate();

		return result;

	}

}
