package jdbcbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMySQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/employees?"
				+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "hbstudent";
		String password = "hbstudent";

		// 1. Just load the Driver:
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Get a connection:
		Connection conn = DriverManager.getConnection(url, username, password);

		// 3. Create a statement:
		Statement myStmt = conn.createStatement();

		String INSERT_SQL = "Insert into employee"
				+ "(first_name, last_name, username, password, address, contact) "
				+ "VALUES('Jenifer', 'Lopel', 'jen3456', 'acv234!', '1576 Driver Way LA', '976-342-0909')";
				
		myStmt.executeUpdate(INSERT_SQL);

		System.out.println("Insert New Employee Successfully!");

	}

}
