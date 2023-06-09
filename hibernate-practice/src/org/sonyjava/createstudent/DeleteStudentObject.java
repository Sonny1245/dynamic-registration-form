package org.sonyjava.createstudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sonnyjava.entity.Student;

public class DeleteStudentObject {

	public static void main(String[] args) {
		
		//Create Session Factory:
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//Create a Session:
		Session session = factory.getCurrentSession();
		
		try {
		
			//new transaction again:
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Deleting student...");
			session.createQuery("delete from Student where id = 6").executeUpdate();
			
			//Commit the transaction:
			session.getTransaction().commit();
			
			System.out.println("Successfully Deleted!");
					
		} catch(Exception exc) {
            exc.printStackTrace();
        }finally {
			
			factory.close();
			
			
		}		
		
	}

}
