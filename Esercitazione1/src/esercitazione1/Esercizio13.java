package esercitazione1;

import java.util.Scanner;

public class Esercizio13 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Dammi i due numeri");
		int num1=s.nextInt();
		int num2=s.nextInt();
		if(num1==num2) {
			System.out.println("I numeri sono uguali");
		}else {
			if(num1>100&&num2>100) {
				if(num1>num2) {
					System.out.println(num2+" è più vicino a 100 di "+num1);
				}else {
					System.out.println(num1+" è più vicino a 100 di "+num2);
				}
			}else if(num1<100&&num2<100) {
				if(num1>num2) {
					System.out.println(num1+" è più vicino a 100 di "+num2);
				}else {
					System.out.println(num2+" è più vicino a 100 di "+num1);
				}
			}else if(num1>100&&num2<100) {
				if(num1-100<100-num2) {
					System.out.println(num1+" è più vicino a 100 di "+num2);
				}else {
					System.out.println(num2+" è più vicino a 100 di "+num1);
				}
			}else {
				if(num2-100<100-num1) {
					System.out.println(num2+" è più vicino a 100 di "+num1);
				}else {
					System.out.println(num1+" è più vicino a 100 di "+num2);
				}
			}
		}

	}

}
