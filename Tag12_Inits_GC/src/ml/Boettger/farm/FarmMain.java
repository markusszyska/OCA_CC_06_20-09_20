/*
 
Erweitern Sie den Bauernhofsimulator um folgende Klassen 

Klasse Bauer:

Attribute der Klasse Bauer:
- name
- gewicht
- groesse
- alter

Klasse Eimer:

Attribute der Klasse Eimer: 
- fuellmenge
- maxFuellmenge (optional)

Alle Attribute sollen private sein und entsprechende Getter/Setter Methoden 
sollen bereitgestellt werden.

Konstruktoren: ein default Konstruktor, also parameterlos und ein voll 
parametrisierter, der Parameterlose soll den voll Parametrisierten aufrufen.

Der Bauer soll folgende Methoden bereitstellen:

-	Eine Methode melken(), mit der eine bestimmte Kuh gemolken werden kann,
	also bei einem Kuh Objekt die Methode wirdGemolken() aufgerufen wird.
	Die erhaltene Milch der Kuh soll der Bauer in ein Objekt vom Typ Eimer
	fuellen koennen.
	
----------------------------------------------------------------	

Der Stall soll eine Tuer haben. Diese Tuer soll verschliessbar sein. 
Sie soll also die Zustaende aufgeschlossen / zugeschlossen haben.
Diese Tuer soll mit einem Schluessel auf und zugeschlossen werden koennen.
Der Bauer soll einen Schluessel haben koennen, mit dem er die Tuer auf und zu
schliessen kann.

*/

package ml.Boettger.farm;

import java.util.Scanner;

public class FarmMain 
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
	    FarmMain.sc.nextLine();	    
	}
	
	public static boolean isTESTMODE() 
	{
		return TESTMODE;
	}
	
	public static void main(String[] args)
	{
		String s_input = "";		// input request string
		
		//                      name   weight height age
		
		System.out.println();
		Farmer max = new Farmer("Max", 80.2f, 1.95f, 38);

		System.out.println();
		System.out.println(
			"\tDo you want to test milking? - answer yes or no: ");
		System.out.print("\t> ");
		
		s_input = sc.nextLine();
		if (s_input.equalsIgnoreCase("yes"))
		{	
			//#################################################################
			// milking
			//#################################################################
			
			Cow christa =
				//      name      age  weight   milk/L  color 	 color of spots	
				new Cow("Christa", 20, 600.00f, 228.2f, "white", "brown");
		
				//                     filling anount     max filling amount
			Bucket bucket = new Bucket(0.0f,              28.0f);		
		
				// 1. attempt
			max.milking(christa, 20.0f, bucket);
			FarmMain.pause();
		
			// 2. attempt
			max.milking(christa,  20.0f, bucket);
			FarmMain.pause();		
		
			Cow frieda = new Cow (
				"Frieda", 23, 500.00f, 20.0f, "gelb", "gruen");
		
			// 3. attempt
			max.milking(frieda, 28.0f, new Bucket(0.0f, 30.0f));		
			FarmMain.pause();
		}	
		
		System.out.println();
		System.out.println(
			"\tDo you want to test opening, closing the door? (yes or no): ");
		System.out.print("\t> ");
		
		s_input = sc.nextLine();
		if (s_input.equalsIgnoreCase("yes"))
		{		
			//#####################################################################
			// opening, closing the door of the barn
			//#####################################################################

			Barn b1 = new Barn();		
			Barn b2 = new Barn();

			Door d1 = new Door();
			Door d2 = new Door();
			
			// there my be clone keys with the same number to open the door

			Key k1  = new Key(1);		// with key number 1
			Key k2  = new Key(2);		// with key number 2
			
			Key k1b	= new Key(1);		// k1b - is a clone key of k1, but it
										// does not belong to the farmer
			
			Key k1c = new Key(1);		// k1c - is a clone key of k1, it 			
										// belongs to the farmer
										// but not to the door and barn
			
			// set connections between key and farmer
			k1c.setBelongs_to_farmer(max);					// k1c -> max
			
			Key k1d = new Key(1);		// k1d - is a clone key of k1, it 			
										// belongs to the farmer and the barn
										// but not to the door
			k1d.setBelongs_to_farmer(max);	
			k1d.setBelongs_to_barn(b1);

			Key k1e = new Key(1);		// k1e - is a clone key of k1, it
										// belongs to the farmer, the barn
										// and the door
			k1e.setBelongs_to_farmer(max);
			k1e.setBelongs_to_barn(b1);
			k1e.setBelongs_to_door(d1);
			
			// set connections betweem barns and doors
			b1.setDoor_of_barn(d1);						// b1 -> d1
			b2.setDoor_of_barn(d2);						// b2 -> d2
			
			// set connections between doors and barns
			d1.setBelongs_to_barn(b1);					// d1 -> b1
			d2.setBelongs_to_barn(b2);					// d2 -> b2
			
			// set connections bewtween doors and keys
			d1.setBelongs_to_key(k1);					// d1 -> k1
			d2.setBelongs_to_key(k2);					// d2 -> k2
			
			// set connections between keys and doors
			k1.setBelongs_to_door(d1);					// k1 -> d1
			k2.setBelongs_to_door(d2);					// k2 -> d2
			
			// set connections between keys and barns
			k1.setBelongs_to_barn(b1);					// k1 -> b1
			k2.setBelongs_to_barn(b2);					// k2 -> b2
			
			// set connections between key and farmer
			k1.setBelongs_to_farmer(max);				// k1 -> max

			// set connection from farmer to key
			max.setKey(k1);								// max -> k1
			
			System.out.println(
				"\tMax tries to open the door with his own key");
			max.getKey().getBelongs_to_door().open_the_door(max.getKey());
			FarmMain.pause();
				
			System.out.println(
				"\tMax tries to open the door with another key k2");
			max.getKey().getBelongs_to_door().open_the_door(k2);
			FarmMain.pause();
		
			System.out.println(
				"\tMax tries to close the door with another key k2");
			max.getKey().getBelongs_to_door().close_the_door(k2);
			FarmMain.pause();
		
			System.out.println(
				"\tMax tries to close the door with his own key k1");
			max.getKey().getBelongs_to_door().close_the_door(max.getKey());
			FarmMain.pause();

			System.out.println(
				"\tMax tries to open the door with a clone key k1b");
			max.getKey().getBelongs_to_door().open_the_door(k1b);
			FarmMain.pause();
			
			System.out.println(
					"\tMax tries to open the door with a clone key k1c");
			max.getKey().getBelongs_to_door().open_the_door(k1c);
			FarmMain.pause();
			
			System.out.println(
					"\tMax tries to open the door with a clone key k1d");
			max.getKey().getBelongs_to_door().open_the_door(k1d);
			FarmMain.pause();
			
			System.out.println(
					"\tMax tries to open the door with a clone key k1e");
			max.getKey().getBelongs_to_door().open_the_door(k1e);
			FarmMain.pause();			
		}
		
		System.out.println();
		System.out.println("\tEnd of program");
		System.out.println();
	}
}
