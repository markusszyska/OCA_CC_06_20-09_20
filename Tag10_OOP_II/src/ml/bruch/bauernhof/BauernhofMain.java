package ml.bruch.bauernhof;

public class BauernhofMain {

	public static void main(String[] args) {
		Schwein s1 = new Schwein();
		Schwein s2 = new Schwein();
		
		s1.name = "Piggeldy";
		s1.gewicht = 100;
		s1.alter = 5;
		System.out.println(s1.name);
		
		s2.name = "Frederik";
		s2.gewicht = 300;
		s2.alter = 10;
		System.out.println(s2.name);
		
		s1.grunzen();
		s2.grunzen();

		Kuh k1 = new Kuh();
		Kuh k2 = new Kuh();
		
		k1.name = "Klaudia";
		k1.gewicht = 150;
		k1.alter = 5;
		k1.milchmenge =20;
		k1.hauptfarbe = "weis";
		k1.fleckenfarbe = "schwarz";


		System.out.println(k1.name + k1.gewicht);
		

		
		k1.muhen();
		k1.melken();

	}

}

/*
Machen Sie sich mit dem Aufbau einer Klasse und den Packages vertraut.

Bauen Sie den BauernhofSimulator Ihren Package nach.
Erzeugen Sie auf Grundlage der Klasse Schwein eine
Klasse Kuh.

Kuh soll folgende Attribute besitzen.
Name
Hauptfarbe
Fleckenfarbe
Milchmenge
Gewicht


// laufen sollte das Gewicht verringern, aber nicht unter 0 fallen dürfen
// fressen sollte das Gewicht erhöhen, aber nicht über ein bestimmtes Gewicht
// Eine Methode für die Milchmenge - melken
-- Milchmenge sollte nicht im Negativenbereich abfallen können
*/