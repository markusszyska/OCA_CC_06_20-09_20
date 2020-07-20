package bauernhof;

public class Bauer extends Saeugetier {

	private double kontostand;

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	/*
	 * Der Konstruktor der Elternklasse wird immer implizit aufgerufen Sollte die
	 * Elternklasse keinen default Konstruktor haben, muss der parametrisierte der
	 * Elternklasse aufgerufen werden.
	 */
	public Bauer() {
		super("Standardname", 100, 0);
		this.setKontostand(1000);
	}

	public Bauer(String name, int gewicht, int alter, double kontostand) {
		super(name, gewicht, alter);
		this.setKontostand(kontostand);
	}

	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nKontostand: " + this.getKontostand();
		return ausgabe;
	}

	public void tiereFuettern() {
		System.out.println("Bauer fuettert Tiere");
	}

//	public void gassiGehen(Schwein s) {
//
//	}
//	public void gassiGehen(Kuh k) {
//
//	}
	public void gassiGehen(Nutztier k) {
		k.bewegen();
	}
}
