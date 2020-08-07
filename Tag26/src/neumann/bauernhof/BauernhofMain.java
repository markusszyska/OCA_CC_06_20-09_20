package neumann.bauernhof;

import neumann.bauernhof.pflanzen.IEssbar;
import neumann.bauernhof.pflanzen.Pflanzen;
import neumann.bauernhof.tiere.IkannFressen;
import neumann.bauernhof.tiere.nutztiere.Schwein;

public class BauernhofMain {
	public static void main(String[] args) {
		
	// Objekte 
	Schwein s1= new Schwein("Fridolin",0);
	Schwein s2= new Schwein("Piggeldy",50);
	Schwein s3= new Schwein("Gusti",100);
	
	Pflanzen p1= new Pflanzen("Sorte1", 19);
	Pflanzen p2= new Pflanzen("Sorte2", 5);
	
	// Test Anzahl Pflanzen 
	//pflanzenZaehlen();

	
	
	try {
	
	s1.fressen(p1);
	}catch (EssenIstWegException e) {
		System.out.println("... Fehlerbericht generieren ...");
	
	e.printStackTrace();
	
	System.out.println("... Fehlerbericht an Support gesendet ...");
	System.out.println("Beende Programm ...");
	System.exit(0);
	}
}}
