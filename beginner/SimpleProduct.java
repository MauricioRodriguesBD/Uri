

/*Read two integer values. After this,
 *  calculate the product between them
 *   and store the result in a variable 
 *   named PROD. Print the result like
 *    the example below. Do not forget 
 *    to print the end of line after the
 *     result, otherwise you will receive
 *      “Presentation Error”.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to 
the following example, with a blank space before and after the equal signal.

package beginner;
import java.util.Scanner;
*/
package beginner;

import java.util.Scanner;

public class SimpleProduct {
public static void main(String[] args) {
	
	int a,b,PROD;
	
	
	Scanner ler = new Scanner(System.in);
	a = ler.nextInt();
	b = ler.nextInt();
	PROD = a * b;
	System.out.println("PROD = " + PROD);
	
	
}
}
