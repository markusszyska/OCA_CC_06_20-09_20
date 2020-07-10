package ml.assmann.blatt01.aufgabe02;

public class Konto {
	private Person person;
	private double kontostand;

	public Konto (String name, String vorname, float kontostand){
		this.person = new Person();
		this.person.setName(name);
		this.person.setVorname(vorname);
		this.kontostand = kontostand;
	}
	
	public String getName() {
		return this.person.getName();
	}
	
	public double getKontostand() {
		return this.kontostand;
	}
}
