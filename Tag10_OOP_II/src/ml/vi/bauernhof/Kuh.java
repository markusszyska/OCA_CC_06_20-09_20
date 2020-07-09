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

	public void laufen() {
		if (this.gewicht > 0.1)
			this.gewicht -= 0.1;
	}

	public void fressen() {
		if (this.gewicht < max_gewicht)
			this.gewicht += 0.2;
	}

	public void melken() {
		if (this.milchmenge > 0.1)
			this.milchmenge -= 0.1;
	}
}
