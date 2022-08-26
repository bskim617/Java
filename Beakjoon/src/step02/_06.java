package step02;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
        int m = sc.nextInt();
        int need = sc.nextInt();
        sc.close();

        int a = h*60 + m + need;
        h = a/60;
        m = a%60;
        
        if(h>23) { 
        	h = h - 24; 
        	}
        System.out.println(h + " " + m);

	}
}
