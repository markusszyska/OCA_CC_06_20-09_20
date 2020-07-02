//##############################################################################
//
// Aufgabe 1
//
// Erstellen Sie eine Konsolen-Anwendung, die folgendes Verhalten hat:
// Ein Anwender soll einen Betrag in Cent eingeben. z.B. 256 und Ihre
// Anwendung gibt aus, wie viele Euro und Cent der Betrag ausmacht.
//
// Hier ein Beispiel:
// Eingabe: 256
// Ausgabe: Das macht 2 Euro und 56 Cent
//
//##############################################################################
package ml.Boettger.Aufgaben_Modulo_1;

import java.util.Scanner;

public class EuroCent {
	public static void main(String[] args) 
	{
		// read input
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben Sie den Betrag in Cent ein: ");
		int onlyCent = sc.nextInt();
		
		// print result
		System.out.println("Eingabe: " + onlyCent);
		System.out.println("Ausgabe: Das macht " +
				(onlyCent / 100) + " Euro und " +
				(onlyCent % 100) + " Cent.");		
	}
}
