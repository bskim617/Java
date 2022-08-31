package ch06_1;
//p184
public class Student1 {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentNumber() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
