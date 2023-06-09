package com.student.sonny.java;

public class MainTestStudent {

    public static void main(String[] args) {
        
        
        Student stu = new Student();
        stu.update(896,"John Doe");
        
        System.out.println("Student ID: " +stu.marksID(stu)+ "\nStudent Name: "
        + stu.callName(stu));
        

    }

}
