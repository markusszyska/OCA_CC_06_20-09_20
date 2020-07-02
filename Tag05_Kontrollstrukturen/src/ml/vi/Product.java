package ml.vi;

public class Product {
	
	public static void main(String[] args) {
		
		// Deklaration der Variablen
		// Ganze Zahl, bis zu der summiert wird
		int boundary;
		// Summe der bisher addierten ganzen Zahlen
		int product;
		// Ganze Zahl, die jeweils an der Reihe ist
		int counter;
		// Festlegen der Startwerte der Variablen
		boundary = 4;
		product = 1;
		counter = 1;
		// Berechnen des Produktes product über alle Zahlen von 1 bis boundary
		while (counter <= boundary) {
			product = product * counter;
			counter = counter + 1;
		}
		// Ausgeben des Produktes, gemeinsam mit erläuterndem Text
		System.out.print("Das Produkt der Zahlen von 1 bis ");
		System.out.print(boundary);
		System.out.print(" ist ");
		System.out.println(product);
	
	}
	
}
