package ml.assmann;

public class Square {
	public static void main(String[] args) {
		// Deklaration der Variablen
		// Ganze Zahl die quadriert wird
		int number;
		// Summe der bisher addierten Zahlen
		int sum;
		// Zähler
		int counter;
		// Festlegen der zu quadrierenden Zahl
		number = 11;
		
		// Teil a+b) Quadrieren durch number-maliges Addieren
		// Startwerte festlegen
		sum = 0;
		counter = 1;
		// Berechnung
		while (counter <= number) {
			sum = sum + number;
			counter = counter + 1;
		}
		
		// Ausgeben des Quadrats, gemeinsam mit erläuterndem Text
		System.out.print("Das Quadrat von " + number + " ist: \n");
		System.out.println("- Berechnet durch " + number + "-maliges Addieren von " + number + ": " + sum);
		
		// Teil c+d) Quadrieren durch Addieren der ersten "number" ungeraden ganzen Zahlen
		// Startwerte zuruecksetzen oder neue Variablen initialisieren
		sum = 0;
		counter = 1;
		int num_add = 1; // Ungerade Zahl die addiert wird
		// Berechnung
		while (counter <= number) {
			sum = sum + num_add;
			counter = counter + 1;
			num_add+=2;
		}
		
		// Ausgeben des Quadrats, gemeinsam mit erläuterndem Text
		System.out.println("- Berechnet als Summe der ersten " + number + " ungeraden ganzen Zahlen: " + sum);
		
		// Teil e+f) Quadrieren durch Multiplikation
		sum = number * number;
		
		// Ausgeben des Quadrats, gemeinsam mit erläuterndem Text
		System.out.println("- Berechnet mit Multiplikation: " + sum);
	}
}
