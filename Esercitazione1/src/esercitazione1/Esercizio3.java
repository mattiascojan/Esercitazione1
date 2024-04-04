package esercitazione1;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Dammi il numero");
		int numero=s.nextInt();
		int cont=0;
		for(int i=1;i<numero;i++) {
			if(numero%i==0) {
				System.out.println(i+" può dividere "+numero);
				cont++;
			};
		};
		System.out.println("Il numero dato ha: "+cont+" divisori, senza contare se stesso.");

	}

}
