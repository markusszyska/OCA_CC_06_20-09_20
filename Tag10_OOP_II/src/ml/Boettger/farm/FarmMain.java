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

a) laufen sollte das Gewicht verringern, aber nicht unter 0 fallen duerfen

b) fressen sollte das Gewicht erhoehen, aber nicht ueber ein bestimmtes Gewicht

c) Eine Methode für die Milchmenge - melken

d) Milchmenge sollte nicht im Negativenbereich abfallen koennen

############################################################################

Meine Interpretation: 

- 12 km ~ Abnahme von 200 g, 
- Mastgewicht: 700 kg, 
- Zunahme durch Fressen pro Tag 1 kg
- 300 ml Restmilch
- 30 L Milch pro Tag

 */

package ml.Boettger.farm;

import java.util.Scanner;

public class FarmMain {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("\t\tTHE LIFE OF COWS");
		System.out.println("\t===============================================");
		System.out.println();
		FarmMain.pause();

		// standard cows
		System.out.println("\t2 Standard default cows c1 and c2");
		System.out.println();
		Cow c1 = new Cow();
		Cow c2 = new Cow();
		FarmMain.pause();
		
		// FarmMain fm = new FarmMain();
	
		// special cows		
		Cow c_Frieda = 
				new Cow("Frieda", 17, 500.00f, 330.3f, "white", "black");
		FarmMain.pause();	

		Cow c_Christa = 
				new Cow("Christa", 20, 600.00f, 228.2f, "white", "brown");
		FarmMain.pause();
		
		System.out.println();
		while (c_Christa.milking(30.00f) > 0.00f)
			;
		System.out.println("\t" + c_Christa.s_name + " after end of milking.");
		FarmMain.pause();

		System.out.println();
		while (c_Christa.eat(1) && c_Christa.run(20.0f))
			;
		FarmMain.pause();
		
		System.out.println();
		while (c_Frieda.run(30.00f))
			;
		FarmMain.pause();
		
		sc.close();
	}
	
	public static void pause()
	{
		System.out.println();
	    System.out.println("\tPress Any Key To Continue...");
	    FarmMain.sc.nextLine();	    
	}    
}
