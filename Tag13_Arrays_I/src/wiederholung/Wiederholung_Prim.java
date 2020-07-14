package wiederholung;

public class Wiederholung_Prim {
	public static void main(String[] args) {
		int zahl = 100; // dezimal
		int bin = 0B1010; // binaer
		int okt = 013; // oktal
		int hex = 0XDEADCAFE; // hexadezimal
		System.out.println(hex);
		long l11 = 0XDEADCAFEL;
		System.out.println(l11);
		/*
		 * Unterstriche in Literalen sind bei Zahlenliteralen erlaubt, um die Lesbarkeit
		 * zu verbessern. Sie werden vom Compiler nicht ausgewertet
		 */
		int i = 10_000_000;
		double d1 = 1.5_5_5;
		// Die Unterstriche duerfen nicht vorne oder hinten sein
//		int i1 = _1_10_;
		/*
		 * Bei long muss nur ein L am Literal stehen, wenn das Literal zu gross fuer ein
		 * int ist, da Ganzzahlenliterale immer int sind.
		 */
		long l = 10000000000l;
		/*
		 * Beim float muss ein F am Literal stehen da Kommazahlenliterale immer double
		 * sind
		 */
		float f = 1.5f;
		/*
		 * Beim double kann ein D am Literal stehen, muss aber nicht
		 */
		double d = 1.5d;
		double d2 = 1.5;

		boolean b1 = true;
		boolean b2 = false;
		
		char c1 = 'a';
		char c2 = '\u0061'; //Unicode
		
		byte b4 = 100;
		byte b3 = 0;
		b3 += b4 + 7;
		System.out.println(b3);
	}
}
