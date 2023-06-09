package org.sonnyjava.jdbc;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCConnectionDAO myDB = context.getBean("db", JDBCConnectionDAO.class);
		myDB.displayDBENV();
		myDB.selectAllRows();
		//myDB.deleteRow(5);
		
		context.close();
		
	}

}
