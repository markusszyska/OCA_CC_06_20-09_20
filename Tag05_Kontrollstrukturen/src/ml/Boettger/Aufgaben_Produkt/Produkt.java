//#############################################################################
//
// Aufgabe 1 - Berechnung des Produktes der Zahlen von 1 bis boundary
//
// Erstellen Sie auf Grundlage des Programms SumTemplate.java ein aehnliches
// Programm namens Product.java, welches das Produkt der Zahlen von 1 bis zu
// einem vorgegebenen Grenzwert boundary berechnet.
//
// Kopieren Sie sich dazu das Programm SumTemplate.java in eine neue Datei 
// Product.java. Benennen Sie ferner in der Programmzeile public class 
// SumTemplate {… Ihr Programm entsprechend um in public class Product {.
//
// Modifizieren Sie das Programm so, dass es nicht die Summe der Zahlen von 0 
// bis boundary, sondern das Produkt der Zahlen von 1 bis boundary berechnet. 
// Der Operator für die Multiplikation ist in Java das Zeichen *.
//
// Modifizieren Sie die Kommentare und die Bezeichner der Datenelemente in 
// Ihrem Programm so, dass sie inhaltlich wieder zum Ziel Ihres Programms
// passen.
//
// Uebersetzen Sie Ihr Programm und fuehren Sie es anschliessend aus. 
// Wenn alles richtig funktioniert, erzeugt Ihr Programm fuer den Wert 
// boundary = 4 die folgende Ausgabe:
//
// Das Produkt der Zahlen von 1 bis 4 ist 24
//
// Testen Sie Ihr Programm fuer die Werte boundary aus der Menge 
// {1, 2, 3, 4, 5, 10}.
//
//#############################################################################

package ml.Boettger.Aufgaben_Produkt;

public class Produkt {
	public static void main(String[] args) 
	{
		// Deklaration der Variablen
		// Ganze Zahl, bis zu der multipliziert wird
		int boundary;
		// Produkt der bisher multiplizierten ganzen Zahlen
		int product;
		// Ganze Zahl, die jeweils an der Reihe ist
		int counter;
		// Festlegen der Startwerte der Variablen
	
		boundary = 10;		// boundary
		product = 1;		// product start value
		counter = 1;		// iteration start
		
		// Berechne das Produkt aller Zahlen von 1 bis boundary
		while (counter <= boundary) {
			product *= counter;
			counter++;
		}
		// Ausgeben des Produktes, 
		// gemeinsam mit erlaeuterndem Text
		System.out.print("Das Produkt der Zahlen von 1 bis ");
		System.out.print(boundary);
		System.out.print(" ist ");
		System.out.print(product);
		System.out.println(".");
	}
}
