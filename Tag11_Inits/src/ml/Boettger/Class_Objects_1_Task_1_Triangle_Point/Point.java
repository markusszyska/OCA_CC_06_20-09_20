package ml.Boettger.Class_Objects_1_Task_1_Triangle_Point;

import java.util.Scanner;

public class Point
{
	private double x;
	private double y;
	
	public double getX()
	{
		return this.x;
	}
	
	public void setX (double u)
	{
		this.x = u;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public void setY (double v)
	{
		this.y = v;
	}

	public Point()
	{
		Scanner scanner = new Scanner (System.in);
		
		String inputX;
		String inputY;
		
		System.out.print ("\tInput the x-value in cm (f.e. 4.4): ");
		inputX = scanner.next();
		System.out.print ("\tInput the y-value in cm (f.e. 1.0): ");
		inputY = scanner.next();
		
		try 
		{
			x = Double.valueOf (inputX);
			y = Double.valueOf (inputY);
		} 
		catch (NumberFormatException e) 
		{
			System.out.println (e.toString());
			System.exit (1);
		}
		
		System.out.println();
		
		if (Test.isTestmode())
		{
			System.out.println("\tctor " + this.toString());
		}		
	}

	public String toString() {
		return
			"\t\tPoint\n" +
			"\t-----------------------------------------------------------\n" +
			"\tx = " + this.getX() + "\n" +
			"\ty = " + this.getY() + "\n";
	}
}