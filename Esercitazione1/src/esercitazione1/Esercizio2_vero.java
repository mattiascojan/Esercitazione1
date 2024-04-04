package esercitazione1;

import java.util.Scanner;



public class Esercizio2_vero {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Inserisci il numero");
		int numero=s.nextInt();
		int zeri=10, cont=1;
		for(int i=0;i>-1;i++) {
			if(numero>zeri) {
				cont++;
				zeri=zeri*10;
			};
		};
		System.out.println("Il numero ha "+cont+" cifre.");
		

	}

}
