package bauernhof.fauna;

public class Nutztier extends Saeugetier{
	private int preis;

	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	public Nutztier() {
		this("Standardname", 0, 0, 0);
	}
	public Nutztier(String name, int gewicht, int alter, int preis) {
		super(name, gewicht, alter);
		this.setPreis(preis);
	}
	@Override
	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nPreis: " + this.getPreis();
		return ausgabe;
	}
}
