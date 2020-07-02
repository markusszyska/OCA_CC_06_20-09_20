package demoOperatoren;

public class DemoOperatoren {

	public static void main(String[] args) {
		int zahl1 = 5;
		int zahl2 = 10;

		int erg = zahl1 + zahl2;

		zahl1++;
		zahl1 = zahl1 + 1;

		zahl1--;
		zahl1 = zahl1 - 1;

		// Post und Pre Inkrement
		/*
		 * Bei Pre Inkrement wird der Wert erst erhoeht und danach genutzt. Bei Post
		 * Inkrement wird der Wert erst genutzt und danach erhoeht.
		 */
		// Pre Inkrement
		System.out.println(++zahl1);

		// Post Inkrement
		System.out.println(zahl1++);
		System.out.println(zahl1);

		// Modulo
		System.out.println("10 Modulo 3 entspricht: " + (10 % 3));

		// Compound Operators
		int zahl = 0;
		zahl += 5;
		System.out.println(zahl);

		int zahl3 = 5;
		long zahl4 = 5;

		/*
		 * Wenn eine Rechenoperation mit unterschiedlichen Datentypen durchgefuehrt
		 * wird, ist das Ergebnis vom Datentyp des Groesseren
		 */
//		int erg2 = zahl3 + zahl4;
//		int erg3 = 10 + 10L;

		int erg4 = (int) (zahl3 + zahl4);
		int erg5 = (int) (10 + 10L);

		/*
		 * Ganzzahlenliterale sind immer int, also ist das Ergebnis auch ein int. Wenn
		 * das Ergebnis in den kleineren Datentyp passt, wird implizit gecastet, sonst
		 * muss explizit gecastet werden.
		 */
		short s = 10 + 10;
		short s2 = (short)(10 + 100000);
		System.out.println(s2);		
		
	}
}
