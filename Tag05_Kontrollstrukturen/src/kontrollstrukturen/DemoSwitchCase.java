package kontrollstrukturen;

public class DemoSwitchCase {
	public static void main(String[] args) {

		int zahl = 3;

		/*
		 * Der Switch Case ist eine Fallunterscheidung Der Case ist der Eintrittspunkt.
		 * Ab dem Eintrittspunkt werden bis zum naechsten break; alle cases
		 * abgearbeitet: Fallthrough Effekt
		 * 
		 * Datentypen fuer Switch Case: byte short int char Seit Java 5: enum Seit Java
		 * 7: String
		 * 
		 */

		long b1 = 1L;
//		switch(b1) {
//		
//		}
		switch (zahl) {
		case 3:
			System.out.println("case 3 betreten");
		default:
			System.out.println("default case");
		case 1:
			System.out.println("case 1 betreten");
		case 2:
			System.out.println("case 2 betreten");
			break;
		}
		// Literale sind erlaubt
		switch (5) {
		}

		int a = 1;
		int b = 1;
		switch (a + b) {
		}

		byte b2 = 100;
		byte b3 = 10;
		final byte b4 = 10;
		/*
		 * Der Case muss eine Kompilierzeitkonstante sein, also ein Literal oder eine
		 * Konstante. Der Case muss kompatibel sein zu dem zu ueberpruefenden Datentyp
		 */
		switch (b2) {
		case 127:
//		case b3: //b3 ist keine Kompilierzeitkonstante
		case b4:
		}

		final byte b5 = 10;
		short zahl2 = 10;
		final int zahl3 = 2099;
		switch (zahl2) {
		case b5:
		case (short) zahl3:

		}

	}
}
