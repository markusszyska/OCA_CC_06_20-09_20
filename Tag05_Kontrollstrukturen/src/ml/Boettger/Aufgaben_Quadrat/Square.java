//#############################################################################
//
// Aufgabe 1
//
// Erstellen Sie ein Programm namens Square.java, welches auf verschiedene
// Weisen das Quadrat einer ganzen Zahl number berechnet und auf der Konsole
// ausgibt.
//
// a) 
// Erstellen Sie dazu zunaechst eine neue Programmdatei Square.java.
// Berechnen Sie sodann das Quadrat von number durch number-maliges Addieren
// von number. Geben Sie anschliessend das Ergebnis dieser Berechnungsvariante
// aus.
//
// b) 
// Uebersetzen Sie Ihr Programm und fuehren Sie es anschliessend aus. Wenn
// alles richtig funktioniert, erzeugt Ihr Programm fuer number = 11 die
// folgende Ausgabe:
//
// Das Quadrat von 11 ist:
// - Berechnet durch 11-maliges Addieren von 11: 121
//
// c)
// Realisieren Sie ferner einen alternativen Algorithmus zur Berechnung des
// Quadrats von number. Dieser nutze die Eigenschaft, dass das Quadrat von n
// identisch ist mit der Summe der ersten n positiven ungeraden Zahlen.
//
// Beispiele:
//
// 3 * 3 = 1 + 3 + 5 = 9
//
// 11 * 11 = 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 + 21 = 121
//
// Nutzen Sie soweit wie moeglich und inhaltlich sinnvoll die bereits in 
// Teilaufgabe 1b) deklarierten Variablen, anstatt lauter neue Variablen zu
// deklarieren. Berechnen Sie sodann das Quadrat von number durch Addieren der
// ersten number-vielen ungeraden natürlichen Zahlen.
//
// Geben Sie anschliessend das Ergebnis dieser Berechnungsvariante aus.
//
// d) 
// Uebersetzen Sie Ihr Programm und fuehren Sie es anschliessend aus. Wenn
// alles richtig funktioniert, erzeugt Ihr Programm nun fuer number = 11 die 
// folgende Ausgabe:
//
// Das Quadrat von 11 ist:
// - Berechnet durch 11-maliges Addieren von 11: 121
// - Berechnet als Summe der ersten 11 ganzen ungeraden Zahlen: 121
//
// e) 
// Berechnen Sie schliesslich zur Kontrolle das Quadrat von number direkt ueber
// die Multiplikation.
//
// Geben Sie anschliessend das Ergebnis dieser Berechnungsvariante aus.
//
// f) 
// Uebersetzen Sie Ihr Programm und fuehren Sie es anschliessend aus. Wenn
// alles richtig funktioniert, erzeugt Ihr fertiges Programm fuer number = 11
// die folgende Ausgabe:
//
// Das Quadrat von 11 ist:
// - Berechnet durch 11-maliges Addieren von 11: 121
// - Berechnet als Summe der ersten 11 ganzen ungeraden Zahlen: 121
// - Berechnet mit Multiplikation: 121
//
// g) 
// Pruefen Sie, dass Ihr Programm geeignete Kommentare enthaelt, die das Ziel
// und die Funktionsweise Ihres Programms so verdeutlichen, dass auch jemand
// anders als Sie selbst versteht, was Sie programmiert haben.
//
// Ergaenzen Sie ggf. Ihre Kommentare entsprechend.
//
// h)
// Testen Sie Ihr Programm fuer die Werte boundary aus der Menge 
// {1, 2, 3, 4, 10, 11}.
//
//#############################################################################

package ml.Boettger.Aufgaben_Quadrat;

public class Square {
	public static void main(String[] args) {
		// Loesung mit Template nach Ruecksprache mit Herrn Szyska

		// Deklaration der Variablen
		// Ganze Zahl, bis zu der summiert wird
		int boundary;
		// Summe der bisher addierten ungerade Zahlen
		int sum;
		// Festlegen der Startwerte der Variablen
		int counter;
		// Festlegen der ungerade Zahlen
		int uneven;

		// Festlegen von boundery
		boundary = 10;

		// 1. Berechnung durch boundary Additionen
		sum = 0;
		counter = 1;
		// Berechnen der Summe aller ungeraden Zahlen von 1 bis boundary
		while (counter <= boundary) {			
			sum += boundary;
			counter++;
		}
		// Ausgeben der Summe, gemeinsam mit Text
		System.out.print("Berechnet durch ");
		System.out.print(boundary);
		System.out.print("-mailges Addieren von ");
		System.out.print(boundary);
		System.out.print(": ");
		System.out.println(sum);
		
		// Berechnung durch durch boundary Additionen von ungeraden Zahlen
		uneven = 1;
		sum = 0;
		uneven = 1;
		counter = 1;
		// Berechnen der Summe aller ungearden Zahlen von 1 bis boundary
		while (counter <= boundary) {			
			sum += uneven;
			counter++;
			uneven += 2;
		}
		// Ausgeben der Summe, gemeinsam mit Text
		System.out.print("Berechnet als Summe der ersten ");
		System.out.print(boundary);
		System.out.print(" ungeraden ganzen Zahlen: ");
		System.out.println(sum);
		
		// Berechnet durch Multiplikation
		System.out.println("Berechnet durch Multiplikation: " +
				(boundary * boundary));	
	}
}
