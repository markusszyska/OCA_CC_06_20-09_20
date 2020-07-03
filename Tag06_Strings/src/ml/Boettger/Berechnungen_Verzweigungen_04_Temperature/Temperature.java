/*

Aufgabe 1: Ermittlung der aktuellen Wetterlage

Erstellen Sie ein Programm, das anhand von vorgegebenen Eingabewerten zur 
Aussentemperatur und eventuelle Niederschlaege (engl. "precipitation") ueber
die aktuelle Wetterlage und moegliche Aktivitäten informiert.

a) Erstellen Sie dazu zunaechst eine neue Programmdatei Temperature.java.

b) Lesen Sie von der Konsole einen ganzzahligen Wert fuer die Aussentemperatur
ein und legen Sie diesen in einer geeigneten Konstante ab.

c) Lesen Sie anschliessend einen Wahrheitswert (true oder false) von der 
Konsole ein, der ueber die aktuelle Existenz von Niederschlaegen informiert,
und legen Sie diesen ebenfalls in einer geeigneten Konstanten ab.

In Abhaengigkeit der Wertebelegung der beiden eingelesenen Parameter soll Ihr 
Programm die folgenden Informationen ausgeben:

- Bei Temperaturen groeßer oder gleich 0 und Niederschlaegen:
	Sauwetter
	
- Bei Temperaturen zwischen 0 und incl. 19 Grad und ohne Niederschlaege: 
	Gehen wir spazieren?
	
- Bei Temperaturen groesser oder gleich 20 Grad und ohne Niederschlaege:
 	Gehen wir schwimmen?
 	
- Bei Minusgraden und Niederschlaegen: 
	Komm, geh'n wir Schlittenfahren!
	
- Bei Minusgraden ohne Niederschlaegen: 
	Lass uns am Lagerfeuer Gluehwein trinken.
	
d) Implementieren Sie diese Fallunterscheidung zunaechst ueber ineinander 
geschachtelte if-Anweisungen und fragen Sie dabei in jeder Bedingung genau
eine der beiden Variablen ab.

e) Implementieren Sie anschliessend analog eine inhaltlich gleiche
Fallunterscheidung mittels if-/else-if-Anweisungen.

f) Testen Sie Ihr Programm anschliessend mit geeigneten Werten so, dass
deutlich wird, dass alle fuenf definierten Faelle korrekt ausgefuehrt werden.

 */

package ml.Boettger.Berechnungen_Verzweigungen_04_Temperature;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		float f_outside_temperature = 0.00f;
		boolean b_precipitation = false;
				
		// read input
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Please enter the outside temperature ");
		f_outside_temperature = sc.nextFloat();

		System.out.println();
		System.out.print("Please enter precipitation(true, false) ");
		b_precipitation = sc.nextBoolean();
		
		// variant a)

		System.out.println();
		System.out.println("variant a");
		System.out.println();
		
		if (b_precipitation)
		{
			if (f_outside_temperature >= 0)
				System.out.println("Foul weather");
			else
				System.out.println("Come on, let's go sledding!");			
		}
		else	// no b_precipitation
		{
			if (f_outside_temperature >= 20)			
				System.out.println("Let's go swimming?");	
			else if (f_outside_temperature < 0)
				System.out.println("Let's drink mulled wine around the campfire.");
			else 
				System.out.println("Are we going for a walk?");
		}
				
		// variant b)
		
		System.out.println();
		System.out.println("variant b");
		System.out.println();
		if (f_outside_temperature >= 0 &&
			b_precipitation)
		{
			System.out.println("Foul weather");
		}
		else if (f_outside_temperature > 0 &&
			f_outside_temperature <= 19 &&	
				!b_precipitation)
		{	
			System.out.println("Are we going for a walk?");
		}
		else if (f_outside_temperature >= 20 &&
				!b_precipitation)
		{
			System.out.println("Let's go swimming?");	
		}
		else if (f_outside_temperature < 0 &&
				b_precipitation)
		{	
			System.out.println("Come on, let's go sledding!");	
		}
		else if (f_outside_temperature < 0 &&
				!b_precipitation)
		{
			System.out.println("Let's drink mulled wine around the campfire.");
		}
	}
}
