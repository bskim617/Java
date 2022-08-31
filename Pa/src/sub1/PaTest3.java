package sub1;

public class PaTest3 {
	public static void main(String[] args) {
		//문제 3-1
		int N = 5;
		for(int a = 1; a <= N; a++ ) {
			
		for(int b = 0; b<N; b++) {
				if(b<(N-a)) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//문제 3-2
		int n =4;
		
		for(int i = 0 ; i<n ; i++) {
			
			for(int j=n-1 ; j>i ; j--) {
				System.out.print("☆");
			}
			for(int j=0 ; j<2*i+1 ; j++) {
				System.out.print("★");
			}
			for(int j=n-1 ; j>i ; j--) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		
	}

}
