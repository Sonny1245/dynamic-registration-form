package studen.getterandsetter.sonn.java;

public class StudentInfo {
    
    private int studentID;
    private String studentName;
    
    
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    @Override
    public String toString() {
        return "StudentInfo [studentID=" + studentID + ", studentName=" + studentName + "]";
    }
    

}
