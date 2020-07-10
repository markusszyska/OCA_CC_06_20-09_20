package ml.salastexido;

public class TriangleTest {
	public static void main(String[] args) {
		/**
		 * Triangle Tasks
		 *   -distance(p1,p2);
		 *   -perimeter(p1,p2,p3);
		 * **/
		Triangle t1 = new Triangle(new Point(4.55,10.40),new Point(22.30,55.30), new Point(78.60,4.40));
		System.out.println("The Perimeter of the Triangle is = " + t1.perimeter(t1.getP1(), t1.getP2(), t1.getP3()));
		System.out.println("The Distance of the Point p1 and Point p2 is = " + t1.distance(t1.getP2(),t1.getP3()));
		
	}
}
