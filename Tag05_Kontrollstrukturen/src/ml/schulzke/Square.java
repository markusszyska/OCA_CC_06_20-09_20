package ml.schulzke;

public class Square {
	public static void main(String[] args) {
		//intialiesierung der Variabeln
		int toSquare,sum,counter,sumALT;

		// Festlegen der Startwerte der Variablen
		//Zahl die quadriert werden soll
		toSquare = 11;
		//Summen Zaehler
		sum = 0;
		//Anzahl der auszufuehrenden Iterationsschritte
		counter = 0;
		while (counter < toSquare) {
			//zu Sum 11 mal 11 hinzu addieren
			sum = sum + toSquare;
			counter++;
		}
		//Ausgabe von der ersten Aufgabe
		System.out.print("Das Quadrat von "+toSquare+" ist:\n");
		System.out.print("- Berechnet durch "+toSquare+"-maliges Addieren von "+toSquare+": "+sum+"\n");
		
		//neu setzen der Variabeln fuer zweiten Rechenschritt
		sum = 1;
		sumALT = 0;
		counter = 0;
		while (counter < toSquare) {
			//zweite Summe fuer die Ausgabe
			sumALT = sumALT + sum;
			//erste Summe zum addieren waehrend Iterationsschritten
			sum = sum + 2;
			counter++;
		}
		//Ausgabe der Summe erster 11 Zahlen
		System.out.print("Das Quadrat von "+toSquare+" ist:\n");
		System.out.print("- Berechnet durch "+toSquare+"-maliges Addieren von sum increment2: "+sumALT+"\n");
		//letzer Punkt: Pruefung durch simple Multiplikation direkt im System.out
		System.out.print("Berechnet mit Multiplikation: "+(toSquare*toSquare));
	}
	
}
