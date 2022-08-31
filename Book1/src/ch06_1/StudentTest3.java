package ch06_1;

public class StudentTest3 {
	public static void main(String[] args) {
		Student1 studentlee = new Student1();
		studentlee.setStudentName("이지원");
		System.out.println(Student1.serialNum);
		System.out.println(studentlee.studentName + " 학번 : "+studentlee.studentID);
		
		Student1 studentson = new Student1();
		studentson.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentson.studentName + " 학번 : "+studentson.studentID);
	}

}
