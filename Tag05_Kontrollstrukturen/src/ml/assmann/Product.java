package ml.assmann;

public class Product {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der multipliziert  wird
	int boundary;
	// Produkt der bisher multiplizierten ganzen Zahlen
	int product;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;
	// Festlegen der Startwerte der Variablen
	boundary = 10;
	product = 1;
	counter = 1;
	// Berechnen des Produkts product aller Zahlen von 1 bis boundary
	while (counter <= boundary) {
		product = product * counter;
		counter = counter + 1;
	}
	// Ausgeben der Summe, gemeinsam mit erläuterndem Text
	System.out.print("Das Produkt der Zahlen von 1 bis ");
	System.out.print(boundary);
	System.out.print(" ist ");
	System.out.println(product);
	}
}
