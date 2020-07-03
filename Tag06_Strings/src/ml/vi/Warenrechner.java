package ml.vi;

import java.util.Scanner;

public class Warenrechner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Kommabeträge mit , und nicht mit . eingeben");
		System.out.print("Stückzahl eingeben: ");
		double anzahl = sc.nextDouble();
		System.out.print("Einzelpreis in € eingeben: ");
		double preis = sc.nextDouble();

		double rabatt = 0;
		
		if( anzahl > 10 )
			rabatt = 0.05;
		if( anzahl > 50 )
			rabatt = 0.10;
		
		System.out.println("Der Gesamtpreis beträgt: " + (anzahl * preis * (1 - rabatt)) + " €");
		
		sc.close();
	}

}
