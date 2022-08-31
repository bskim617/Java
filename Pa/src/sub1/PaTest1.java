package sub1;

import java.util.Scanner;

public class PaTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int a = 1;  a <= N;  a++) {
			for(int b = 0;  b <a; b++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	}

}
