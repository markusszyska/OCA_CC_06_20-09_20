package ml.assmann;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variablen deklarieren und initialisieren
		int aussentemp = 0;
		String ausgabe = "";
		//Niederschlag?
		boolean precipitation  = false;
		
		
		//AussenTemp abholen
		System.out.println("Geben sie die Aussentemperatur an");
		aussentemp = sc.nextInt();
		
		//Ausgabe		
		//Aufgabe d, verschachtelt, kein if else
		if(aussentemp >= 0) {
			if(precipitation) ausgabe = "Sauwetter";
			else {
				if(aussentemp <= 19) ausgabe = "Gehen wir spazieren?";
				else ausgabe = "Gehen wir schwimmen?";
			}			
		}
		else {
			if(precipitation) ausgabe = "Komm, geh'n wir Schlittenfahren!";
			else ausgabe = "Lass uns am Lagerfeuer Glühwein trinken.";
		}
		
		System.out.println("d) " + ausgabe);
		
		//Aufgabe e, if/if else
		if(aussentemp >= 0) {
			if(precipitation) ausgabe = "Sauwetter";
			else if(aussentemp <= 19) ausgabe = "Gehen wir spazieren?";
			else ausgabe = "Gehen wir schwimmen?";
		}
		else {
			if(precipitation) ausgabe = "Komm, geh'n wir Schlittenfahren!";
			else ausgabe = "Lass uns am Lagerfeuer Glühwein trinken.";
		}
		
		System.out.println("e) " + ausgabe);
	}
}
