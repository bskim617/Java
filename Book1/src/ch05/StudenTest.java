package ch05;

//p146

public class StudenTest {
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		//p148
		Student student1 = new Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		Student student2 = new Student();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}

}
