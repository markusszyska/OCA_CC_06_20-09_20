package ml.brainin;

import java.util.Arrays;
import java.util.List;

public class Aufgabe_Product {
	public static void main(String[] args) {
		// Deklaration der Variablen
		// Multiplikation der bisher multipliziert ganzen Zahlen
		int mult;
		// Ganze Zahl, die jeweils an der Reihe ist
		int counter;
		
		// Array von Werten, bis zu die summiert wird
		List<Integer> bi = Arrays.asList(1,2,3,4,5,10);
		for (Integer number : bi) {
			// Festlegen der Startwerte der Variablen
			mult = 1;
			counter = 1;
			while (counter <= number) {
				mult = mult * counter;
				counter = counter + 1;
			}
			// Ausgeben der Multiplikation, gemeinsam mit erläuterndem Text
			System.out.print("Die Multiplikation der Zahlen von 1 bis ");
			System.out.print(number);
			System.out.print(" ist ");
			System.out.println(mult);
		}
	}
}
