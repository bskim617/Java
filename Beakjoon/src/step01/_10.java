package step01;
/*
 * 이해안감
 */
import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []A = new int[6];
		int []B = new int[6];
		int []chess = {1,1,2,2,2,8};
		
		for(int i = 0 ; i < 6 ; i++) {
			A[i] = sc.nextInt();
		}
		for(int j = 0 ; j < 6 ; j++) {
			B[j] = chess[j]-A[j];
			System.out.print(B[j]+" ");
		}
	}

}
