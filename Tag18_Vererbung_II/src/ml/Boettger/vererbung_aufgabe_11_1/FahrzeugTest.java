/*

Die Klassen Pkw und Motorrad sollen von der Klasse Fahrzeug abgeleitet werden.
In der Klasse FahrzeugTest sollen die Klassen Pkw und Motorrad getestet werden.
Das folgende Java-Programm enthaelt die Klassen Fahrzeug, Pkw, Motorrad und 
FahrzeugTest. Die fehlenden und zu ergaenzenden Teile des Programms sind durch
; gekennzeichnet. Lesen Sie zuerst die Fragen nach dem Programm, bevor Sie das
Programm vervollstaendigen!

a) Schreiben Sie die Methode getPreis() der Klasse Fahrzeug.

b) Vervollstaendigen Sie den Konstruktor der Klasse Pkw.

c) In der Klasse Pkw soll die Methode print() der Klasse Fahrzeug ueber-
schrieben werden. Die Methode print() der Klasse Pkw soll alle Datenfelder
eines Objektes der Klasse Pkw ausgeben und dabei die Methode print() ihrer
Basisklasse aufrufen. Ergaenzen Sie die Methode print() der Klasse Pkw.
Ergaenzen Sie in analoger Weise die Methode print() der Klasse Motorrad.

d) Ergaenzen Sie die fehlenden Teile der Klasse FahrzeugTest.

*/

package ml.Boettger.vererbung_aufgabe_11_1;
public class FahrzeugTest
{
	public static void main (String args[])
	{
		float summe = 0.00f;
		
		System.out.println();
		System.out.println ("\tStart des Programms");
		System.out.println();
		System.out.println("\tAnlegen eines Arrays aus 6 Fahrzeugen:");
		System.out.println("\tFahrzeug[] fahrzeuge = new Fahrzeug[6];");
		Fahrzeug[] fahrzeuge = new Fahrzeug[6];
				
		System.out.println();
		System.out.println(
			"\tDie ersten 3 Elemente des Arrays sollen mit Pkws" + 
				" gefuellt werden:");
		System.out.println();		
		System.out.println("\tfor (int i = 0; i < 3; i++)");
		System.out.println("\t{");
		System.out.println("\t\tfahrzeuge[i] = new Pkw();");
		System.out.println("\t{");
		System.out.println();
		System.out.println ("\t3 Pkws");
		
		for (int i = 0; i < 3; i++)
		{
			fahrzeuge[i] = new Pkw();
		}
		
		System.out.println();
		System.out.println(
			"\tDie drei letzten Elemente mit Motorraedern fuellen.");
		System.out.println();
		System.out.println("\tfor (int i = 3; i < 6; i++)");
		System.out.println("\t{");
		System.out.println("\t\tfahrzeuge[i] = new Motorrad();");
		System.out.println("\t}");
		System.out.println();
		System.out.println ("\t3 Motorraeder");
		
		for (int i = 3; i < 6; i++)
		{
			fahrzeuge[i] = new Motorrad();
		}
		System.out.println();
		System.out.println("\tGeben Sie in einer Schleife für alle\n" +
				"\tArray-Elemente die entsprechenden Datenfelder aus.");
		System.out.println();
		System.out.println("\tErmittlung des Gesamtwerts aller Fahrzeuge:");
		System.out.println();
		System.out.println("\tfor (Fahrzeug f : fahrzeuge)");
		System.out.println("\t{");
		System.out.println("\t\tsumme += f.getPreis();");
		System.out.println("\t\tf.print();");
		System.out.println("\t}");
		System.out.println();
	
		for (Fahrzeug f : fahrzeuge)
		{
			summe += f.getPreis();
			f.print();
		}
		System.out.println ("\n\n\tGesamtwert aller Fahrzeuge: " + summe);
	}
}