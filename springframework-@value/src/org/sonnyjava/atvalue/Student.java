package org.sonnyjava.atvalue;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.course}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;

	public void displayStudentInfo() {

		System.out.println("My name is: " + name);
		System.out.println("My course is: " + interestedCourse);
		System.out.println("And my hobby is: " + hobby);
	}

}
