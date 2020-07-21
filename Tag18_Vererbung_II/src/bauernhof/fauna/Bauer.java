package bauernhof.fauna;

public class Bauer extends Saeugetier {
	private int kontostand;
	
	public int getKontostand() {
		return kontostand;
	}

	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}
	public Bauer() {
		this("Standardname", 0, 0, false, 0);
	}

	public Bauer(String name, int gewicht, int alter, boolean maennlich, int kontostand) {
		super(name, gewicht, alter);
		this.setKontostand(kontostand);
	}
	@Override
	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nKontostand: " + this.getKontostand();
		return ausgabe;
	}
}
