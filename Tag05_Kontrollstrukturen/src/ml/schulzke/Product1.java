package ml.schulzke;

public class Product1 {
	public static void main(String[] args) {
	// Deklaration der Variablen
	// Ganze Zahl, bis zu der summiert wird
	int[] boundary = {1,2,3,4,5,10};
	// Summe der bisher addierten ganzen Zahlen
	int sum;
	// Ganze Zahl, die jeweils an der Reihe ist
	int counter;


	// F�r jedes Element in boundary einmal ausf�hren
	for (int i = 0;i<boundary.length;i++) {
		// Festlegen der Startwerte der Variablen
		sum = 1;
		counter = 0;
	// Berechnen der Summe sum über alle Zahlen von 1 bis boundary
		while (counter < boundary[i]) {
			sum = sum*(counter+1);
			counter++;
		}
		System.out.print("Das Produkt der Zahlen von 1 bis ");
		System.out.print(boundary[i]);
		System.out.print(" ist ");
		System.out.println(sum);
		// Ausgeben der Summen, gemeinsam mit erläuterndem Text
	}
		

	}
}
