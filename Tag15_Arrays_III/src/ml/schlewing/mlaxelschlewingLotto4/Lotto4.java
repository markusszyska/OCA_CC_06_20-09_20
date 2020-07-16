package ml.schlewing.mlaxelschlewingLotto4;


public class Lotto4 {
	public static void main(String[] args) {
		System.out.println("*** LOTTOZAHLEN - GENERATOR ***\r");
			
		
		/* Neues Ziehungsobjekt initialisieren, quasi den Generator anwerfen */
		Generator zahl = new Generator();
				
		
		/* 2 Felder initialisieren: 1. Feld: die Ziehung, 2. das Ergebnis */ 
		int[]ziehung = new int[6];
		int[]ergebnis = new int[6];
		
		/* Anzahl der Richtigen */
		int r = 0;
		
		/* while-Schleife: bis 6 richtige Zahlen getippt wurden, kann etwas dauern... */
		while (r != 6) {
			
		/* Ziehung der Lottozahlen durch Methodenaufruf ziehen*/
		for (int i = 0; i < 6; i++) {
				ziehung[i] = zahl.ziehen();
			}
		
		
		/* Ueberprüfung auf Doppelte Zahlen mittels Vergleich zweier Arrays */
		for (int j = 0; j < 6; j++) {
			for (int z = 0; z < 6; z++) {
				
					/* falls gleich, war Ziehung doppelt, dann nochmal ziehen !*/
					if(ziehung[z] == ziehung[j]) {
							ziehung[z] = zahl.ziehen();
							}
			
						else	/* andernfalls Zahl in Ergebnis-Feld  */
							{
							ergebnis[z] = ziehung[z]; }
							}
		}
		
				
		/* Eingabe-Tip des Spielers */
		int[]spiel;
		spiel = new int[6];
		spiel = Tip.tippen();
		
		
		/* Aufruf des Sortieralgorithmus BubbleSort in Klasse Sortierung mit Uebergabe ergebnis-Feld*/
		/* Im Array ergebnis steht anschliessend das sortierte Feld */
		Sortierung.bubbleSort(ergebnis);
		
		
		/* Aufruf der Methode vergleichen */
		r = Vergleich.vergleichen(ergebnis,spiel);
		
			
		/* Ausgabe des Ziehungsergebnis */
		System.out.print("Das Endergebnis der Ziehung : ");
		
		for (int k = 0; k < 6; k++) {
			System.out.print(" " + ergebnis[k] + " ");
		}
		
		System.out.println("\r\r Die Ziehung ist wie immer ohne Gewähr !\r ");
		System.out.println("Sie haben : " + r + " richtige Zahl(en) getippt !");
		
		}
		
		System.out.println(" Sie haben 6 Richtige: da freut sich die Lottofee Karin !");
	}
}

