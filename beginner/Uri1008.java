package beginner;
import java.util.Scanner;
public class Uri1008 {
	public static void main(String[] args) {
		

	Scanner ler = new Scanner(System.in);
	int a,b;
	double c;
	a = ler.nextInt();
	b = ler.nextInt();
	c = ler.nextDouble();
	c = c * b;
	System.out.println("NUMBER = " + a);
	System.out.printf("SALARY = U$ %.2f ",c );
}
}