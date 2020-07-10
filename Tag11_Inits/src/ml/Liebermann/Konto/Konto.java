package ml.Liebermann.Konto;

public class Konto {
	private Person person = new Person();
	private double kontostand;

	public Konto(String name, String vorname, float kontostand) {
		this.person.setVorname(vorname);
		this.person.setName(name);
		this.setKontostand(kontostand);
	}
	
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double value) {
		this.kontostand = value;
	}
	public String getName() {
		return this.person.toString();
		
	}
}
