package ml.kukulin;
public class Product {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int boundary;
	// Summe der bisher addierten ganzen Zahlen
	int sum;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;
	// Festlegen der Startwerte der Variablen
	boundary = 10;
	sum = 1;
	counter = 1;
	// Berechnen der Summe sum über alle Zahlen von 1 bis boundary
	while (counter <= boundary) {
		sum = sum * counter;
		counter = counter + 1;
	}
	// Ausgeben der Summe, gemeinsam mit erläuterndem Text
	System.out.print("Die Summe der Zahlen von 1 bis ");
	System.out.print(boundary);
	System.out.print(" ist ");
	System.out.println(sum);
	}
}
