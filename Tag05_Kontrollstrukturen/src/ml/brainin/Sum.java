package ml.brainin;

import java.util.Arrays;
import java.util.List;

public class Sum {
	public static void main(String[] args) {
		// Deklaration der Variablen
		// Summe der bisher addierten ganzen Zahlen
		int sum;
		// Ganze Zahl, die jeweils an der Reihe ist
		int counter;
		
		// Array von Werten, bis zu die summiert wird

		List<Integer> bi = Arrays.asList(1,2,3,4,5,10);
		for (Integer number : bi) {
			sum = 1;
			counter = 1;
			while (counter <= number) {
				sum = sum  + counter;
				counter = counter + 1;
			}
			// Ausgeben der Multiplikation, gemeinsam mit erläuterndem Text
			System.out.print("Die Summe der Zahlen von 1 bis ");
			System.out.print(number);
			System.out.print(" ist ");
			System.out.println(sum);
		}
	}
}
