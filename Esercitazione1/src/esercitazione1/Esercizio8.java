package esercitazione1;

import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Dammi 5 numeri");
		int[] numeri= new int[5];
		int contatore=0;
		for(int i=0;i<5;i++) {
			numeri[i]=s.nextInt();
			contatore=contatore+numeri[i];
		}
		System.out.println("La somma dei numeri dati vale: "+contatore+".\nMentre la loro media vale: "+contatore/5);
		

	}

}
