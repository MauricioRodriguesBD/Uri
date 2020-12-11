package beginner;

import java.util.Scanner;

public class Uri1174 {
	public static void main(String[] args) {
		double A[] = new double [11];
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0 ; i <A.length;i++) {
			A[i] = ler.nextDouble();
			
			
		}
		
		for(int i = 0;i<A.length;i++) {
			if(A[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i,A[i]);
			}
			
		}
	}

}
