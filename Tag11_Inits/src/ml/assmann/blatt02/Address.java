package ml.assmann.blatt02;

public class Address {
	
	/*
	 *  Attribute
	 */
	private String vorname;
	private String nachname ;
	private String strassenname;
	private int hausnummer;
	private int postleitzahl;
	private String ortsname;
	
	/*
	 * Getter/Setter
	 */
	
	// Vorname
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	// Nachname
	public String getNachname() {
		return this.nachname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	// Strassenname
	public String getStrassenname() {
		return this.strassenname;
	}
	
	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}
	
	// Hausnummer
	public int getHausnummer() {
		return this.hausnummer;
	}
	
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	// Postleitzahl
	public int getPostleitzahl() {
		return this.postleitzahl;
	}
	
	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	
	// Ortsname
	public String getOrtsname() {
		return this.ortsname;
	}
	
	public void setOrtsname(String ortsname) {
		this.ortsname = ortsname;
	}
	
	/*
	 * Konstruktoren
	 */
	
	// Default
	public Address() {
		this.setVorname("Standardvorname");
		this.setNachname("Standardnachname");
		this.setStrassenname("Standardstrasse");
		this.setHausnummer(99);
		this.setPostleitzahl(99999);
		this.setOrtsname("Standardort");
	}
	
	// Voll
	public Address(String vorname, String nachname, String strassenname, int hausnummer, int postleitzahl, String ortsname) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setStrassenname(strassenname);
		this.setHausnummer(hausnummer);
		this.setPostleitzahl(postleitzahl);
		this.setOrtsname(ortsname);
	}
	
	/*
	 * Methoden
	 */
	public void printAddress() {
		String ausgabe = this.getVorname() + " " + this.getNachname() + ", " + this.getStrassenname() 
			+ " " + this.getHausnummer() + ", " + this.getPostleitzahl() + " " + this.getOrtsname();
		System.out.println(ausgabe);		
	}
	
	
	
	
	
}
