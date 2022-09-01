package ch07;

public class p212 {
	public static void main(String[] args) {
		int [] arry1 = {10, 20, 30, 40, 50};
		int [] arry2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(arry1, 0, arry2, 1, 4);
		for(int i =0; i < arry2.length; i++) {
			System.out.println(arry2[i]);
		}
	}

}
