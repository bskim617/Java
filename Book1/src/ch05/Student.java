package ch05;

// p129
public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// p132
	public void showStudentinfo() {
		System.out.println(studentName + " , " + address );
	}
	//p141
	public String getStudentName() {
		return studentName;
	}
	//p142
	public void setStudentName(String name) {
		studentName = name;
	}
	
	//p144	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
