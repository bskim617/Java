package sub1;

import java.util.Scanner;

public class PaTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int a = 1; a <= N; a++ ) {
			
			for(int b = 0; b<N; b++) {
				if(b<(N-a)) {
					System.out.print(" ");
				}else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
	}

}
