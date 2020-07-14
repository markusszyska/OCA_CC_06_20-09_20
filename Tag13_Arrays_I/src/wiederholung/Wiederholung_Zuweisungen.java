package wiederholung;

public class Wiederholung_Zuweisungen {
	public static void main(String[] args) {
		int zahl = 10;
		int erg = 10/5;
		/*
		 * Bei Rechenoperationen hat das Ergebnis
		 * immer den Datentyp des groesseren Operanden
		 */
		byte b = 10/5;
//		byte b1 = 1000/5;
		
		short zahl2 = 10;
		//Type mismatch: cannot convert from int to byte
//		byte erg2 = zahl + zahl2;
		byte erg2 = (byte)(zahl + zahl2);
//		byte erg3 = (byte)zahl + (byte)zahl2;
		
		byte b1 = 120;
		byte b2 = 10;
//		byte erg4 = b1+b2;
		
		short s1 = 10;
		short s2 = 10;
//		short ergShort = s1+s2;
		
		int zahl3 = 2_000_000_000;
		int zahl4 = 1_500_000_000;
		int erg3 = zahl3 + zahl4;
		System.out.println(erg3);
		
		//Compound Operators
		/*
		 * Bei den zusammengesetzten Operatoren
		 * wird ein impliziter Cast durchgefuehrt
		 */
		byte erg5 = 0;
		erg5 += s1;
		
		//Variable wird erstellt
		//Objekt wird erstellt
		//Referenz wird der Variablen zugewiesen
		Wiederholung_Zuweisungen ref = new Wiederholung_Zuweisungen();
		
	}
}
