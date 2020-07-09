package ml.Liebermann;

public class Kuh {
	public String name;
	public String hautfarbe;
	public String fleckenfarbe;
	public double milchmenge;
	public double gewicht;

	public Kuh(String name, String hautfarbe, String fleckenfarbe, double milchmenge, double gewicht) {
		this.name = name;
		this.hautfarbe = hautfarbe;
		this.fleckenfarbe = fleckenfarbe;
		this.milchmenge = milchmenge;
		this.gewicht = gewicht;
	}

	public void laufen() {
		double minWeight = 100;
		if (this.gewicht > minWeight) {
			this.gewicht--;
		}
	}

	public void fressen() {
		double maxWeight = 160;
		if(this.gewicht  < maxWeight) {
			this.gewicht++;
		}
	}
	
	public void milchmelken() {
		double minValue = 0;
		if(this.milchmenge > minValue) {
			this.milchmenge--;
		}
	}
	
	public void milchmelken(double value) {
		double minValue = 0;
		if(this.milchmenge - value >= minValue) {
			this.milchmenge -= value;
		}
	}
}
