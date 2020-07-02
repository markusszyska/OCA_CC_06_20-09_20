package ml.brainin;

import java.util.Arrays;
import java.util.List;

public class Square {
	public static void main(String[] args) {
		Square square = new Square();
		List<Integer> bi = Arrays.asList(1,2,3,4,10,10);
		for (Integer number : bi) {
			square.doSquare(number);
		}
	}
	public  void doSquare(int number) {
		// Deklaration der Variablen
		int square = 0;
		//Die Zahl, für die das Quadrat berechnet wird
		System.out.println("Das Quadrat von "+number+" ist");
		//Berechnung das Quadrat von number durch number-maliges Addieren von number
		int i = 0;
		for (; i < number; i++) {
			square += number;
		}
		System.out.println("Berechnet durch "+number+" maliges Addieren von "+number+": "+ square);
		
		//Berechnen des Quadrats der Zahl number als Summe der ersten number positiven ungeraden Zahlen
		square = 0;
		int k = 0;
		i = 0;
		while (true) {
			k++;
			if (k%2 != 0) {
				square +=k;
				i++;
			}
			if (i >= number) break;
		}
		
		//Ausgeben das Quadrat von number, gemeinsam mit erläuterndem Text
		System.out.println("Berechnet als Summe der ersten "+number+" ganzen Zahlen: "+ square);

		System.out.println("Berechnet mit Multiplikation: "+(number*number));
		System.out.println("---------------------------");
	}
}
