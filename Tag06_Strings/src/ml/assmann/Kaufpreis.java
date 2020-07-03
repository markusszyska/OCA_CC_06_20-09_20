package ml.assmann;

import java.util.Scanner;

public class Kaufpreis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variablen deklarieren und initialisieren
		int stueckzahl = 0;
		double einzelpreis = 0.0, gesamtpreis = 0.0;
		
		//Abfragen
		System.out.println("Wieviele moechten sie kaufen?");
		stueckzahl = sc.nextInt();
		System.out.println("Was kostet eines?");
		einzelpreis = sc.nextDouble();
		
		
		//Berechnung
		gesamtpreis = stueckzahl * einzelpreis;
		if(stueckzahl > 50) gesamtpreis *= 0.9;
		else if(stueckzahl > 10) gesamtpreis *= 0.95;
		
		//Ausgabe
		System.out.println("Der Gesamtpreis betraegt: " + gesamtpreis + " €.");
		
		
	}
}
