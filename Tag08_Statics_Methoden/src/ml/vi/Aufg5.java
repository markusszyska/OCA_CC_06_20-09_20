package ml.vi;

//Aufgabe 5
//Schreiben Sie ein Programm, das die ASCII-Tabelle ausgibt.

public class Aufg5 {

	public static void main(String[] args) {

		System.out.println("Tabelle für druckbare ASCII-Zeichen");
		System.out.println("Die Zahlen 32–126 sind Zeichen zugeordnet, für die Tasten auf der Tastatur vorhanden sind. 127 stellt den Befehl zum Löschen dar.");
		System.out.println("Dezimalzahl   Zeichen");

		System.out.println(32 + "            Leerzeichen");

		for (int i = 33; i < 127; i++) {

			System.out.print(i + "           ");
			if (i < 100)
				System.out.print(" ");
			System.out.println((char) i);

		}

		System.out.println(127 + "           LÖSCHEN");

	}

}
