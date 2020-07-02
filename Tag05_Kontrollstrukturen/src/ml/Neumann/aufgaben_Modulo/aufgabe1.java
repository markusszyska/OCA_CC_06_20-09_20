package ml.Neumann.aufgaben_Modulo;

import java.util.Scanner;

public class aufgabe1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int zahl = sc.nextInt();
		System.out.println("Sie haben: " + zahl + " eingeben");
		System.out.println("Das macht " + (zahl / 100) + " Euro und " + (zahl % 100) + " Cent");

	}

}
