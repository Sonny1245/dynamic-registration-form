package org.sonyjava.createstudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sonnyjava.entity.Student;

public class CreateStudentObject {

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
			
			Student tempStudent1 = new Student("Kendra", "Nguyen", "knguyen@gmail.com");
			Student tempStudent2 = new Student("Sonny", "Nguyen", "snguyen@yahoo.com");
			Student tempStudent3 = new Student("Lieu", "Huynh", "lhuynh@elkgrove.org");
			Student tempStudent4 = new Student("Dean", "Nguyen", "dnguyen@gmail.com");
			Student tempStudent5 = new Student("Alan", "Nguyen", "anguyen@gmail.com");
			
			//Start the transaction:
			session.beginTransaction();
			
			//Save the student object:
			System.out.println("Saving student objects!");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.save(tempStudent4);
			session.save(tempStudent5);
			
			//Commit the transaction:
			session.getTransaction().commit();
			
			System.out.println("DONE!");
					
		} catch(Exception exc) {
		    exc.printStackTrace();
		} finally {
			
			factory.close();
			
		}		
		
	}

}
