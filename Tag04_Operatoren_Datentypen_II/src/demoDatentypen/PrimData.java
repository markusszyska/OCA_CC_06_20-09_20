package demoDatentypen;

public class PrimData {
	public static void main(String[] args) {
		// Ganzzahlen
		byte b = 10;
		System.out.println("b : " + b);
		byte byteMin = Byte.MIN_VALUE;
		System.out.println("byteMin: " + byteMin);
		byte byteMax = Byte.MAX_VALUE;
		System.out.println("byteMax: " + byteMax);

		short s1 = 10;
		System.out.println("s1: " + s1);
		short shortMin = Short.MIN_VALUE;
		System.out.println("shortMin: " + shortMin);
		short shortMax = Short.MAX_VALUE;
		System.out.println("shortMax: " + shortMax);

		int i1 = 10;
		System.out.println("int i1: " + i1);
		int intMin = Integer.MIN_VALUE;
		System.out.println("intMin: " + intMin);
		int intMax = Integer.MAX_VALUE;
		System.out.println("intMax: " + intMax);

		long l1 = 10;
		System.out.println("long l1: " + l1);
		long longMin = Long.MIN_VALUE;
		System.out.println("longMin: " + longMin);
		long longMax = Long.MAX_VALUE;
		System.out.println("longMax: " + longMax);

		// Oktal
		int oktal1 = 07;

		// Hexadezimal
		int hex1 = 0xDEADCAFE;
		System.out.println("Hex: " + hex1);

		// Binaer
		int binaer1 = 0B10101;
		System.out.println("Binaer " + Integer.toBinaryString(binaer1));

		long l2 = 10000;
		// The literal 10000000000000 of type int is out of range
		/*
		 * Alle Ganzzahlen Literale sind in Java implizit int Darum muss das Literal,
		 * dass nicht in den Zahlenbereich von int passt, gekennzeichnet werden.
		 */
//		long l3 = 10000000000000;
		long l3 = 10000000000000l;
		long l4 = 10000000000000L;

		long l5 = 1_0_0_0_0_0_0_0;
		System.out.println(l5);

		// Fliesskommazahlen
		float f1 = 1.5F;
		System.out.println("float f1: " + f1);
		float floatMin = Float.MIN_VALUE;
		System.out.println("floatMin: " + floatMin);
		float floatMax = Float.MAX_VALUE;
		System.out.println("floatMax: " + floatMax);

		double d1 = 1.5;
		System.out.println("double d1 : " + d1);
		double doubleMin = Double.MIN_VALUE;
		System.out.println("doubleMin: " + doubleMin);
		double doubleMax = Double.MAX_VALUE;
		System.out.println("doubleMax: " + doubleMax);

		// Wahrheitswerte
		boolean b1 = true;
		boolean b2 = false;

		// Einzelne Zeichen
		char c1 = 'a';
		System.out.println("char c1: " + c1);
		char charMin = Character.MIN_VALUE;
		System.out.println("charMin: " + charMin);
		char charMax = Character.MAX_VALUE;
		System.out.println("charMax: " + charMax);

		System.out.println("charMin: " + (int) charMin);
		System.out.println("charMax: " + (int) charMax);

	}
}
