package studen.getterandsetter.sonn.java;

public class MainTest {

    public static void main(String[] args) {
        
        
        StudentInfo  std = new StudentInfo();
        
        std.setStudentID(333);
        std.setStudentName("Sonny Nguyen");
        
        System.out.println("StudentID: " + std.getStudentID() + "\nStudent Name: "
        + std.getStudentName());
        

    }

}
