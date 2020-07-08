package oop_I.datenkapselung.data;

public class Teilnehmer {
	//Attribute
	public String name;
	public String vorname;
	public int raum;
	
	//Konstruktoren
	/*
	 * default Konstruktor
	 * (parameterloser Konstruktor)
	 */
	public Teilnehmer() {
		this("Standardvorname"); //this() mit Klammer
//		this.vorname = "Standardvorname"; //this ohne Klammer
//		this.name = "Standardname";
//		this.raum = 100;		
	}
	/*
	 * weitere Konstruktoren
	 */
	public Teilnehmer(String vorname) {
		this(vorname, "Standardnachname");
//		this.vorname = vorname;
//		this.name = "Standardname";
//		this.raum = 100;
	}
	public Teilnehmer(String vorname, String name) {
		this(vorname, name, 100);
//		this.vorname = vorname;
//		this.name = name;
//		this.raum = 100;
	}
	/*
	 * Voll parametrisierten Konstruktor
	 */
	public Teilnehmer(String vorname, String name, int raum) {
		this.vorname = vorname;
		this.name = name;
		this.raum = raum;
	}
	//Methoden
	public void raumzuweisen(int raumnummer) {
		this.raum = raumnummer;
	}
}
