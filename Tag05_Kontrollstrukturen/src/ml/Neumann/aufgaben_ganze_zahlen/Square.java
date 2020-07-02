package ml.Neumann.aufgaben_ganze_zahlen;

public class Square {
	public static void main(String[] args) {

		// Deklaration der Variablen
		// Ergebnis der quadratur
		int square;
		// primzahlen
		int primzahl;
		// Ganze Zahl die ins Quadrat gesetzt werden soll.
		int number;
		// Anzahl der Additionen
		int counter;

		// Aufgabe a Berechnen des Quadrats durch number-maliges Summieren
		// von number
		// Festlegen der Startwerte der Variablen
		square = 0;
		number = 11;
		counter = 1;

		while (counter <= number) {
			square = square + number;
			counter = counter + 1;
		}
		// Ausgabe der Lösung
		System.out.print("Das Quadrat von " + number + " ist: ");
		System.out.print("\n- Berechnet durch " + number + " maliges Addieren von " + number + ": " + square);

		// Teil c - summe der ersten n positiven ungerade zahlen
		// Festlegen der Startwerte der Variablen
		square = 0;
		primzahl = 1;
		number = 11;
		counter = 1;

		// Berechnen des Quadrats durch summe der positiven ungeraden zahlen
		while (counter <= number) {
			square = square + primzahl;
			primzahl = primzahl + 2;
			counter = counter + 1;
		}

		// Ausgabe der Daten
		System.out.println("\n- Berechnet als Summe der ersten " + number + " ungeraden Zahlen: " + square);

		// Lösung über Multiplikation
		// Festlegen der Startwerte
		number = 11;
		// Berechnung
		square = number * number;

		// Ausgabe der Daten
		System.out.println("\n- Berechnet durch Multiplikation:" + square);

	}

}
