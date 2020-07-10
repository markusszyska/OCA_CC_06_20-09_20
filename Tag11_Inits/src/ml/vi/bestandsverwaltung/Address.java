package ml.vi.bestandsverwaltung;

public class Address {

	private String vorname = "Max";
	private String nachname = "Mustermann";
	private String strasse = "Maxistrasse";
	private int hausnummer = 1;
	private int plz = 123456;
	private String ort = "München";

	
	public Address() {
	}
	
	public Address(String vorname, String nachname, String strasse, int hausnummer, int plz, String ort) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setStrasse(strasse);
		this.setHausnummer(hausnummer);
		this.setPlz(plz);
		this.setOrt(ort);
	}

	public void printAddress() {
		System.out.printf("<%s><%s><%s><%d><%d><%s>\n", vorname, nachname, strasse, hausnummer, plz, ort);
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

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

}
