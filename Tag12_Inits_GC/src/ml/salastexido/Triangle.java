package ml.salastexido;

public class Triangle {
	
	private Point p1;
	private Point p2;
	private Point p3;
	
	
	public Triangle(Point p1, Point p2, Point p3) {
		System.out.println("Dreick wird erzeugt aus 3 Eckpunkten...");
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public double perimeter(Point x, Point y, Point z) {
		return distance(x, y)+distance(y,z)+distance(z,x);
	}
	
	public double distance(Point x, Point y) {
		return Math.sqrt(Math.pow(y.getY()-x.getY(), 2)+Math.pow(y.getX()-x.getX(), 2));
	}
	
}
