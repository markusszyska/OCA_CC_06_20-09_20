package ml.thurairajah;

import java.util.Scanner;

public class Verzweigung2 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte Stueckzahl eingeben: ");
		double stck = sc.nextDouble();
		
		System.out.print("Bitte Einzelpreis eingeben: ");
		double einzelP = sc.nextDouble();
		
		double Kaufpreis = stck * einzelP;
		 
		if (stck > 10) {
			Kaufpreis= Kaufpreis-(Kaufpreis*5/100);
			System.out.println("Rabatt 5%");
		}else if (stck > 50) {
			Kaufpreis = Kaufpreis -(Kaufpreis*10/100);
			System.out.println("Rabatt 10%");
		}
		
		System.out.println("Der Endpreis betraegt: " + Kaufpreis);
		
		
		

	}

}
