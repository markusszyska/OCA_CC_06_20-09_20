/*
Aufgabe 1: Fahrzeugrennen

a) 

Fuer die Simulation eines Wettrennens sollen verschiedene Fahrzeugarten
objektorientiert modelliert werden. Da alle Fahrzeugtypen gemeinsame
Eigenschaften haben, definieren Sie zunaechst eine Basisklasse Fahrzeug, die
als Oberklasse fuer die anderen Klassen dienen soll. Ein Fahrzeug hat folgende
allgemeine Merkmale:

- Aktuelle Position (in km und der Einfachheit halber in nur einer Dimension)

- Aktuelle Geschwindigkeit (in km/h)
	
Ein Fahrzeug kann bewegt werden. Legen Sie daher eine Methode bewege an. Die
Methode soll mit einem double-Parameter aufgerufen werden. Beim Methodenaufruf
wird die Zeitdauer (in Minuten) uebergeben, mit der sich das Fahrzeug mit der
aktuellen Geschwindigkeit vorwaertsbewegen soll. Der Methodenaufruf aendert
folglich die Position des Fahrzeugs, wenn es mit einer von 0 abweichenden
Geschwindigkeit bewegt wird.

Die Geschwindigkeit des Fahrzeugs kann entsprechend mit Hilfe der Methode
setGeschwindigkeit() festgelegt werden. Die Geschwindigkeit darf die
Maximalgeschwindigkeit nicht ueberschreiten.

Die Maximalgeschwindigkeit des Fahrzeugs soll mit Hilfe der Methode
getMaxGeschwindigkeit() abgefragt werden koennen. Fuer ein Objekt der Klasse
Fahrzeug soll die Maximalgeschwindigkeit 0 (Zero) sein.

Die Anzahl der Raeder soll entsprechend gesetzt und abgefragt werden koennen.
In der Klasse Fahrzeug soll diese mit 0 initialisiert werden. 

Mit Hilfe der Methode toString() soll umfassend Auskunft ueber ein Fahrzeug
gegeben werden.

Schreiben Sie die Klasse Fahrzeug, indem Sie geeignete Attribute, Konstruktoren
(inkl. Standard-Konstruktor) und Methoden definieren!

===============================================================================

b)

In einem weiteren Schritt sollen konkrete Fahrzeuge definiert werden, indem
entsprechende Klassen von der Klasse Fahrzeug abgeleitet werden:

- Ein Fahrrad ist ein Fahrzeug mit 2 Raedern und Maximalgeschwindigkeit
30 km/h.

- Ein Auto ist ein Fahrzeug mit 4 Raedern und Maximalgeschwindigkeit 140 km/h.

- Ein Rennwagen ist ein Auto mit Maximalgeschwindigkeit 220 km/h.

- Ein Krankenwagen ist ein Auto mit einem zusaetzlichen Blaulicht, das ein- 
oder ausgeschaltet sein kann. Legen Sie fuer diese Funktionalitaet ein neues
Attribut an.

Die Klasse Krankenwagen soll Methoden zum Ein- bzw. Ausschalten des Blaulichts
anbieten. Definieren Sie diese Klassen und nutzen Sie dabei so weit wie 
moeglich die Vererbung von Eigenschaften aus

===============================================================================

c)

Die Simulation des Wettrennens soll mit Hilfe der Klasse Wettrennen beschrieben
werden. In der main-Methode erzeugen sie sich je ein Fahrzeug jedes Typs und
setzen dann die Geschwindigkeiten auf folgende Werte:

- Fahrrad 20 km/h
- Auto 150 km/h
- Rennwagen 200 km/h
- Krankenwagen 80 km/h

Die Fahrzeuge sollen sich anschliessend bewegen. Der Gerechtigkeit halber soll
das Fahrrad einen Vorsprung von 4 Stunden erhalten.

Anschliessend sollen alle Fahrzeuge eine Stunde lang mit unveraenderter
Geschwindigkeit vorwaertsfahren.

Abschliessend sollen alle aktuellen Positionen ausgeben werden.

Wer ist erster und wer letzter?
 
 */

package ml.boettger.task_1_Vehicle_racing;

import java.util.Arrays;
import java.util.Scanner;

public class RaceMain 
{
	//########################################################################
	//
	//	Here you can switch on/off the testmode
	//
	final public static boolean TESTMODE = true;	// testmode true/false
	//
	//########################################################################
	
	final public static String CTOR = "\tctor\n";	// ctor in testmode
	
	public static Scanner sc = new Scanner(System.in); 
		// for pausing console output, see function pause
	
	public static void pause()
	{
		System.out.println();
	    System.out.println("\tPress Any Key To Continue...");
	    RaceMain.sc.nextLine();	    
	}
	
	public static boolean isTESTMODE() 
	{
		return TESTMODE;
	}
	
	//#########################################################################
	public static void main(String[] args) 
	//
	//#########################################################################
	{
		double[] arr = new double[4];
				
		System.out.println();
		
		/*
		Vehicle v = new Vehicle();
		
		System.out.println(
			"\tThe vehicle \"" + v.getClass().getSimpleName() +
			"\" had been created.");
		*/
		
		Bicycle   b  = new Bicycle   (0, 20);
		Car       c  = new Car       (0, 150);
		Race_Car  rc = new Race_Car  (0, 200);
		Ambulance a  = new Ambulance (0, 80);
		
		// The bike gets a 4-hour lead
		b.move(4 * 60);
		System.out.println(b.toString());
		
		// drive 60 minutes
		b.move(60.0);
		c.move(60.0);
		rc.move(60.0);
		a.move(60.0);

		// save in array
		arr[0] = b.getD_actual_position();
		arr[1] = c.getD_actual_position();
		arr[2] = rc.getD_actual_position();
		arr[3] = a.getD_actual_position();		
		Arrays.sort(arr);
				
		// print the actual positions		
		System.out.println("\t" + b.getClass().getSimpleName() + " : " +
			b.getD_actual_position() + " km.");
		
		System.out.println("\t" + c.getClass().getSimpleName() + " : " +
			c.getD_actual_position() + " km.");
		
		System.out.println("\t" + rc.getClass().getSimpleName() + " : " +
			rc.getD_actual_position() + " km.");
		
		System.out.println("\t" + a.getClass().getSimpleName() + " : " +
			a.getD_actual_position() + " km.");
		
		//#####################################################################
		// which vehicle is the last one?
		//#####################################################################
		System.out.println();
		System.out.print("\t");
		
		if (arr[0] == b.getD_actual_position())
		{ 
			System.out.print(b.getClass().getSimpleName()); 
		}
		
		if (arr[0] == c.getD_actual_position())
		{ 
			System.out.print(c.getClass().getSimpleName()); 
		}
		
		if (arr[0] == rc.getD_actual_position())
		{ 
			System.out.print(rc.getClass().getSimpleName()); 
		}
		
		if (arr[0] == a.getD_actual_position())
		{ 
			System.out.print(a.getClass().getSimpleName()); 
		}
		System.out.println(" is the last vehicle.");			
		
		//#####################################################################
		// which vehicle is the first one?
		//#####################################################################
		System.out.println();
		System.out.print("\t");
		
		if (arr[3] == b.getD_actual_position())
		{ 
			System.out.print(b.getClass().getSimpleName()); 
		}
		
		if (arr[3] == c.getD_actual_position())
		{ 
			System.out.print(c.getClass().getSimpleName()); 
		}
		
		if (arr[3] == rc.getD_actual_position())
		{ 
			System.out.print(rc.getClass().getSimpleName()); 
		}
		
		if (arr[3] == a.getD_actual_position())
		{ 
			System.out.print(a.getClass().getSimpleName()); 
		}
		System.out.println(" is the first vehicle.");
		
		System.out.println();
		System.out.println("\tEnd of program");
		System.out.println();
	}
}
