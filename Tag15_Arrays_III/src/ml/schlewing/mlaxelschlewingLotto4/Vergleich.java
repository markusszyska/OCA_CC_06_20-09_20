package ml.schlewing.mlaxelschlewingLotto4;

public class Vergleich {

/* Methode Vergleich der beiden Felder: Rueckgabe ist Anzahl der richtigen Tips vom Typ int */
/* also Anzahl der 'Richtigen' */
	static int vergleichen(int[] tip, int[]ergebnis) {
		
		/* Initialisieren der Anzahl 'Richtige' auf null */
		int richtige = 0;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				
				if (ergebnis[j] == tip[i]) {
					richtige++;
				}
			}
		}
		
		/* Rueckgabe der Anzahl richtiger Tips */
		return richtige;
	}
}
