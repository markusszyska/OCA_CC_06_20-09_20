package ml.axelschlewing_tag05.ml_axelschlewing_02;

import java.util.Scanner;

public class ml_axelschlewing {

public static void main(String[] args) {
	
	System.out.println("Bitte die Stückzahl eingeben:");
	
	/* Eingabe Stücke */
		Scanner eingabe_stueck = new Scanner(System.in);
		int stueck = eingabe_stueck.nextInt();
	
	/* Eingabe Original-Preis pro Stück */
		System.out.println("Bitte den Einkaufspreis eingeben:");
		Scanner eingabe_preis = new Scanner(System.in);
		double preis = eingabe_preis.nextDouble();
		
	/* Initialisierung rabatt und endpreis */
		double rabatt;
		double endpreis = 0;
	
	/* Berechnung Rabatt */
		if (stueck <= 10)
			{
				endpreis = stueck*preis;
			}
		
		if (stueck >= 11)
			{	
				rabatt = 0.95;
				endpreis = stueck*preis*rabatt;
			}
		
		if (stueck >= 51)
			{	
				rabatt = 0.90 ; 
				endpreis = stueck*preis*rabatt;
			}
		
	/* Ausgabe */
		System.out.println("Der Gesamteinkauf beträgt :" + endpreis + " Euro");
	}
}