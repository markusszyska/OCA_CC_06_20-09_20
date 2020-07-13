package ml.assmann.bauernhof;


import ml.assmann.bauernhof.fauna.Kuh;
import ml.assmann.bauernhof.objekte.Eimer;
import ml.assmann.bauernhof.objekte.Schluessel;
import ml.assmann.bauernhof.objekte.Stall;
import ml.assmann.bauernhof.personen.Bauer;

public class BauernhofMain {
	public static void main(String[] args) {
		
		/*
		 * Variablen
		 */
		Stall stall1 = new Stall();
		Eimer eimer = new Eimer(0,10);
		Kuh kuh1 = new Kuh("Berta", 20);
		Schluessel falscherSchluessel = new Schluessel();
		
		// Bauer mit Stallschluessel
		Bauer bauer = new Bauer("Ruediger", 80, 180, 40, stall1.getTuer().getSchluessel());
		// Bauern ohne Stallschluessel
		Bauer bauer2 = new Bauer("Herbert", 75, 170, 55);
		Bauer bauer3 = new Bauer("Heinz", 70, 165, 80);
		Bauer bauer4 = new Bauer("Harry", 100, 190, 30);
		
		// Infoausgabe ueber Bauern
		System.out.println();
		System.out.println(bauer);
		System.out.println(bauer2);
		System.out.println(bauer3);
		System.out.println(bauer4);
	
		// bauer2 nimmt sich den Stallschluessel
		bauer2.nimmSchluesselZuStall(stall1);
		
		// bauer3 bekommt einen falschen Schluessel
		bauer3.bekommeSchluessel(falscherSchluessel);
		
		// Alle drei bauern versuchen den Stall zu betreten
		bauer.betrittStall(stall1);		
		bauer2.betrittStall(stall1);		
		bauer3.betrittStall(stall1);
		bauer4.betrittStall(stall1);
		
		
		// Die Kuh wird nun dreimal gemolken
		System.out.println();
		System.out.println("====== Vor dem 1. Melken ========");
		System.out.println(eimer);
		System.out.println(kuh1);
		
		bauer.melken(15, kuh1, eimer);
		
		System.out.println();
		System.out.println("====== Nach dem 1. Melken ========");
		System.out.println(eimer);
		System.out.println(kuh1);
		
		bauer.melken(10, kuh1, eimer);
		
		System.out.println();
		System.out.println("====== Nach dem 2. Melken ========");
		System.out.println(eimer);
		System.out.println(kuh1);
		
		bauer.melken(10, kuh1, eimer);
		
		System.out.println();
		System.out.println("====== Nach dem 3. Melken ========");
		System.out.println(eimer);
		System.out.println(kuh1);
		
		
		// Die Bauern verlassen den Stall
		System.out.println();
		bauer4.verlaesstStall(stall1);
		bauer.verlaesstStall(stall1);
		bauer2.verlaesstStall(stall1);
		bauer3.verlaesstStall(stall1);
		
	}
}
