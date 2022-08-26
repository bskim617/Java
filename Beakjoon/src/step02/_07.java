package step02;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();			
		int B = sc.nextInt();			
		int C = sc.nextInt();
	
		
		if(A == B && B == C) {
			System.out.println(10000 + A * 1000);
		}else if(A== B || A == C) {
			System.out.println(10000 + A * 100);
		}else if(B == A || B == C) {
			System.out.println(10000 + B * 100);
		}else {
			System.out.println(Math.max(A, Math.max(B, C))*100);
		}
		
	}

}
