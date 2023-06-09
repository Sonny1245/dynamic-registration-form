package com.student.sonny.java;

public class Student {
    
    int studentID;
    String name;
    
    
    Student(){
        studentID = 1;
        name = "defaulName";
    }
    
    public void update(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    
    public int marksID(Student s) {
        this.studentID = s.studentID;        
        return studentID;
    }
    
    public String callName(Student n) {
        this.name = n.name;
        return name;
    }

}
