package ml.assmann.bauernhof;


import ml.assmann.bauernhof.fauna.*;
import ml.assmann.bauernhof.flora.*;
import ml.assmann.bauernhof.objekte.*;
import ml.assmann.bauernhof.personen.Bauer;

public class BauernhofMain {
	public static void main(String[] args) {
		
		/*
		 * Variablen
		 */
		
		// Kuehe
		Kuh kuh1 = new Kuh("Berta", 700, 1000);
		Kuh kuh2 = new Kuh("Rosa", 800, 2000);
		Kuh kuh3 = new Kuh("Molli", 900, 3000);
		
		// Schweine
		Schwein schwein1 = new Schwein("Bernd", 500, 1000);
		Schwein schwein2 = new Schwein("Holger", 750, 2000);
		Schwein schwein3 = new Schwein("Heinz", 800, 3000);
		Schwein schwein4 = new Schwein("Schwein4", 100, 1);
		Schwein schwein5 = new Schwein("Schwein5", 100, 1);
		Schwein schwein6 = new Schwein("Schwein6", 100, 1);
		Schwein schwein7 = new Schwein("Schwein7", 100, 1);
		Schwein schwein8 = new Schwein("Schwein8", 100, 1);
		Schwein schwein9 = new Schwein("Schwein9", 100, 1);
		Schwein schwein10 = new Schwein("Schwein10", 100, 1);
		Schwein schwein11 = new Schwein("Schwein11", 100, 1);
		Schwein schwein12 = new Schwein("Schwein12", 100, 1);
		Schwein schwein13 = new Schwein("Schwein13", 100, 1);
		
		// Kartoffeln
		Kartoffel kartoffel1 = new Kartoffel(10);
		Kartoffel kartoffel2 = new Kartoffel(20);
		Kartoffel kartoffel3 = new Kartoffel(30);
		Kartoffel kartoffel4 = new Kartoffel(40);
		
		// Karotten
		Karotte karotte1 = new Karotte(10);
		Karotte karotte2 = new Karotte(20);
		Karotte karotte3 = new Karotte(30);
		Karotte karotte4 = new Karotte(40);
		
		// Bauer
		Bauer bauer = new Bauer("Ruediger", 80, 180, 40);
		
		// Infoausgabe ueber Bauern
		System.out.println();
		System.out.println(bauer);		
		
		// Fuetterungstests
		System.out.println("\n=======Fuetterungstests=========");
		bauer.fuettereKuhMitKarotte(kuh1, karotte1);
		bauer.fuettereKuhMitKarotte(kuh2, karotte4);
		bauer.fuettereKuhMitKartoffel(kuh3, kartoffel3);
		
		bauer.fuettereSchweinMitKarotte(schwein1, karotte1);
		bauer.fuettereSchweinMitKarotte(schwein2, karotte4);
		bauer.fuettereSchweinMitKartoffel(schwein3, kartoffel3);
				
		// Kuehe in den Stall stellen
		if(bauer.addKuhToStall(kuh1)) kuh1 = null;
		if(bauer.addKuhToStall(kuh2)) kuh2 = null;
		if(bauer.addKuhToStall(kuh3)) kuh3 = null;
		
		
		// Schweine in den Stall stellen
		if(bauer.addSchweinToStall(schwein1)) schwein1 = null;
		if(bauer.addSchweinToStall(schwein2)) schwein2 = null;
		if(bauer.addSchweinToStall(schwein3)) schwein3 = null;
		if(bauer.addSchweinToStall(schwein4)) schwein4 = null;
		if(bauer.addSchweinToStall(schwein5)) schwein5 = null;
		if(bauer.addSchweinToStall(schwein6)) schwein6 = null;
		if(bauer.addSchweinToStall(schwein7)) schwein7 = null;
		if(bauer.addSchweinToStall(schwein8)) schwein8 = null;
		if(bauer.addSchweinToStall(schwein9)) schwein9 = null;
		if(bauer.addSchweinToStall(schwein10)) schwein10 = null;
		if(bauer.addSchweinToStall(schwein11)) schwein11 = null;
		if(bauer.addSchweinToStall(schwein12)) schwein12 = null;
		if(bauer.addSchweinToStall(schwein13)) schwein13 = null;

		// Bauer holt sich nen neuen Futtereimer
		Eimer eimer = new Eimer(4,4); // zu wenig
		Eimer eimer2 = new Eimer(); // zu viel
		Eimer eimer3 = new Eimer(3,10); //genau richtige Menge
		
		// Fuetterungszeit
		System.out.println("\n=======Alle Tiere fuettern=========");
		bauer.alleTiereFuettern(eimer3);		
		
		// Verkaufe Kuehe
		System.out.println("\n=======Verkaufen=========");
		bauer.verkaufeKuh("Molli");
		bauer.verkaufeKuh("Anna");
		bauer.verkaufeKuh("Berta");
		bauer.verkaufeSchwein("Harry");
		bauer.verkaufeSchwein("Heinz");
		bauer.verkaufeSchwein("Bernd");
		bauer.verkaufeSchwein("Schwein8");
		bauer.verkaufeSchwein("Schwein9");
		bauer.verkaufeSchwein("Schwein10");

		// Zeige Kontostand
		System.out.println("\nKontostand von " + bauer.getName() + ": " + bauer.getKontostand() + " €");
		
		// Fuege neue Schweine hinzu
		if(bauer.addSchweinToStall(schwein11)) schwein11 = null;
		if(bauer.addSchweinToStall(schwein12)) schwein12 = null;
		if(bauer.addSchweinToStall(schwein13)) schwein13 = null;
		
		// Fuetterungszeit
		System.out.println("\n=======Alle Tiere fuettern #2=========");
		bauer.alleTiereFuettern(eimer2);
				
	}
}
