package ml.schulzke;

import java.util.Scanner;
public class Punkt {
	private double x;
	private double y;
	public double getX(){
		return this.x;
	}
	public void setX (double u){
		this.x = u;
	}
	public double getY(){
		return this.y;
	}
	public void setY (double v){
		this.y = v;
	}
	public Punkt(){
		Scanner scanner = new Scanner (System.in);
		String eingabeX;
		String eingabeY;
		System.out.println ("Gib den x-Wert ein: ");
		eingabeX = scanner.next();
		System.out.println ("Gib den y-Wert ein: ");
		eingabeY = scanner.next();
		try {
			x = Double.valueOf (eingabeX);
			y = Double.valueOf (eingabeY);
			System.out.println (this.x+" und "+this.y);
		} catch (NumberFormatException e) {
			System.out.println (e.toString());
			System.exit (1);
		}
	}
}