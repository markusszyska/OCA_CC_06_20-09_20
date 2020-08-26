package kapitel1.accessModifiers;

public class ModifierLocalVariables {
	public static void main(String[] args) {

		/*
		 * Lokale Variablen haben keinen Sichtbarkeitsmodifizierer
		 */
//		public int zahl;
		//final ist der einzuge Modifier fuer lokale Variablen
		final int finalZahl = 5;
		
		/*
		 * Lokale Variablen:
		 * - Sie sind in dem Block gueltig, in dem sie deklariert worden sind
		 * - Lokale Variablen bekommen keine Standardwerte
		 */
		int zahl2;
//		System.out.println(zahl2);
		final int zahl3;
//		System.out.println(zahl3);
	
		zahl3 = 1;
//		zahl3 = 10;
	}
}
