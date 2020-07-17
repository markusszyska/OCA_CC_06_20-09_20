package ml.vi.bauernhof;

public class Kuh {

	public String name;
	public String hautfarbe;
	public String fleckenfarbe;
	public double milchmenge;
	public double gewicht;
	public double max_gewicht = 1700;

	public Kuh() {
	}

	public Kuh(String name, String hautfarbe, String fleckenfarbe, double milchmenge, double gewicht) {
		this.name = name;
		this.hautfarbe = hautfarbe;
		this.fleckenfarbe = fleckenfarbe;
		this.milchmenge = milchmenge;
		this.gewicht = gewicht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHautfarbe() {
		return hautfarbe;
	}

	public void setHautfarbe(String hautfarbe) {
		this.hautfarbe = hautfarbe;
	}

	public String getFleckenfarbe() {
		return fleckenfarbe;
	}

	public void setFleckenfarbe(String fleckenfarbe) {
		this.fleckenfarbe = fleckenfarbe;
	}

	public double getMilchmenge() {
		return milchmenge;
	}

	public void setMilchmenge(double milchmenge) {
		this.milchmenge = milchmenge;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public double getMax_gewicht() {
		return max_gewicht;
	}

	public void setMax_gewicht(double max_gewicht) {
		this.max_gewicht = max_gewicht;
	}

	public void laufen() {
		if (this.gewicht > 0.1)
			this.gewicht -= 0.1;
	}

	public void fressen() {
		if (this.gewicht < max_gewicht)
			this.gewicht += 0.2;
	}

	public void wirdGemolken() {
		if (this.milchmenge > 0.1)
			this.milchmenge -= 0.1;
	}
}
