package ml.Liebermann;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		double gewicht;
		double groeße;
		int alter;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Körpergewicht in kg eingeben");
		gewicht = sc.nextDouble();
		System.out.println("Bitte Größe in Meter eingeben");
		groeße = sc.nextDouble();
		System.out.println("Bitte Alter eingeben");
		alter = sc.nextInt();
		
		int bmi =(int) (gewicht / (groeße* groeße));
		
		System.out.println(bmi);
		boolean bmiIO = false;
		if(alter >= 19 && alter <= 24) {
			if(bmi >= 19 && bmi <= 24 ) {
				bmiIO = true;
			}
		}
		if(alter >= 25 && alter <= 34) {
			if(bmi >= 20 && bmi <= 25 ) {
				bmiIO = true;
			}
		}
		if(alter >= 35 && alter <= 44) {
			if(bmi >= 21 && bmi <= 26 ) {
				bmiIO = true;
			}
		}
		if(alter >= 45 && alter <= 54) {
			if(bmi >= 22 && bmi <= 27 ) {
				bmiIO = true;
			}
		}
		if(alter >= 55 && alter <= 64) {
			if(bmi >= 23 && bmi <= 28 ) {
				bmiIO = true;
			}
		}
		if(alter >= 64) {
			if(bmi >= 24 && bmi <= 29 ) {
				bmiIO = true;
			}
		}
		
		if(bmiIO) {
			System.out.println("Weiter so!");
		}
		else {
			System.out.println("Sie sollten ein wenig mehr auf Ihre Ernährung achten!");
		}
		
		
		
			
	}
}
