package ml.Boettger.vererbung_aufgabe_11_1;

import java.util.*;

class Fahrzeug{
	private float preis;
	private String herstellerName;
	protected static Scanner scanner = new Scanner (System.in);
	
	//#########################################################################
	public Fahrzeug()
	//
	//	constructor fahrzeug, Basisklasse
	//
	//#########################################################################
	{
		System.out.print("\n\tGeben Sie den Herstellernamen ein: ");
		herstellerName = scanner.next();
		System.out.print("\tGeben Sie den Preis ein (z. B. 5999,00): ");
		try
		{
			preis = scanner.nextFloat();
		}
		catch (InputMismatchException e)
		{
			System.out.println ("\tKeine gueltige Preisangabe!");
			System.exit(1);
		}
	}
	
	//#########################################################################
	public void print()
	//#########################################################################
	{
		System.out.println();
		System.out.println("\tHerstellername    : " + herstellerName);
		System.out.println("\tPreis             : " + preis);
	}

	//#########################################################################
	public float getPreis() 
	//
	// a) Schreiben Sie die Methode getPreis() der Klasse Fahrzeug.
	//
	//#########################################################################
	{
		return preis;
	}
}