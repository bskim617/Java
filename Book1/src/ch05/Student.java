package ch05;

// p129
public class Student {
	
	int studentID;
	// p162 - 정보은닉 private사용 studenttest 클래스 오류발성 
	private String studentName;
	int grade;
	String address;
	// p164 오류 막기위해 get set매서드 사용
	public String getstudentName() {
		return studentName;
	}
	
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	
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
