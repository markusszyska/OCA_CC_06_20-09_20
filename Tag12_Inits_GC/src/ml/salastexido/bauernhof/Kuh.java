package ml.salastexido.bauernhof;

public class Kuh {
	private String name;
	private String hauptfarbe;
	private String fleckenfarbe;
	private int milchmenge;
	private int gewicht;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHauptfarbe() {
		return hauptfarbe;
	}

	public void setHauptfarbe(String hauptfarbe) {
		this.hauptfarbe = hauptfarbe;
	}

	public String getFleckenfarbe() {
		return fleckenfarbe;
	}

	public void setFleckenfarbe(String fleckenfarbe) {
		this.fleckenfarbe = fleckenfarbe;
	}

	public int getMilchmenge() {
		return milchmenge;
	}

	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public Kuh(String name, String hauptfarbe, String fleckenfarbe, int milchmenge, int gewicht) {
		this.name = name;
		this.hauptfarbe = hauptfarbe;
		this.fleckenfarbe = fleckenfarbe;
		this.milchmenge = milchmenge;
		this.gewicht = gewicht;
	}

	public int laufen() {
		return (this.gewicht >= 0) ? this.gewicht-- : this.gewicht;
	}

	public int freseen() {
		int threshold = 250;
		return (this.gewicht <= threshold) ? this.gewicht++ : this.gewicht;
	}

	public int wirdGemolken() {
		return (this.milchmenge > 0) ? --this.milchmenge : this.milchmenge;
	}
	

}
