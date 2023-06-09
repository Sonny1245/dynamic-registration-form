package org.sonyjava.createstudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sonnyjava.entity.Student;

public class UpdateStudentObject {

	public static void main(String[] args) {
		
		//Create Session Factory:
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//Create a Session:
		Session session = factory.getCurrentSession();
		
		try {
			
			int studentId = 1;
			
			//new transaction again:
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//Retrieve the student by getting the id:
			System.out.println("\nGetting student id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("Kendra");
			
			//Commit the transaction:
			session.getTransaction().commit();
			
			System.out.println("Update Complete!");
					
		} finally {
			
			factory.close();
			
			
		}		
		
	}

}
