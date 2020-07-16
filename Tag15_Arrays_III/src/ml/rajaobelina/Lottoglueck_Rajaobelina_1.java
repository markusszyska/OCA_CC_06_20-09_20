package ml.rajaobelina;

/*
-----------------------------------Aufgabe 1----------------------------
Lottozahlen eine Ziehung
Erstellen Sie einen Lottozahlengenerator, der 6 zufaellige Zahlen
zwischen 1 und 49 in ein Array schreibt. Beachten Sie dabei,
dass bei einer Lottoziehung keine Zahl doppelt vorkommt.
Lassen Sie danach die Zahlen ausgeben.

*/

public class Lottoglueck_Rajaobelina_1 {
	public static void main(String[] args) {
		int i, j;
		int temp = 0;
		int[] array = new int[6];

		array[0] = (int) (Math.random() * 49 + 1);

		for (i = 1; i <= (array.length) - 1; i++) {
			temp = (int) (Math.random() * 49 + 1);
			for (j = i - 1; j < i; j++) {
				if (temp == array[j]) {
					continue;
				} else {
					array[i] = temp;
				}
			}
		}

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);

	}
}
