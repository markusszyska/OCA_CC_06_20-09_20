package ml.neumann.bauernhof;

import ml.neumann.bauernhof.fauna.Bauer;
import ml.neumann.bauernhof.gebaeude.Stall;

public class BauernhofMain {

	public static void main(String[] args) {
		
		/*
		 * Aus der Main methode werden die anderen Methoden gestarten. 
		 *  
		 *zuerst muss man alle Objekte erstellen, damit diese dann miteinander agieren
		 * 
		 */
//Objekt Bauer erstellen 
		Bauer ba1= new Bauer();
		System.out.println(ba1.getName());		
// Objekt Bauernhof erstellen
		
	 Bauernhof b1= new Bauernhof( ); 
		
System.out.println(b1.bauernhofname);




}

	
	
}
