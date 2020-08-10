/*
Aufgabe 1: Auswahl but now with Enum

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

package ml.boettger.little_witch_with_enum;

public class LittleWitch {
	
	private enum ActionOfLitteWitch {
		T6, T7, T8, T9, T10, T11, T12;

		private String actionOfLittleWitch() {
			
			String [] actions = {
				"kommt die kleine Hex.",
				"schabt sie gelbe Rueben.",
				"wird Kaffee gemacht.",			
				"geht sie in die Scheun'.",
				"hackt sie Holz und Spaen'.",
				"\tFeuert an um 11,",
				"\tkocht dann bis um 12:"
			};
			
			return this.ordinal() + 6 <= 10 ?
				"\tMorgends frueh um " + (this.ordinal() + 6) + "\n\t" +					
				actions[this.ordinal()] :
				actions[this.ordinal()];	
		}
	}
	
	public static void main(String[] args) {		
		System.out.println();		
		for (ActionOfLitteWitch a : ActionOfLitteWitch.values())
		{
			System.out.println(a.actionOfLittleWitch());
		}		
		System.out.println("\tFroeschebein und Krebs und Fisch.");
		System.out.println("\tHurtig Kinder kommt zu Tisch!");
	}
}
