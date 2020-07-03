package ml.assmann;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variablen deklarieren und initialisieren
		int gewicht = 0, alter = 0;
		double groesse =1.0, bmi = 0.0;
		String ausgabe = "";
		String gut = "Sie haben Normalgewicht.";
		String schlecht = "Sie sollten besser auf ihr Gewicht achten.";
		
		//Abfrage der Daten
		System.out.println("Dieses Programm bewertet ihren BMI.");
		System.out.println("Bitte geben sie ihr Gewicht in kg an:");		
		gewicht = sc.nextInt();
		System.out.println("Bitte geben sie ihre Groesse in m an:");		
		groesse = sc.nextDouble();
		System.out.println("Bitte geben sie ihr Alter in Jahren an:");		
		alter = sc.nextInt();
		
		//Berechnen des BMI
		bmi = gewicht / (groesse * groesse);
		
		//Ueberpruefung der Gesundheit (mit if else, da switch case noch nicht besprochen)
		if (alter >= 19 && alter <= 24) ausgabe = (bmi >= 19 && bmi <= 24) ? gut : schlecht;
		else if (alter >= 25 && alter <= 34) ausgabe = (bmi >= 20 && bmi <= 25) ? gut : schlecht;
		else if (alter >= 35 && alter <= 44) ausgabe = (bmi >= 21 && bmi <= 26) ? gut : schlecht;
		else if (alter >= 45 && alter <= 54) ausgabe = (bmi >= 22 && bmi <= 27) ? gut : schlecht;
		else if (alter >= 55 && alter <= 64) ausgabe = (bmi >= 23 && bmi <= 28) ? gut : schlecht;
		else if (alter > 64) ausgabe = (bmi >= 24 && bmi <= 29) ? gut : schlecht;
		
		System.out.println(ausgabe);
		
		// Debug
//		System.out.println("Gewicht:" + gewicht);
//		System.out.println("Groesse: " + groesse);
//		System.out.println("Alter: " + alter);
//		System.out.println("BMI: "+ bmi);
		
	}
}
