package beginner;
import java.util.Scanner;
public class Uri3047 {
	public static void main(String[] args) {
		int M,A,B;
		Scanner entrada = new Scanner (System.in);
		M = entrada.nextInt();
		A = entrada.nextInt();
		B = entrada.nextInt();
	 M = M - (A + B);
	 if(M <= 1) {
		 M = M * -1;
		 }
	 if(M > A && M > B) {
	  System.out.println(M);
	 }
	 else if (A > M && A > B) {
		 System.out.println(A);
	 }
	 else if (B > M && B > A) {
		 System.out.println(B);
	 }
	 
	}
	 
}
