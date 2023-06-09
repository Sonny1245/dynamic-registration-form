package org.sonyjava.createstudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sonnyjava.entity.Student;

public class ReadStudentObject {

	public static void main(String[] args) {
		
		//Create Session Factory:
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//Create a Session:
		Session session = factory.getCurrentSession();
		
		try {
			
			//Create a student object:
			System.out.println("Creating student objects!");
			
			Student newStudent = new Student("Steve", "Smith", "ssmith@google.com");
			
			//Start the transaction:
			session.beginTransaction();
			
			//Save the student object:
			System.out.println("Saving student objects!");
			session.save(newStudent);
			
			//Commit the transaction:
			session.getTransaction().commit();
			
			//New Code here  for Reading the newStudent by getId():
			
			//new transaction again:
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//Retrieve the student by getting the id:
			System.out.println("New Student id: " + newStudent.getId());
			
			Student myStudent = session.get(Student.class, newStudent.getId());
			
			System.out.println("Get new Student id complete: " + myStudent);
			
			System.out.println("DONE!");
					
		} finally {
			
			factory.close();
			
		}		
		
	}

}
