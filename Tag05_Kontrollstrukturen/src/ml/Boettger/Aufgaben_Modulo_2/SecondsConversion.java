//#############################################################################
//
// Aufgabe 2
//
// Erstellen Sie eine Konsolen-Anwendung, die folgendes Verhalten hat:
// Ein Anwender soll einen die Länge eines Zeitraums in Sekunden angeben, z.B. 
// 7321 Sekunden.
//
// Ihr Programm soll dann ausgeben, wie viele Tage, Stunden, Minuten und 
// Sekunden der angegebene Zeitraum ausmacht.
//
// Hier ein Beispiel:
//
// Eingabe: 75
//
// Ausgabe: 75 Sekunden sind 0 Tag(e) , 0 Stunde(n), 1 Minute(n) und 
// 15 Sekunde(n).
//
//#############################################################################

package ml.Boettger.Aufgaben_Modulo_2;

import java.util.Scanner;

public class SecondsConversion {
	public static void main(String[] args) {
		long days = 0;
		long hours = 0;
		long minutes = 0;
		long seconds = 0;
		long partSeconds = 0;
		
		// read input		
		Scanner sc = new Scanner(System.in);
		System.out.print(
			"Bitte geben Sie die Laenge des Zeitraums in Sekunden an: ");
		seconds = sc.nextLong();
		
		// write input
		System.out.println("Eingabe: " + seconds);
		
		// calculation
		days = seconds / (60 * 60 * 24);
		partSeconds = seconds % (60 * 60 * 24);
		hours = partSeconds / (60 * 60);
		partSeconds %= (60 * 60);
		minutes = partSeconds / 60;
		partSeconds %= 60;
		
		// write output
		System.out.println("Ausgabe: " +
				seconds + " sind " +
				days + " Tag(e), " + 
				hours + " Stunde(n), " +
				minutes + " Minute(n) und " +
				partSeconds + " Sekunde(n).");
		}
}
