package ml.vi.kontovergleich;

public class Konto {

	private Person person;
	private double kontostand;

	public Konto(String name, String vorname, float kontostand) {

		this.person = new Person();
		this.setName(name);
		this.setVorname(vorname);
		this.setKontostand(kontostand);

	}

	public String getName() {
		return this.person.getName();
	}

	public void setName(String name) {
		this.person.setName(name);
	}

	public String getVorname() {
		return this.person.getVorname();
	}

	public void setVorname(String vorname) {
		this.person.setVorname(vorname);
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

}