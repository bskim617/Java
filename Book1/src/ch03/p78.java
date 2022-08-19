package ch03;

public class p78 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);						// 앞 항의 결과가 거짓 이므로 이항은 실행 되지 않음 따라서 i= 2
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);				// 압 항의 결과가 참이므로 실행 안됨 i=2
		System.out.println(num1);
		System.out.println(i);
		
		
	}

}
