package com.sonny.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student st = context.getBean("student", Student.class);
        st.displayInfo();
        

    }

}
