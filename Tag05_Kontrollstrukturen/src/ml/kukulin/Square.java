package ml.kukulin;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int boundary;
	// Summe der bisher addierten ganzen Zahlen
	int sum;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;
	// Festlegen der Startwerte der Variablen
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Bitte Zahl eingeben");
	int zahl = sc.nextInt();
	boundary = 2* zahl;
	sum = 0;
	counter = 1;
	


	while (counter <= boundary) {
		sum = sum + counter;
		counter = counter + 2;
	}
	counter = 1;
	boundary = zahl;
	int sum2 = 0;
	
	while (counter <= boundary) {
		sum2 = sum2 + zahl;
		counter = counter + 1;
	}
	int sum3 = 0;
	 sum3 = zahl * zahl;
	// Ausgeben der Summe, gemeinsam mit erläuterndem Text
	System.out.print("Das Quadrat von: ");
	System.out.print(zahl);
	System.out.println(" ist: ");
	System.out.println("Berechnet durch " + zahl + " - maliges Addieren von " + zahl + " : " + sum2);
	System.out.println("Berechnet als Summe der ersten ungeraden " + zahl + " - maliges Addieren von " + zahl + " : " + sum);
	System.out.println("Berechnet mit Multiplication: " + sum3);
 

	}
}