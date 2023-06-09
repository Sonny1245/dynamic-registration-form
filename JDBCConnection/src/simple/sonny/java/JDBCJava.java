package simple.sonny.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCJava {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "hbstudent";
        String password = "hbstudent";
        String query = "Select * from student";
        
        try {
            
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stm = con.createStatement();
            ResultSet result = stm.executeQuery(query);
            
            
            while(result.next()) {
                System.out.println(result.getString("last_name")+", "
                        + result.getString("first_name"));
            }
            
            

    }catch(Exception ex) {
        ex.printStackTrace();
    }


    }

}
