package ml.assmann;

import java.util.Scanner;

public class StringsAufgabe3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variablen
		String eingabe = "";
		String ausgabe = "";
		
		//Abfrage
		System.out.println("Geben Sie einen Text ein.");
		eingabe = sc.nextLine();
		
		//Umwandlung des Strings in ASCII codes via for-Schleife
		for(int i = 0;i<eingabe.length();i++) {
			ausgabe += (int)eingabe.charAt(i) + " ";
		}
		
		//Ausgabe
		System.out.println("Eingabe: " + eingabe + "\nAusgabe: " + ausgabe);
		
	}
}
