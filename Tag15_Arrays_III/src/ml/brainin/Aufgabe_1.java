package ml.brainin;
/*
 * Lottozahlen eine Ziehung
Erstellen Sie einen Lottozahlengenerator, der 6 zufaellige Zahlen
zwischen 1 und 49 in ein Array schreibt. Beachten Sie dabei,
dass bei einer Lottoziehung keine Zahl doppelt vorkommt.
Lassen Sie danach die Zahlen ausgeben.
  


 */
public class Aufgabe_1 {
	static int[] zahlen = new int[6];
	public static void main(String[] args) {
		int count = 0;
		while(count < zahlen.length) {
			int zahl = getZahl();
			if (zahl != -1) {
				zahlen[count] = zahl;
				count++;
			}
		}
		System.out.println("Lottozahlen : ");
		for  (int i = 0; i < zahlen.length ; i++) {
			System.out.print(zahlen[i]+" ");
		}
	}
	
	static int getZahl() {
		int zahl = (int)(Math.random() * 49 +1);
		for  (int i = 0; i < zahlen.length ; i++) {
			if (zahlen[i] == zahl) {
				return -1;
			}
		}
		return zahl;
	}
}
