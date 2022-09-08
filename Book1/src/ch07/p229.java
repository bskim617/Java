package ch07;

public class p229 {
	public static void main(String[] args) {
		Student_p227 studentLee = new Student_p227(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 75);
		
		Student_p227 studentKim = new Student_p227(1001, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStuedentInfo();
		System.out.println("=======================");
		studentKim.showStuedentInfo();
	}
}
