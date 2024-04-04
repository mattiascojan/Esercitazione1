package esercitazione1;

import java.util.Scanner;

public class Esercizio12 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Dammi i tre numeri");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		if(num1<num2&&num2<num3) {
			System.out.println("I numeri sono stati inseriti in ordine crescente");
		}else if(num1>num2&&num2>num3) {
			System.out.println("I numeri sono stati inseriti in ordine decrescente");
		}else if(num1==num2&&num1==num3) {
			System.out.println("Furbetto i numeri sono uguali");
		}else {
			System.out.println("Nessun ordine");
		}
		

	}

}
