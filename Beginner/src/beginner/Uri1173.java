package beginner;

import java.util.Scanner;

public class Uri1173 {
	public static void main(String[] args) {
		int N[] = new int[10];

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			
			if(N[i] == N[0]) {
				N[i] = ler.nextInt();
				i++;
			}
			
			N[i] = N[i-1] * 2;
			
			
		}
		for (int i = 0; i < 10; i++) {

			System.out.printf("N[%d] = %d\n", i,N[i]);
		}

	}
}
