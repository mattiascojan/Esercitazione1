package esercitazione1;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Dammi il numero in input");
		int numero=s.nextInt();
		int c1=1, c2=2;
		
		for(int i=1;i<=numero;i++) {
			if(c1>0) {
				System.out.print(i+" "); //controllo se resto sulla stessa linea
				c1--;
			}else {
				System.out.println(); //se non resto sulla stessa linea:
				c1=c2;//mi preparo per la linea successiva
				c2++;//mi preparo per due righe dopo
				i--;//mantengo il numero di adesso per stamparlo nella riga successiva
			}
		}
	
	}
}