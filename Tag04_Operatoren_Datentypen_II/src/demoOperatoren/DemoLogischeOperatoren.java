package demoOperatoren;

public class DemoLogischeOperatoren {
	public static void main(String[] args) {

		/*
		 * && logisches UND/AND Beide Operanden müssen true sein damit das Ergebnis true
		 * ist.
		 */
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("Logisches Und: " + (b1 && b2));
		System.out.println("-------------------");
		
		/*
		 * || logisches Oder Es muss nur einer der beiden Operanden true sein damit dass
		 * Ergebnis true ist
		 */
		boolean b3 = true;
		boolean b4 = false;
		System.out.println("Logisches Oder: " + (b3 || b4));
		System.out.println("-----------");
		
		/*
		 * ^ Exklusives Oder Nur einer der beiden Operanden darf true sein, damit das
		 * Ergebnis true ist.
		 */
		boolean b5 = true;
		boolean b6 = true;
		boolean b7 = false;
		System.out.println("Exklusives Oder: " + (b5 ^ b6 ^ b7));
		System.out.println("-----------");
		
		/*
		 * ! Negation / Logisches Komplement // Kehrt den Wert eines boolean um
		 */
		boolean b8 = true;
		System.out.println("Negation: " + !b8);
		
		/*
		 * Beim && wird die Abarbeitung des Ausdrucks abgebrochen sobald
		 * das Ergebnis nicht mehr zu true ausgewertet werden kann.
		 * 
		 * Beim || wird die Abarbeitung abgebrochen, wenn das Ergebnis
		 * nicht mehr zu false ausgewertet werden kann.
		 */
		System.out.println("------------------------------");
		System.out.println("---------------Einfaches Und---------------");
		int zahl = 0;
		int zahl2 = 0;
		System.out.println((zahl = 10) < 5 & (zahl2 =20) < 30);
		System.out.println("zahl: " + zahl);
		System.out.println("zahl2: " + zahl2);
		
		System.out.println("------------------------------");
		System.out.println("---------------Doppeltes Und---------------");
		zahl = 0;
		zahl2 = 0;
		System.out.println((zahl = 10) < 5 && (zahl2 =20) < 30);
		System.out.println("zahl: " + zahl);
		System.out.println("zahl2: " + zahl2);
		
		System.out.println("------------------------------");
		System.out.println("---------------Doppeltes Und, zweite Bedingung false---------------");
		zahl = 0;
		zahl2 = 0;
		System.out.println((zahl = 10) < 15 && (zahl2 =20) < 10);
		System.out.println("zahl: " + zahl);
		System.out.println("zahl2: " + zahl2);
		
		System.out.println("------------------------------");
		System.out.println("---------------Doppeltes Oder---------------");
		zahl = 0;
		zahl2 = 0;
		System.out.println((zahl = 10) < 15 || (zahl2 = 20) < 30);
		System.out.println("zahl: " + zahl);
		System.out.println("zahl2: " + zahl2);
		
		System.out.println("------------------------------");
		System.out.println("---------------Einfaches Oder---------------");
		zahl = 0;
		zahl2 = 0;
		System.out.println((zahl = 10) < 15 | (zahl2 = 20) < 30);
		System.out.println("zahl: " + zahl);
		System.out.println("zahl2: " + zahl2);
		

	}
}
