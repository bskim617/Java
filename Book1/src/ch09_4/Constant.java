package ch09_4;

public class Constant {
	int num = 10;
	final int NUM = 100; // 상수 선언 -> final 변수는 상수를 의미.
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		// cons.NUM = 200; 상수네 값을 대입하면 오류 발생
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
