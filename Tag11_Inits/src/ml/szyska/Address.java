package ml.szyska;

public class Address {

	private String vorname = "Max";
	private String nachname = "Mustermann";
	private String strasse = "Hansaplatz";
	private String hausnummer = "232b";
	private int postleitzahl = 12345;
	private String ort = "Hamburg";
	
	public Address() {
	}
	public Address(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setStrasse(strasse);
		this.setHausnummer(hausnummer);
		this.setPostleitzahl(postleitzahl);
		this.setOrt(ort);
	}
	
	public void setVorname(String vorname) {
		this.vorname= vorname;
	}
	public String getVorname() {
		return this.vorname;
	}
	public void setNachname(String nachname) {
		this.nachname= nachname;
	}
	public String getNachname() {
		return this.nachname;
	}
	public void setStrasse(String strasse) {
		this.strasse= strasse;
	}
	public String getStrasse() {
		return this.strasse;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer= hausnummer;
	}
	public String getHausnummer() {
		return this.hausnummer;
	}
	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl= postleitzahl;
	}
	public int getPostleitzahl() {
		return this.postleitzahl;
	}
	public void setOrt(String ort) {
		this.ort= ort;
	}
	public String getOrt() {
		return this.ort;
	}

	public void printAddress() {
		
		System.out.println(
				this.getVorname()      + " " +
				this.getNachname()     + " " +
				this.getStrasse()      + " " +
				this.getHausnummer()   + " " +
				this.getPostleitzahl() + " " +
				this.getOrt()
		);
		
		
	}
}
