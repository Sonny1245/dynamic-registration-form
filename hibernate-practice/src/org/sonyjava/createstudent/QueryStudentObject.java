package org.sonyjava.createstudent;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sonnyjava.entity.Student;

public class QueryStudentObject {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Create Session Factory:
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//Create a Session:
		Session session = factory.getCurrentSession();
		
		try {
			
			//Start the transaction:
			session.beginTransaction();
			
			//Query all students:
			List<Student> allStudents = session.createQuery("from Student").list();
			
			//Now display all students:
			displayStudents(allStudents);
			
			//Query students whose lastName = 'Nguyen'
			allStudents = session.createQuery("from Student s where s.lastName='Nguyen'").list();
			System.out.println("Students whose have the last name of Nguyen:");
			displayStudents(allStudents);
			
			//Commit the transaction:
			session.getTransaction().commit();
		
			System.out.println("DONE!");
					
		} finally {
			
			factory.close();
			
		}		
		
	}

	private static void displayStudents(List<Student> allStudents) {
		for(Student students: allStudents) {
			System.out.println(students);
		}
	}

}
