package esercitazione1;

import java.util.Scanner;

public class Esercizio14 {

	public static void main(String[] args) {
		
		for(int i=1;i<101;i++){
			if(i%3==0&&i%5==0) {
				System.out.println(i+" Ciao, Mondo");
			}else if(i%3==0) {
				System.out.println(i+" Ciao");
			}else if(i%5==0) {
				System.out.println(i+" Mondo");
			}else {
				System.out.println(i);
			}
		}
		

	}

}
