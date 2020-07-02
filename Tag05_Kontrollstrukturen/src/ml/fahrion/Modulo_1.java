package ml.fahrion;

import java.util.Scanner;

public class Modulo_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int zahl = sc.nextInt();
	//	System.out.println("Sie haben:"+ zahl +" eingeben ");
	//	int i = 256 ;
		int e = zahl / 100;
		int c = zahl % 100;
		System.out.println("Gesamt Cent:  " + zahl);
		System.out.println("Das entspricht: " + e + "Euro" + c +"Cent");
		
	}

}
