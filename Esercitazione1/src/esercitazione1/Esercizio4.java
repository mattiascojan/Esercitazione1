package esercitazione1;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int max=s.nextInt();
		int min=0;
		min=max;
		for(int i=0;i>-1;i++) {
			System.out.println("Vuoi inserire un altro numero? se no metti 0");
			int x=s.nextInt();
			if(x==0) {
				break;
			}else {
				if(max<x) {
					max=x;
				}
				if(min>x) {
					min=x;
			}
		}
	}
		System.out.println("Il numero più grande era: "+max+"\nMentre quello più piccolo era: "+min);
	}
}
