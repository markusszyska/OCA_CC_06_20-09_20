package ml.liebermann;

public class FahrzeugTest {
	// Datei: FahrzeugTest.java
	public static void main(String args[]) {
		System.out.println("Start des Programms");
		// Anlegen eines Arrays aus 6 Fahrzeugen
		Fahrzeug[] f = new Fahrzeug[6];
		// Die ersten 3 Elemente des Arrays sollen mit Pkws gefüllt werden
		for (int i = 0; i < 3; i++) {
			f[i] = new Pkw();
		}
		System.out.println();
		System.out.println("3 Pkws");
		// . . . . .
		// Die drei letzten Elemente mit Motorrädern füllen
		for (int i = 0; i < f.length; i++) {
			if(f[i] == null) {
				f[i] = new Motorrad();
			}
		}
		System.out.println();
		System.out.println("3 Motorräder");
		// . . . . .
		// Geben Sie in einer Schleife für alle Array-Elemente die
		// entsprechenden Datenfelder aus
		double summe = 0;
		for (int i = 0; i < f.length; i++) {
			if(f[i] instanceof Pkw) {
				((Pkw)f[i]).print();
			}
			else if(f[i] instanceof Motorrad) {
				((Motorrad)f[i]).print();
			}
			else {
				System.out.println("Schieb mal weg deine Moehre");
			}
			if(f[i] instanceof Fahrzeug) {
				summe += f[i].getPreis();
			}
		}

		// Ermittlung des Gesamtwerts aller Fahrzeuge

		System.out.println("\n\nGesamtwert aller Fahrzeuge: " + summe);
	}
}
