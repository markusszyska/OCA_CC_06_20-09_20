/*
Aufgabe 1: Auswahl
Erstellen Sie im Folgenden ein Programm namens LittleWitch.java, das die 
Vormittagsgestaltung der kleinen Hexe gemaess eines bekannten Kindergedichtes
beschreibt.

a) Definieren Sie sich dazu eine ganzzahlige Variable namens "clock", 
deren Wert der Reihe nach die Uhrzeiten zwischen 6 und 12 Uhr durchlaeuft.

b) Halten Sie Ihre Ausgabeanweisungen frei von Redundanzen.

c) Verwenden Sie soweit sinnvoll eine Auswahl-Anweisung, um das Verhalten der
kleinen Hexe in Abhaengigkeit der aktuellen Uhrzeit festzulegen.

d) Das Programm soll die folgende Ausgabe erzeugen:

Morgens frueh um 6
kommt die kleine Hex.
Morgens frueh um 7
schabt sie gelbe Rueben.
Morgens frueh um 8
wird Kaffee gemacht.
Morgens frueh um 9
geht sie in die Scheun'.
Morgens frueh um 10
hackt sie Holz und Spaen'.
Feuert an um 11,
kocht dann bis um 12:
Froeschebein und Krebs und Fisch.
Hurtig Kinder kommt zu Tisch!

*/

package ml.Boettger._03_Task_1_LittleWitch;

public class LittleWitch {
	public static void main(String[] args) {
		String s = " ";
				
		System.out.println();
		for (int clock = 6; clock <= 12; clock++)
		{		
			if (clock >= 6 && clock <= 10)
			{
				System.out.println("\tMorgens frueh um " + clock);
				System.out.print("\t");
			}

			switch(clock)
			{
				case 6:
					s = "kommt die kleine Hex.";
					break;
				case 7:
					s = "schabt sie gelbe Rueben.";
					break;
				case 8:	
					s = "wird Kaffee gemacht.";
					break;
				case 9:
					s = "geht sie in die Scheun'.";
					break;
				case 10:
					s = "hackt sie Holz und Spaen'.";
					break;
				case 11:
					s = "\tFeuert an um " + clock + ",";
					break;
				case 12:
					s = "\tkocht dann bis um " + clock + ":";					
			}
			System.out.println(s);
		}
		System.out.println("\tFroeschbein und Krebs und Fisch.");
		System.out.println("\tHurtig Kinder kommt zu Tisch!");
	}
}
