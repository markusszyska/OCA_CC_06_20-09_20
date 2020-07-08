package oop_I.datenkapselung;

import oop_I.datenkapselung.data.Teilnehmer;

public class Verwaltung {
	public static void main(String[] args) {
		Teilnehmer tn1 = new Teilnehmer();
		System.out.println(tn1.name);
		System.out.println(tn1.vorname);
		System.out.println(tn1.raum);
		
		tn1.name = "Mustermann";
		tn1.vorname = "Max";
		
		Teilnehmer tn2 = new Teilnehmer("Markus");
		Teilnehmer tn3 = new Teilnehmer("Markus", "Szyska");
		Teilnehmer tn4 = new Teilnehmer("Markus", "Szyska", 500);
		System.out.println("--------------------");
		System.out.println("tn2 Vorname: " + tn2.vorname);
		System.out.println("tn2 Nachname: " + tn2.name);
		System.out.println("tn2 Raum: " + tn2.raum);
		
		System.out.println("--------------------");
		System.out.println("tn3 Vorname: " + tn3.vorname);
		System.out.println("tn3 Nachname: " + tn3.name);
		System.out.println("tn3 Raum: " + tn3.raum);
		
		System.out.println("--------------------");
		System.out.println("tn4 Vorname: " + tn4.vorname);
		System.out.println("tn4 Nachname: " + tn4.name);
		System.out.println("tn4 Raum: " + tn4.raum);
		
		Teilnehmer tn5 = erzeugeTeilnehmer();
		
		
	}
	
	public static Teilnehmer erzeugeTeilnehmer() {
		return new Teilnehmer();
	}
	
	
}
