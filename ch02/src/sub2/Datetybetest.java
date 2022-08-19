package sub2;

/*
 * 날짜 : 2022/08/16
 * 이름 : 김보성
 * 내용 : Java 변수의 자료형 실습하기  
 */
public class Datetybetest {
	public static void main(String[] args) {
		
		// 정수형
		byte  num1 = 127;
		short num2 = 32767;
		int   num3 = 2147483647;
		long  num4 = 922337203685477507L;
		
		System.out.println("num : " + num1);
		System.out.println("num : " + num2);
		System.out.println("num : " + num3);
		System.out.println("num : " + num4);
		
		// 실수형
		float  var1 = 0.123456789f;
		double var2 = 0.1234567890123456789;// 더 많이쓰임
		
		System.out.println("var1 : " + var1);//소수점  8자리
		System.out.println("var1 : " + var2);//소수점 17자리
		
		// 논리형
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 : "+b1);
		System.out.println("b1 : "+b2);
		
		// 문자형
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 = "+c1);
		System.out.println("c1 = "+c2);
		
		// 문자열
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";
		String str5 = "Hello World";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println("str5 : "+str5);
	}

}
