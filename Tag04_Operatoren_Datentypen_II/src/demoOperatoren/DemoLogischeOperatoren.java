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
	}
}
