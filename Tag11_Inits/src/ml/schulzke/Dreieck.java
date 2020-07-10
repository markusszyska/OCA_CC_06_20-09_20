package ml.schulzke;

public class Dreieck {
	private Punkt p1 = new Punkt();
	private Punkt p2 = new Punkt();
	private Punkt p3 = new Punkt();

	public Punkt getP1() {
		return p1;
	}

	public void setP1(Punkt p1) {
		this.p1 = p1;
	}

	public Punkt getP2() {
		return p2;
	}

	public void setP2(Punkt p2) {
		this.p2 = p2;
	}

	public Punkt getP3() {
		return p3;
	}

	public void setP3(Punkt p3) {
		this.p3 = p3;
	}

	public Dreieck() {
		System.out.println("Dreieck wird erzeugt aus 3 Eckpunkten");
		Punkt p1 = new Punkt();
		Punkt p2 = new Punkt();
		Punkt p3 = new Punkt();
	}

	public double entfernung(Punkt a, Punkt b) {
		// ((X1-X2)²) + ((Y1+Y2)²) > Wurzel = Entfernung
		return Math.sqrt(
				((a.getX() - b.getX()) * (a.getX() - b.getX())) + ((a.getY() - b.getY()) * (a.getY() - b.getY())));
	}

	public double umfang(Punkt a, Punkt b, Punkt c) {
		// ((X1-X2)²) + ((Y1+Y2)²) > Wurzel = Entfernung
		return entfernung(a, b) + entfernung(b, c) + entfernung(c, a);
	}

	public double umfang() {
		// ((X1-X2)²) + ((Y1+Y2)²) > Wurzel = Entfernung
		return entfernung(this.p1, this.p2) + entfernung(this.p2, p3) + entfernung(p1, p3);
	}
}