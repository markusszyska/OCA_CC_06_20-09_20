package ml.schulzke;

public class Sum2 {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int[] boundary = {100,200};
	// Summe der bisher addierten ganzen Zahlen
	int sum;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;


	// Für jedes Element in boundary einmal ausführen
	for (int i = 0;i<boundary.length;i++) {
		// Festlegen der Startwerte der Variablen
		sum = 0;
		counter = 0;
	// Berechnen der Summe sum Ã¼ber alle Zahlen von 1 bis boundary
		while (counter <= boundary[i]) {
			sum = sum + counter;
			counter = counter + 2;
		}
		System.out.print("Die Summe der geraden Zahlen von 1 bis ");
		System.out.print(boundary[i]);
		System.out.print(" ist ");
		System.out.println(sum);
		// Ausgeben der Summen, gemeinsam mit erlÃ¤uterndem Text
	}
		

	}
}

