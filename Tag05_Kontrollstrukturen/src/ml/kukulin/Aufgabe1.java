package ml.kukulin;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int zahl = sc.nextInt();
		int euro = zahl/100;
		int cent = zahl%100;
		
		
		System.out.println("Das macht: " + euro + " Euro " + cent + " Cent" );
		
		
		
		
		
	}
}