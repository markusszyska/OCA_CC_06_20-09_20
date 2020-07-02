package kontrollstrukturen;

public class DemoSchleifen {
	public static void main(String[] args) {
		/*
		 * Die while Schleife ist eine vorpruefende Schleife, d.h. die Bedingung
		 * wird vor dem ersten Betreten der Schleife geprueft.
		 */
		int i = 11;
		while(i <= 10) {
			System.out.println("i : " + i);
			i++;
		}
		
		/*
		 * Die do while Schleife ist eine nachpruefende Schleife, d.h. die
		 * Bedingung wird nach dem erstmaligen Durchlaufen der Schleife geprueft.
		 */
		int j = 1;
		do {
			System.out.println("j : " + j);
			j++;
		}while(j <= 10);
		System.out.println("j : " + j);
		
		for(int i1 = 0; i1 < 5; i1++) {
			System.out.println("i1 : " + i1);
		}
		
		//Die Zaehlvariable kann auch ausserhalb initialisiert werden
		int j1 =0;
		for(; j1 < 5; j1++) {}
		
		//Syntaktisch erlaubt, aber Endlosschleife
//		for(;;) {}
		
		for(int j2 = 0, j3 = 5 ;j2 < 5 || j3 < 10; j2++, j3+=100) {}
		for (double d = 1.5;d <5 ; d += 0.5) {
			System.out.println(d);
		}
		/*
		 * Wenn mehrere Zaehlvariablen im Schleifenkopf deklariert werden,
		 * muessen sie alle den selben Datentyp haben
		 */
//		for(byte b = 5, int i = 10;;) {}
		
		
	}
}
