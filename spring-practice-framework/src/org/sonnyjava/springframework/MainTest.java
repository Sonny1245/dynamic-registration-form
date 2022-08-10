package org.sonnyjava.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Shape shape = context.getBean("rectangle", Shape.class);
		shape.showCoordinates();
		
		//Display the text Message from message.properties file:
		/*
		 * String myMessage = context.getMessage("greeting", null, "Default Message",
		 * null); System.out.println(myMessage);
		 */
		
	}

}
