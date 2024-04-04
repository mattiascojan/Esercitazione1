package esercitazione1;

import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		System.out.println("Dammi il numero di righe");
		int r=s.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
