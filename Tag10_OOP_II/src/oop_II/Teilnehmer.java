package oop_II;

public class Teilnehmer {
	//Diese Eigenschaften/Attribute koennen fuer alle Instanzen unterschiedlich sein
	public String name;
	public String vorname;
	public int raum;
	
	//Diese Eigenschaften sind fuer Instanzen gleich
	public static int anzahlTeilnehmer = 0;
	
	
	public static void main(String[] args) {
		
		Teilnehmer tn1 = new Teilnehmer();
		anzahlTeilnehmer++;
		Teilnehmer tn2 = new Teilnehmer();
		anzahlTeilnehmer++;
		
		
		tn1.name = "Mustermann";
		tn1.vorname = "Moritz";
		
		tn2.name = "Musterfrau";
		tn2.vorname = "Christa";
		
		tn1.raumzuweisen(500);
		tn2.raumzuweisen(1000);
		
		System.out.println(tn1.vorname + " " + tn1.name + ": Raum: " + tn1.raum);
		System.out.println(tn2.vorname + " " + tn2.name + ": Raum: " + tn2.raum);
		
		System.out.println("-----------------");
		System.out.println(tn1);
		System.out.println(tn2);
		System.out.println("(tn1 == tn2)" + (tn1 == tn2));
		System.out.println("------------------");
		
		System.out.println("tn1: " + tn1.name);
		System.out.println("tn2: " + tn2.name);
		
		tn1 = tn2;
		tn1.name = "Name geaendert";
		System.out.println("tn1: " + tn1.name);
		System.out.println("tn2: " + tn2.name);
		
		System.out.println("-----------------");
		System.out.println(tn1);
		System.out.println(tn2);
		System.out.println("(tn1 == tn2)" + (tn1 == tn2));
		System.out.println("------------------");
		
		System.out.println("Ohne Instanz aufgerufen");
		ermittleAnzahlTeilnehmer();
		//The static method ermittleAnzahlTeilnehmer() from the type Teilnehmer should be accessed in a static way
		tn1.ermittleAnzahlTeilnehmer();
		tn2.ermittleAnzahlTeilnehmer();
		
		
	}
	
	public void raumzuweisen(int raumnummer) {
		this.raum = raumnummer;
	}
	
	public static void ermittleAnzahlTeilnehmer() {
		System.out.println("Anzahlteilnehmer: " + anzahlTeilnehmer);
	}
}
