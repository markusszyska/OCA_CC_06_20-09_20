package ml.thurairajah;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int zahl = sc.nextInt();
		int rechnung = zahl /100;
		int rech2 = zahl % 100  ;
		System.out.println("Das macht " + rechnung + " Euro und " + rech2 + " Cent.");
		
	}
}
