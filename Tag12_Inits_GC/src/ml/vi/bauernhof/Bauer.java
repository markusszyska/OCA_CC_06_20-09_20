package ml.vi.bauernhof;

public class Bauer {

	private String name;
	private double gewicht;
	private double groesse;
	private int alter;

	public Bauer() {
		this("Manuel", 83.3, 1.9, 34);
	}

	public Bauer(String name, double gewicht, double groesse, int alter) {
		this.name = name;
		this.gewicht = gewicht;
		this.groesse = groesse;
		this.alter = alter;
	}

	@Override
	public String toString() {
		return "Bauer [name=" + name + ", gewicht=" + gewicht + ", groesse=" + groesse + ", alter=" + alter + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public void melken(Eimer a, Kuh moo) {
				
		double eimer_inhalt = a.getFuellmenge();
		double milch = moo.getMilchmenge();
		moo.wirdGemolken();
		milch -= moo.getMilchmenge();		
		eimer_inhalt += milch;
		a.setFuellmenge(eimer_inhalt);		
		
	}
	
}