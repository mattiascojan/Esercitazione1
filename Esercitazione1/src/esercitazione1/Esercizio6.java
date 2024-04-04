package esercitazione1;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Dammi la stringa");
		String str=s.nextLine();
		System.out.println("Dammi il carattere da cercare");
		char c=s.next().charAt(0);
		if(str.indexOf(c)!=-1) {
			System.out.println("Il carattere è presente nella stringa");
		}else {
			System.out.println("Il carattere non è presente nella stringa");
		}
		
	}

}
