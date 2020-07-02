package ml.assmann;

import java.util.Scanner;

public class ModuloA1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte einen cent-Betrag zur Umrechnung eingeben!");
		int eingabe = sc.nextInt();
		int euro = eingabe / 100;
		int cent = eingabe % 100;
		System.out.println("Das macht " + euro + " Euro und " + cent + " Cent");	
	}
}
