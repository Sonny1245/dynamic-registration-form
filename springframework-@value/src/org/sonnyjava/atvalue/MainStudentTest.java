package org.sonnyjava.atvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student myStudent = context.getBean("student", Student.class);
		myStudent.displayStudentInfo();

	}

}
