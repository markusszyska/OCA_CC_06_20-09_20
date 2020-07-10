package ml.schulzke;

public class Dreieck{
public Dreieck(){
	System.out.println ("Dreieck wird erzeugt aus 3 Eckpunkten");
	Punkt p1 = new Punkt();
	Punkt p2 = new Punkt();
	Punkt p3 = new Punkt();

	}
	public double entfernung(Punkt a, Punkt b) {
		//((X1-X2)²) + ((Y1+Y2)²) > Wurzel = Entfernung
		return Math.sqrt(((a.getX()-b.getX())*(a.getX()-b.getX()))+((a.getY()-b.getY())*(a.getY()-b.getY())));
	}
	public double umfang(Punkt a, Punkt b, Punkt c) {
		//((X1-X2)²) + ((Y1+Y2)²) > Wurzel = Entfernung
		return entfernung(a,b)+entfernung(b,c)+entfernung(c,a);
	}
}