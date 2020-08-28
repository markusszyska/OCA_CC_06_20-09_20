package kapitel4;

public class Operatoren {
	public static void main(String[] args) {

		// Vergleichsoperatoren: != == < <= > >=

		/*
		 * Das Ergebnis ist immer vom Typ boolean
		 */

		char c1 = 'a';
		char c2 = 'a';

		System.out.println(c1 == c2); // Beim Vergleich benutzt Java die int Werte

		/*
		 * == != Verglichen werden koennen: - char - Zahlenwerte - boolean -
		 * Referenzvariablen
		 */
		Object o = new Object();
		Object o1 = new Object();
		System.out.println(o == o1); // false
		o = o1;
		System.out.println(o == o1); // true

		// ------------------------- instanceof----------------------------
		// instanceof testet ob eine Referenz von einem bestimmten Typ ist
		A a1 = new A();
		A a2 = new B();
		System.out.println(a1 instanceof B); // false
		System.out.println(a2 instanceof B); // true

		System.out.println(new B() instanceof A);
//		System.out.println(a1 instanceof new B());

		// ----------------------- arithmetischen Operatoren--------------
		// + - * / %

		// ----------------------- ueberladener + Operator--------------
		System.out.println(4 + 7 + " ab hier werden Strings aneinander gehangen " + 4 + 7); // 11 47

		// ----------------------- Post/Pre Inkrement/Dekrement--------------
		int zahl = 10;
		System.out.println(++zahl); // 11
		System.out.println(zahl++); // 11 Nach der Benutzung wird der Wert erhoeht!
		System.out.println(zahl); // 12

		zahl = 5;
		System.out.println(zahl++ + ++zahl); // 5 + 7

		final int zahl2 = 2;
//		zahl2++;

		// ----------------------- Compound Operator--------------
		// += -= *= /= %=
		// Die Compound Operators fuehren einen automatischen Cast durch
		int zahl3 = 10;
		long lo = 10L;

//		zahl3 = zahl3 + lo;
		zahl3 += lo;

		zahl3 = (int) lo;// Narrowing
		lo = zahl3;// Widening

		// ----------------------- teraerer Operator--------------
		// ? : - Anzahl der ? und : muss immer gleich sein
//		zahl2 > 0 ? System.out.println("ist groesser") : System.out.println("ist kleiner");
		/*
		 * geht nur mit Zuweisung oder Rueckgabe
		 */
		String s = zahl3 > 0 ? "ist groesser" : "ist kleiner";

		A a3 = zahl3 > 0 ? new A() : new B();

		if (zahl3 > 0) {
			a3 = new A();
		} else {
			a3 = new B();
		}

		int zahl4 = zahl3 > 0 ? zahl3 > 10 ? 10 : zahl3 : (int) lo;

		if (zahl3 > 0) {
			if (zahl3 > 10) {
				zahl4 = 10;
			} else {
				zahl4 = zahl3;
			}
		} else {
			zahl4 = (int) lo;
		}

		// ----------------------- logische Operatoren--------------
		// ! - logische Negation
		boolean b1 = true;
		System.out.println(!b1); //false

		// ^ XOR Exklusiv oder
		boolean b2 = true;
		System.out.println(b1 ^ b2); //false
		
		// || - |  && - &
		/*
		 * || Auswertung bricht ab, wenn ein Ausdruck true ist
		 * && Auswertung bricht ab, wenn ein Ausdruck false ist
		 * 
		 */
		
		
		
	}

}

class A {
}

class B extends A {
}
