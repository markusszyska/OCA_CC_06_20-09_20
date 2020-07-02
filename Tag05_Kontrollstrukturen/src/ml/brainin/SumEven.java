package ml.brainin;

/*
*
* Das Programm addiert die Zahlen von 0 bis zu einem vorgegebenen
* Grenzwert boundary.
* Die Summe wird dabei in der Variablen sum abgelegt.
* Die Variable counter enthält die aktuell zu addierende Zahl.
*
*/
public class SumEven {
	public static void main(String[] args) {
		// Deklaration der Variablen
		// Ganze Zahl, bis zu der summiert wird
		int boundary;
		// Summe der bisher addierten ganzen Zahlen
		int sum;
		// Ganze Zahl, die jeweils an der Reihe ist
		int counter;
		// Festlegen der Startwerte der Variablen
		boundary = 100;
		sum = 0;
		counter = 1;
		// Berechnen der Summe sum über alle geraden Zahlen von 1 bis boundary
		while (counter <= boundary) {
			if(counter%2 == 0) {
				sum = sum + counter;
			}
			counter = counter + 1;
		}
		//Ausgeben der Summe, gemeinsam mit erläuterndem Text
		System.out.print("Die Summe der geraden Zahlen von 1 bis ");
		System.out.print(boundary);
		System.out.print(" ist ");
		System.out.println(sum);
	}
}