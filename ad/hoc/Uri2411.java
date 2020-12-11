package ad.hoc;

import java.util.Scanner;

public class Uri2411 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		boolean tabuleiro[][] = new boolean[8][8];
		int x = 4, y = 3;
		int movimento;
		int cont = 0;

		int numov;
		numov = ler.nextInt();
		
		for( int i =0;i<numov;i++) {
						
			movimento=ler.nextInt();
			switch (movimento) {
			case 1:

				x = x +1;
				y =  y +2;
				break;

			case 2:
				x = x+2;
				y = y+1;
				break;
			case 3:
				x = x+2;
				y = y-1;
				break;
			case 4:
				y = y-2;
				x = x+1;
				break;
			case 5:
				y = y-2;
				x = x-1;
				break;
			case 6:
				x = x-2;
				y = y-1;
				break;
			case 7:
				x =x -2;
				y = y+1;
				break;
			case 8:
				y = y+2;
				x = x-1;
				break;
			default:
				System.out.println("aaaaaaaa");
			}


			tabuleiro[1][3] = true;
			tabuleiro[2][3] = true;
			tabuleiro[2][5] = true;
			tabuleiro[5][4] = true;


			if (tabuleiro[x][y] == true) {

				
				cont++;
				break;
				

			}
			else {
				cont++;
			}

			
			
		}



		System.out.println(cont);

	}
}
