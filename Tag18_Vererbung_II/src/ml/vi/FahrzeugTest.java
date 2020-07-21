package ml.vi;

public class FahrzeugTest {
	public static void main(String args[]) {
		System.out.println("Start des Programms");

		Fahrzeug[] fahrzeuge = new Fahrzeug[6];

		System.out.println();
		System.out.println("3 Pkws");

		for (int i = 0; i < 3; i++) {
			fahrzeuge[i] = new Pkw();
		}
		System.out.println();
		System.out.println("3 Motorräder");

		for (int i = fahrzeuge.length - 3; i < fahrzeuge.length; i++) {
			fahrzeuge[i] = new Motorrad();
		}

		float summe = 0;
		for (int i = 0; i < fahrzeuge.length; i++) {

			summe += fahrzeuge[i].getPreis();

			if (fahrzeuge[i] instanceof Pkw) {
				((Pkw) fahrzeuge[i]).print();
			} else if (fahrzeuge[i] instanceof Motorrad) {
				((Motorrad) fahrzeuge[i]).print();
			} else {
				fahrzeuge[i].print();
			}

		}
		System.out.println("\n\nGesamtwert aller Fahrzeuge: " + summe);
	}
}