package ml.Neumann.berechnung_produkt;

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
		boundary = 6;
		product = 1;
		counter = 1;
		// Berechnen der Summe sum ueber alle Zahlen von 1 bis boundary
		while (counter <= boundary) {
			product = product * counter;
			counter = counter + 1;
		}
		// Ausgeben der Summe, gemeinsam mit erlaeuterndem Text
		System.out.print("Das Product der Zahlen von 1 bis ");
		System.out.print(boundary);
		System.out.print(" ist ");
		System.out.println(product);
	}
}
