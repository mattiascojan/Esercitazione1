package esercitazione1;

import java.util.Scanner;

public class Esercizio11 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Dammi il numero di righe");
		int righe=s.nextInt();
		for(int i=1;i<=righe;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		

	}

}
