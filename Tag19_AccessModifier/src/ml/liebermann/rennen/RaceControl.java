package ml.liebermann.rennen;

public class RaceControl {
	public static void main(String[] args) {
		Fahrrad f = new Fahrrad();
		Auto a = new Auto();
		Rennwagen r = new Rennwagen();
		Krankenwagen k = new Krankenwagen();

		// Start vorbereiten
		f.setGeschwindigkeit(20);
		a.setGeschwindigkeit(150);
		r.setGeschwindigkeit(200);
		k.setGeschwindigkeit(80);
		// Fahrrad bekommt einen Vorsprung
		f.bewegen(240);

		// Alle Fahren 1 Std
		f.bewegen(60);
		a.bewegen(60);
		r.bewegen(60);
		k.bewegen(60);
		Fahrzeug[] positionen = { f, a, r, k };
		BubbleIsBack(positionen);
		for (int i = 0; i < positionen.length; i++) {
			System.out.println("Platz " + (i + 1) + ". ist das Fahrzeug " + positionen[i].toString()+ "km/h");
			System.out.println("Zurueckgelegte Stecke: " + positionen[i].getPosition() + "km");
		}

	}

	public static void BubbleIsBack(Fahrzeug[] rennTeilnehmer) {
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < rennTeilnehmer.length - 1; i++) {
				if (rennTeilnehmer[i].getPosition() < rennTeilnehmer[i + 1].getPosition()) {
					Fahrzeug tmp = rennTeilnehmer[i];
					rennTeilnehmer[i] = rennTeilnehmer[i + 1];
					rennTeilnehmer[i + 1] = tmp;
					swapped = true;
				}
			}
		} while (swapped);

	}

}
