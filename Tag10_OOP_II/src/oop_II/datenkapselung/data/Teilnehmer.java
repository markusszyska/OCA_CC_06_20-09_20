package oop_II.datenkapselung.data;

public class Teilnehmer {

	// Attribute
	private String name;
	private String vorname;
	private int raum;
	private boolean ematrikuliert;

	// Getter/Setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getRaum() {
		return this.raum;
	}

	public void setRaum(int raum) {
		if (raum < 0) {
			System.out.println("Raum 0 eingetragen");
			this.raum = 0;
		} else {
			this.raum = raum;
		}
	}

	public boolean isEmatrikuliert() {
		return this.ematrikuliert;
	}

	public void setEmatrikuliert(boolean ematrikuliert) {
		this.ematrikuliert = ematrikuliert;
	}

	// Konstruktoren
	/*
	 * default Konstruktor (parameterloser Konstruktor)
	 */
	public Teilnehmer() {
		this("Standardvorname"); // this() mit Klammer	
	}

	/*
	 * weitere Konstruktoren
	 */
	public Teilnehmer(String vorname) {
		this(vorname, "Standardnachname");
	}

	public Teilnehmer(String vorname, String name) {
		this(vorname, name, 100);
	}

	/*
	 * Voll parametrisierten Konstruktor
	 */
	public Teilnehmer(String vorname, String name, int raum) {
		this.setVorname(vorname);
		this.setName(name);
		this.setRaum(raum);
	}

	// Methoden
	public void raumzuweisen(int raumnummer) {
		this.setRaum(raumnummer);
	}
	
	//Standardmethoden
	public String toString() {
		String ausgabe = "";
		ausgabe += "Vorname: " + getVorname(); // In dem Fall kann this weggelassen werden
		ausgabe += "\nName: " + this.getName();
		ausgabe += "\nRaum: " + this.getRaum();
		return ausgabe;
	}
	
	
	

}
