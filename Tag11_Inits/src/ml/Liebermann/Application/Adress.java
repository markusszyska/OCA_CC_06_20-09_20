package ml.Liebermann.Application;

public class Adress {
	private String vorname;
	private String nachname;
	private String strasse;
	private String hausnummer;
	private int postleitzahl;
	private String ort;
	
	
	
	public Adress(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setStrasse(strasse);
		this.setHausnummer(hausnummer);
		this.setPostleitzahl(postleitzahl);
		this.setOrt(ort);
		
	}
	
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public int getPostleitzahl() {
		return postleitzahl;
	}
	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public void printAdress() {
		System.out.println(this.toString() + "\n") ;
		
	}
	public String toString() {
		return this.vorname + "\n" + this.nachname + "\n" + this.strasse + " " + this.hausnummer + "\n" + this.postleitzahl + " " + this.ort;
		
	}

}
