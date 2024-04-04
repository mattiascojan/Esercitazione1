package esercitazione1;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Dammi i tre lati del triangolo per vedere se va bene:");
		int l1=s.nextInt();
		int l2=s.nextInt();
		int l3=s.nextInt();
		if((l1<l2+l3)&&(l2<l1+l3)&&(l3<l1+l2)) {
			System.out.println("Il triangolo va bene");
		}else {
			System.out.println("Il triangolo non va bene");
		}
		
	}

}
