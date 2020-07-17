/*
Aufgaben Bauernhof

1.	Erweitern Sie den Bauernhofsimulator um die Klasse Bauernhof. Die Klasse
 	Bauernhof soll mit dem Stall in einer "Has-A" Beziehung stehen, also eine 
 	Referenz vom Typ Stall halten. Mit jedem Bauernhof Objekt soll auch ein
 	Stall Objekt erstellt werden. Die Klasse Bauer soll den Bauernhof kennen,
 	der ihm gehoert, also auch mit ihm in einer "Has-A"	Beziehung stehen.

2. 	Erweitern Sie den Stall, so dass er jeweils 10 Kuehe und 10 Schweine 
	Referenzen aufnehmen kann. Schreiben Sie dazu die noetingen Getter/Setter 
	und Konstruktoren.

3. 	Erweitern Sie die Klasse Bauer, so dass ein Bauer eine bestimmte Kuh oder
	ein bestimmtes Schwein in den Stall "seines" Bauernhofes stellen kann.
	Dabei soll die Kuh bzw. Schweine Referenz in den ersten freien Platz im
	Stall geschrieben werden. Sollte der Stall voll sein, soll eine
	entsprechende Meldung ausgegeben werden.
	
4.	Erweitern Sie die Klassen Kuh und Schwein um einen Verkaufspreis und die
	Klasse Bauer um ein Attribut "kontostand" mit entsprechenden
	Gettern/Settern.
	
5. 	Erweitern Sie die Klasse Bauer, so dass der Bauer eine bestimmte Kuh oder
    ein bestimmtes Schwein aus dem Stall verkaufen kann. Die Kuh / das Schwein
    soll anhand des Namens im Stall gesucht werden.
    Wenn die Kuh/das Schwein nicht im Stall gefunden wird, soll eine 
    entsprechende Meldung ausgegeben werden. Der Verkauf soll den Kontostand
    des Bauern entsprechend des Verkaufspreises erhoehen. Nach dem Verkauf soll
    die Kuh/das Schwein "eligible for GC" sein.
	
6. 	Erweitern Sie den Bauernhof Simulator, so noch nicht geschehen um die
    Klassen Karotte und Kartoffel. Beide sollen das Attribut "sorte" haben.
    Zusaetzlich soll die Karotte ein Attribut "ruebenlaenge" und die Kartoffel
    ein Attribut "knollengroesse" haben. Die Kuh/das Schwein sollen beides
    Essen koennen, das Gewicht soll sich entsprechend der Knollengroesse/der
    Ruebenlaenge erhoehen. Der Bauer soll eine Kuh/ein Schwein mit einer
    Karotte/Kartoffel fuettern koennen.
	
7. 	Bonus:
	Erweitern Sie die Klasse Eimer, sodass der Eimer jeweils 10 Karotten / 10
	Kartoffeln aufnehmen kann. 
	
	Der Bauer soll eine Methode "alleTiereFuettern()" bekommen, mit der er alle
	Tiere im Stall mit jeweils einer Kartoffel / einer Karotte fuettern kann. 
	
	Danach muss die Karotte/Kartoffel "eligible for GC"	sein. Sollte nach dem
	Fuettern noch Futter uebrig sein, soll eine Meldung ausgegeben werden, 
	ebenso, wenn nicht genug Futter vorhanden ist.	
*/

package ml.Boettger.farm_task_1_to_7;

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
		Farm my_farm = new Farm("My Home My Farm");		
		Barn b = new Barn();		
		Pig p_napoleon = new Pig("Napoleon");
		Pig p_emil = new Pig("Emil");		
		Cow c_siglinde = new Cow("Siglinde");
		Cow c_gertrude = new Cow("Gertrude");
		
		max.setFarm(my_farm);
		my_farm.setBarn(b);

/*****************************************************************************		
//	
//		Milking, opening, closing the door with a key
//		
//#############################################################################		
		
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
*/		
		System.out.println();
		System.out.println("\tEnd of program");
		System.out.println();
	}
}
