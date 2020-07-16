package ml.schlewing.mlaxelschlewing_Lotto_1;

public class Lotto1 {

	public static void main(String[] args) {
		System.out.println("*** LOTTOZAHLEN - GENERATOR ***\r");

		/* Neues Ziehungsobjekt initialisieren */

		Generator zahl = new Generator();

		/* 2 Felder initialisiert: 1. Feld: die Ziehung, 2. das Ergebnis */

		int[] ziehung = new int[6];
		int[] ergebnis = new int[6];

		/* Ziehung der Lottozahlen durch Methodenaufruf ziehen */

		for (int i = 0; i < 6; i++) {
			zahl.ziehen();
			ziehung[i] = zahl.ziehen();
		}

		/* Ueberprüfung auf Doppelte Zahlen mittels Vergleich zweier Arrays */

		for (int j = 0; j < 6; j++) {
			for (int z = 0; z < 6; z++) {

				/* falls gleich, war Ziehlung doppelt, dann nochmal ziehen ! */

				if (ziehung[z] == ziehung[j]) {
					ziehung[z] = zahl.ziehen();
				}

				else /* andernfalls Zahl in Ergebnis-Feld zur Ausgabe */
				{
					ergebnis[z] = ziehung[z];
				}
			}
		}

		/*
		 * Aufruf des Sortieralgorithmus BubbleSort in Klasse Sortierung mit Uebergabe
		 * ergebnis-Feld
		 */
		/* Im Array ergebnis steht anschliessend das sortierte Feld */

		Sortierung.bubbleSort(ergebnis);

		/* Ausgabe des Ziehungsergebnis */

		System.out.print("Das Endergebnis der Ziehung : ");
		for (int k = 0; k < 6; k++) {
			System.out.print(" " + ergebnis[k] + " ");
		}

		System.out.println("\r\r Die Ziehung ist wie immer ohne Gewähr !\r ");

		System.out.println(" Da freut sich die Lottofee Karin !");
	}
}
