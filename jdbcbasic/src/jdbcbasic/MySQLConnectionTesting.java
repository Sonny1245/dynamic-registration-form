package jdbcbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String url = "jdbc:mysql://localhost:3306/employees?"
				+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "hbstudent";
		String password = "hbstudent";
		
		//1. Just load the Driver:
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get a connection:
		Connection conn = DriverManager.getConnection(url, username, password);
		
		//3. Create a statement:
		Statement myStmt = conn.createStatement();
		
		//4. ResultSet:
		ResultSet myRes = myStmt.executeQuery("select * from employee");
		
		//5. Loop through the resultSet:
		
		
		while(myRes.next()) {
			//System.out.println(myRes.getString("first_name")+ ", "+ myRes.getString("last_name"));
				
			int id = myRes.getInt(1);
			String first_name = myRes.getString(2);
			String last_name = myRes.getString(3);
			String userName = myRes.getNString(4);
					
			System.out.println(id + " " + first_name + " " + last_name + " "+ userName);
			
		}
		
			
	}

}
