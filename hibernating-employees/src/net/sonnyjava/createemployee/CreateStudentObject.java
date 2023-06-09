package net.sonnyjava.createemployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import net.sonnyjava.entity.Employee;
import net.sonnyjava.entity.Employee2;

public class CreateStudentObject {

	public static void main(String[] args) {
		
		//Create Session Factory:
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Employee2.class)
								 .buildSessionFactory();
		
		//Create a Session:
		Session session = factory.getCurrentSession();
		
		try {
			
			//Create a student object:
			System.out.println("Creating employee objects!");
			
			Employee2 tempEmp1 = new Employee2("Brandon", "Steve", "bsteve@google.com","MN", "23451","F", "1978/05/29");
			
			//Start the transaction:
			session.beginTransaction();
			
			//Save the student object:
			System.out.println("Saving employee objects!");
			session.save(tempEmp1);
			
			
			//Commit the transaction:
			session.getTransaction().commit();
			
			System.out.println("SUCCESSFULLY INSERTED!!!");
					
		} finally {
			
			factory.close();
			
		}		
		
	}

}
