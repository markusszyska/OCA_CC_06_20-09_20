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
	final public static boolean TESTMODE = false;	// testmode true/false
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
		Potato p = new Potato();
		Carrot c = new Carrot();

		// 11 pigs
		Pig p_napoleon = new Pig("Napoleon", 350.00f, 18, 500.00f);	// 1
		Pig p_emil = new Pig("Emil");								// 2
		Pig p_johannes = new Pig("Johannes");						// 3
		Pig p_siegfried = new Pig("Siegfried");						// 4
		Pig p_manfred = new Pig("Manfred");							// 5
		Pig p_richard = new Pig("Richard");							// 6
		Pig p_bert = new Pig("Bert");								// 7
		Pig p_friedhelm = new Pig("Friedhelm");						// 8
		Pig p_carsten = new Pig("Carsten");							// 9	
		Pig p_snowball = new Pig("Snowball");						// 10
		Pig p_reiner = new Pig("Reiner");							// 11

		// 11 cows
		Cow c_siglinde = new Cow("Siglinde");						// 1
		Cow c_gertrude = new Cow("Gertrude");						// 2
		Cow c_martha = new Cow("Martha");							// 3
		Cow c_gerda = new Cow("Gerda");								// 4
		Cow c_berta = new Cow("Berta");								// 5
		Cow c_rita = new Cow("Rita");								// 6
		Cow c_eva = new Cow("Eva");									// 7
		Cow c_ute = new Cow("Ute");									// 8
		Cow c_elma = new Cow("Elma");								// 9	
		Cow c_frieda = new Cow("Frieda");							// 10
		Cow c_jutta = new Cow("Jutta");								// 11
				
		max.setFarm(my_farm);
		my_farm.setBarn(b);
		
		System.out.println(
			"\ttask 1, 2, 3: placing pigs and cows in the stables.\n");	

		b.pigs_in_the_barn();			
	
		// place pigs in the barn
		max.getFarm().getBarn().place_in_the_barn(
			p_emil, p_napoleon, p_johannes, p_siegfried, p_manfred, p_richard,	
			p_bert, p_friedhelm, p_carsten, p_snowball, p_reiner);	

		b.pigs_in_the_barn();
		FarmMain.pause();
		
		b.cows_in_the_barn();
		
		// place cows in the barn
		max.getFarm().getBarn().place_in_the_barn(
			c_siglinde, c_gertrude, c_martha, c_gerda, c_berta, c_rita, c_eva,	
		    c_ute, c_elma, c_frieda, c_jutta);	
		
		b.cows_in_the_barn();
		FarmMain.pause();
		
		System.out.println(
			"\ttask 4, 5: selling pigs and cows.\n");	
		
		b.pigs_in_the_barn();
		FarmMain.pause();
		
		max.setBank_balance(max.getBank_balance() + 
			max.getFarm().getBarn().sell("Napoleon", true));
		System.out.println("\tThe farmers bank balance is: " + 
			max.getBank_balance() + " EURO.");
		
		max.setBank_balance(max.getBank_balance() + 
				max.getFarm().getBarn().sell("Napoleon", true));
		System.out.println("\tThe farmers bank balance is: " + 
				max.getBank_balance() + " EURO.");
		
		b.pigs_in_the_barn();
		FarmMain.pause();

		b.cows_in_the_barn();
		FarmMain.pause();

		max.setBank_balance(max.getBank_balance() + 
				max.getFarm().getBarn().sell("Elma", false));
		System.out.println("\tThe farmers bank balance is: " + 
				max.getBank_balance() + " EURO.");

		max.setBank_balance(max.getBank_balance() + 
				max.getFarm().getBarn().sell("Jutta", false));
		System.out.println("\tThe farmers bank balance is: " + 
				max.getBank_balance() + " EURO.");
		
		b.cows_in_the_barn();
		FarmMain.pause();
		
		System.out.println(
			"\ttask 6: feeding pigs and cows with one potato or carrot.\n"); 
		
		// feed pigs
		max.getFarm().getBarn().feed("Siegfried", true, true, c, p);
		
		max.getFarm().getBarn().feed(
				"Siegfried", true, false, null, new Potato());
		
		max.getFarm().getBarn().feed(
				"Napoleon", true, true, new Carrot(), null);
		FarmMain.pause();

		// feed cows
		max.getFarm().getBarn().feed(
				"Berta", false, true, new Carrot(), null);
		
		max.getFarm().getBarn().feed(
				"Berta", false, false, null, new Potato());
		
		max.getFarm().getBarn().feed(
				"Jutta", false, false, null, new Potato());
		FarmMain.pause();
		
		System.out.println("The bonus task had still not been done!");		
		
		System.out.println();
		System.out.println("\tEnd of program");
		System.out.println();
	}
}
