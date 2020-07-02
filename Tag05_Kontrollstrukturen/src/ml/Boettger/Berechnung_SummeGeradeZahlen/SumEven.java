package ml.Boettger.Berechnung_SummeGeradeZahlen;

public class SumEven {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int boundary;
	// Summe der bisher addierten geraden Zahlen
	int sum;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;
	// Festlegen der Startwerte der Variablen
	boundary = 100;
	sum = 0;
	counter = 2;
	// Berechnen der Summe aller geraden Zahlen von 2 bis boundary
	while (counter <= boundary) {
		sum = sum + counter;
		counter += 2;
	}
	// Ausgeben der Summe, gemeinsam mit Text
	System.out.print("Die Summe der geraden Zahlen von 2 bis ");
	System.out.print(boundary);
	System.out.print(" ist ");
	System.out.println(sum);
	}
}
