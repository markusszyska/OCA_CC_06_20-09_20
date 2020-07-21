package bauernhof.fauna;

public class Kuh extends Nutztier{
	private int milchmenge;

	public int getMilchmenge() {
		return milchmenge;
	}

	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	}
	
	public Kuh() {
		this("Standardname", 0, 0, 0, 0);
	}
	public Kuh(String name, int gewicht, int alter, int preis, int milchmenge) {
		super(name, gewicht,alter,preis);
		this.setMilchmenge(milchmenge);
	}
	@Override
	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nMilchmenge: " + this.getMilchmenge();
		return ausgabe;
	}
}
