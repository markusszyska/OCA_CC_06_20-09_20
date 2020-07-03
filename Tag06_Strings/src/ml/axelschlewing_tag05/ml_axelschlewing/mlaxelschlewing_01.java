package ml.axelschlewing_tag05.ml_axelschlewing;

import java.util.Scanner;

public class mlaxelschlewing_01 {

	public static void main(String[] args) {
		
		System.out.println("Bitte Körpergewicht[kg], Grösse[cm] und Alter[Jahren] eingeben  ! ");
    	
    	Scanner eingabe_masse = new Scanner(System.in);
    	double masse = eingabe_masse.nextInt();
    	    	
    	Scanner eingabe_groesse = new Scanner(System.in);
    	double groesse = eingabe_groesse.nextInt();
    	
    	Scanner eingabe_alter = new Scanner(System.in);
    	double alter = eingabe_alter.nextInt();
    	
    	/* Kontrollausgabe */
    	System.out.println("Die Eingaben waren: ");
    	System.out.println( masse);
    	System.out.println( groesse);
    	System.out.println( alter);
		
		/* Umrechnung cm in meter */
		double groesse_meter = groesse*0.01;
		
		/* Berechnung BMI */
		double bmi;
		
		bmi = masse/(groesse_meter*groesse_meter);
		
		/* Ausgabe des BMI */
			System.out.println(" Der BMI beträgt:");
			System.out.println(bmi);
		
		/* Einordnen BMI in Klassen, also "binning" */
		if ((alter >= 19 ) & (alter <= 24)) {
			if ((bmi >= 19 ) & (bmi <= 24)) {
			 System.out.println("Der BMI ist in Ordnung"); 	}
				else
				{
					System.out.println("Der BMI ist nicht in Ordnung");		}
				}

		if ((alter >=25 ) & (alter <= 34)) {
			if ((bmi >= 20 ) & (bmi <= 25)) {
			 System.out.println("Der BMI ist in Ordnung"); 	}
				else
				{
					System.out.println("Der BMI ist nicht in Ordnung");		}
				}
		
		if ((alter >=35 ) & (alter <= 44)) {
			if ((bmi >= 21 ) & (bmi <= 26)) {
			 System.out.println("Der BMI ist in Ordnung"); 	}
				else
				{
					System.out.println("Der BMI ist nicht in Ordnung");		}
				}
		
		if ((alter >=45 ) & (alter <= 54)) {
			if ((bmi >= 22 ) & (bmi <= 27)) {
			 System.out.println("Der BMI ist in Ordnung"); 	}
				else
				{
					System.out.println("Der BMI ist nicht in Ordnung");		}
				}
		
		if ((alter >=55 ) & (alter <= 64)) {
			if ((bmi >= 23 ) & (bmi <= 28)) {
			 System.out.println("Der BMI ist in Ordnung"); 	}
				else
				{
					System.out.println("Der BMI ist nicht in Ordnung");		}
				}
		
		if (alter >=64 ) {
			if ((bmi >= 24 ) & (bmi <= 29)) {
			 System.out.println("Der BMI ist in Ordnung"); 	}
				else
				{
					System.out.println("Der BMI ist nicht in Ordnung");		}
				}	
	}
}
