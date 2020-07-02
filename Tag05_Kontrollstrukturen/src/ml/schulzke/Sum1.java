package ml.schulzke;

public class Sum1 {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int[] boundary = {0,1,2,3,4,5,10};
	// Summe der bisher addierten ganzen Zahlen
	int sum;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;


	// Für jedes Element in boundary einmal ausführen
	for (int i = 0;i<boundary.length;i++) {
		// Festlegen der Startwerte der Variablen
		sum = 0;
		counter = 1;
	// Berechnen der Summe sum Ã¼ber alle Zahlen von 1 bis boundary
		while (counter <= boundary[i]) {
			sum = sum + counter;
			counter = counter + 1;
		}
		System.out.print("Die Summe der Zahlen von 1 bis ");
		System.out.print(boundary[i]);
		System.out.print(" ist ");
		System.out.println(sum);
		// Ausgeben der Summen, gemeinsam mit erlÃ¤uterndem Text
	}
		

	}
}
