package ml.assmann.blatt01.aufgabe01;

public class Dreieck {
	private Punkt p1;
	private Punkt p2;
	private Punkt p3;

	public Dreieck(){   
		System.out.println ("Dreieck wird erzeugt aus 3 Eckpunkten");
		p1 = new Punkt();
		p2 = new Punkt();
		p3 = new Punkt(); 
	}

	public double entfernung(Punkt q1, Punkt q2) {
		return Math.sqrt(
				(q1.getX() - q2.getX()) * (q1.getX() - q2.getX()) + (q1.getY() - q2.getY()) * (q1.getY() - q2.getY()));
	}

	public double umfang() {
		double umfang = entfernung(this.p1, this.p2) + entfernung(this.p2, this.p3) + entfernung(this.p3, this.p1);
		return umfang;
	}
}
