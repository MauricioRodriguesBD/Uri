package beginner;
import java.util.Scanner;
public class Uri1172 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int X[] = new int[10];
		
		for (int i = 0; i<10; i++) {
			X[i]= ler.nextInt();
			if (X[i] <= 0) {
				X[i] = 1;
				
			}
			
		}
		for (int i = 0; i<10; i++) {
			System.out.printf("X[%d] = %d\n", i ,	X[i]);
		
		}
		
		
	}

	
	
}
