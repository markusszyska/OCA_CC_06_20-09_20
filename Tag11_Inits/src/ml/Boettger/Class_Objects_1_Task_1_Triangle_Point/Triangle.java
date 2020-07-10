package ml.Boettger.Class_Objects_1_Task_1_Triangle_Point;

public class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Point getP1() 
	{
		return p1;
	}

	public void setP1(Point p1)
	{
		this.p1 = p1;
	}

	public Point getP2() 
	{
		return p2;
	}

	public void setP2(Point p2)
	{
		this.p2 = p2;
	}

	public Point getP3() 
	{
		return p3;
	}

	public void setP3(Point p3)
	{
		this.p3 = p3;
	}

	public Triangle()
	{
		System.out.println();		
		System.out.println ("\tTriangle is created from 3 corner points.\n");		
		p1 = new Point();
		p2 = new Point();
		p3 = new Point();		
		
		if (Test.isTestmode())
		{
			System.out.println("\tctor " + this.toString());			
		}	
	}
	
	public double distance (Point q1, Point q2)
	{
		return Math.sqrt ((q1.getX() - q2.getX()) *
		(q1.getX() - q2.getX()) +
		(q1.getY() - q2.getY()) *
		(q1.getY() - q2.getY()));
	}
	
	public double perimeter()
	{
		return (
			this.distance(this.getP1(), this.getP2()) +
			this.distance(this.getP2(), this.getP3()) +
			this.distance(this.getP3(), this.getP1()));
	}

	public String toString() {
		return 	
			"\t\tTriangle\n" +
			"\t--------------------------------------------------------\n" +
			"\tp1 = " + this.getP1() + "\n" +
			"\tp2 = " + this.getP2() + "\n" +
			"\tp3 = " + this.getP3() + "\n";				
	}
}

