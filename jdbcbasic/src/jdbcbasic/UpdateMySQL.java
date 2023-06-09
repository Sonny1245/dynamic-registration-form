package jdbcbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMySQL {

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

		String UPDATE_SQL = "update employee "
				+ "set first_name = 'Steven', last_name = 'Smith' " 
				+ "WHERE id = 4";

		myStmt.executeUpdate(UPDATE_SQL);

		System.out.println("Update Completed!");

	}

}
