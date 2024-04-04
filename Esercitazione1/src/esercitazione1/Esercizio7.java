package esercitazione1;

import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
		int i=1;
		
		while(i!=0) {
			System.out.println("Dammi un numero da uno a sette per avere il giorno della settimana");
			int num=s.nextInt();
			if(num<8&&num>0) {
				System.out.println("Il giorno numero "+num+" è: "+giorni[num-1]);
				i=0;
			}else {
				System.out.println("Il numero non va bene, riprova");
			}
		}
		

	}

}
