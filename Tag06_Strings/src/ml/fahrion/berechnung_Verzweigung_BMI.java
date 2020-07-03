package ml.fahrion;

import java.util.Scanner;

public class berechnung_Verzweigung_BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float gewicht;
		float groesse;
		float bmi;
		int alter;

		System.out.println("Bitte Körpergewicht in Kilogramm eingeben:");
		gewicht = sc.nextFloat();

		System.out.println("Bitte Körpergröße in Meter eingeben:");
		groesse = sc.nextFloat();

		bmi = gewicht / (groesse * groesse);

		System.out.println("Dein BMI ist : " + bmi);

		System.out.println("Bitte Alter eingeben:");
		alter = sc.nextInt();

		boolean b1 = false;

		if (alter >= 64) {
			if (bmi >= 24 && bmi <= 29) {
				System.out.println("Sehr gut! Dieser Wert liegt für Ihre " + "Altersgruppe im Normalbereich  ");
			}
		}

		if (alter >= 55 && alter < 64) {
			if (bmi >= 23 && bmi <= 28) {
				System.out.println("Sehr gut! Dieser Wert liegt für Ihre " + "Altersgruppe im Normalbereich  ");

				b1 = true;
			}
		}

		if (alter >= 45 && alter <= 54) {

			if (bmi >= 22 && bmi <= 27) {
				System.out.println("Sehr gut! Dieser Wert liegt für Ihre " + "Altersgruppe im Normalbereich  ");
				b1 = true;
			}
		}

		if (alter >= 35 && alter <= 44) {

			if (bmi >= 21 && bmi <= 26) {
				System.out.println("Sehr gut! Dieser Wert liegt für Ihre " + "Altersgruppe im Normalbereich  ");
				b1 = true;
			}
		}

		if (alter >= 25 && alter <= 34) {

			if (bmi >= 20 && bmi <= 25) {
				System.out.println("Sehr gut! Dieser Wert liegt für Ihre " + "Altersgruppe im Normalbereich  ");
				b1 = true;
			}
		}

		if (alter >= 19 && alter <= 24) {

			if (bmi >= 19 && bmi <= 24) {
				System.out.println("Sehr gut! Dieser Wert liegt für Ihre " + "Altersgruppe im Normalbereich  ");
				b1 = true;
			}
		}

		if (b1 != true) {
			System.out.println("Dieser Wert liegt nicht für Ihre Altersgruppe im Normalbereich ");
		}

	}

}
