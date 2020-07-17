package ml.brainin;
/*
Erweitern Sie den Lottozahlengenerator, dass fuer ein Jahr woechentlich
eine Ziehung gemacht wird. Verwenden Sie dafuer ein zweidimensionales Array.
int[52][6]
Lassen Sie die Zahlen ausgeben. Bsp.
"Die Zahlen fuer Woche 1 sind : 1 2 3 4 5 6 ".
 */
public class Aufgabe_1 {
	public static void main(String[] args) {
		int[][] jZahlen = new int[52][6];
		for (int i = 0; i <jZahlen.length; i++) {
			int[] zahlen = new int[jZahlen[i].length]; 
			int count = 0;
			while(count < zahlen.length) {
				int zahl = getZahl(zahlen);
				if (zahl != -1) {
					zahlen[count] = zahl;
					count++;
				}
			}
			jZahlen[i] = zahlen;
			System.out.print("Die Zahlen fuer Woche : "+ (i+1) +" sind ");
			for  (int j = 0; j < zahlen.length ; j++) {
				System.out.print(zahlen[j]+" ");
			}
			System.out.println();
		}
	}
	
	static int getZahl(int[] zahlen) {
		int zahl = (int)(Math.random() * 49 +1);
		for  (int i = 0; i < zahlen.length ; i++) {
			if (zahlen[i] == zahl) {
				return -1;
			}
		}
		return zahl;
	}
}
