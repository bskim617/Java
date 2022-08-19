package sub3;

/*
 * 날짜 : 2022/08/17
 * 이름 : 김보성
 * 내용 : Java 반복문 For 실습하기 
 */
public class Fortest {
	
	public static void main(String[] args) {
		
		//For
		
		for(int i=1 ; i<=5 ; i++) {	
			System.out.println("i : "+i);
		}
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			
			sum += k; // +=, sum = sum + k 같음 
			
		}
		System.out.println("1부터 10까지 합 : "+sum);
		
		// 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1; k<=10; k++) {
			if(k % 2 == 0 ) {
				tot += k;
			}
			
		}
			System.out.println("1부터 10까지 짝수합 : "+tot);
		
		// 중첩 for
			
		for(int a=1; a<=3; a++) {
			
			System.out.println("a : "+a);
			
			for(int b=1; b<=5; b++) {
				
				System.out.println("b : "+b);
				
			}
		}
			
		// 구구단
		for(int x =2; x <= 9; x++) {
			
			System.out.println(x + "단");
			
			for(int y=1; y<=9; y++ ) {
				
				int z = x * y;
				System.out.println(x + " x " + y + " = " + z);
						
				
			}
		}
		// 별삼각형
		for(int start = 10; start >= 1; start--)  {
		//별이 10부터 1씩 감소	
			// for(int start = 1; start >= 10; start++) 별이 1씩 증가)
			for(int end = 1; end <= start; end++) {
			//이걸 바꿔도 바뀜	
				System.out.print("☆");
			}
			System.out.print("\n"); // 개행(줄바꿈)			
		}
	}
}
