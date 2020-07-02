package ml.Neumann.aufgaben_Modulo;

import java.util.Scanner;

public class aufgabe2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int zahl = sc.nextInt();
		System.out.println("Sie haben: " + zahl + " eingeben");

		// Berechnung der Tage, Stunden und Minuten
		/*
		 * 1 Tag = 86400 sekunden 1 Stunde = 3600 Sekunden = 60 Minuten 1 Minute = 60
		 * Sekunden
		 * 
		 * 
		 */
		// weitere Variablen
		int Tage;
		int Resttage;
		int Stunden;
		int Reststunden;
		int Minuten;
		int Restminuten;

//Berechnung
		Tage = zahl / 86400;
		Resttage = zahl % 86400;
		Stunden = Resttage / 3600;
		Reststunden = Resttage - (Stunden * 3600);
		Minuten = Reststunden / 60;
		Restminuten = Resttage - (Stunden * 3600) - (Minuten * 60);

		System.out.println(zahl + " Sekunden sind " + Tage + " Tag(e) " + Stunden + " Stunde(n) " + Minuten
				+ " Minuten " + Restminuten + " Sekunde(n)");

	}

}
