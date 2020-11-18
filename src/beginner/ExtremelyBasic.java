package beginner;
import java.util.Scanner;



/*Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.

Input
The input file will contain 2 integer numbers.

Output
Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.

Obs.: don't forget the endline after all.

*/


public class ExtremelyBasic {
	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in);
	int A;
	int B;
	int X;
	
	A =entrada.nextInt();
	B = entrada.nextInt();
	X = A + B;
	
	System.out.println("X = " + X);
	A =entrada.nextInt();
	B = entrada.nextInt();
	X = A + B;

	System.out.println("X = " + X);
	A =entrada.nextInt();
	B = entrada.nextInt();
	X = A + B;
	System.out.println("X = " + X);
	
	entrada.close();


	
	
	
	}
}
