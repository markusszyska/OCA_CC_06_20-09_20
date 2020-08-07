package zeitner.wiederholung;

import java.awt.Point;

public class BinHarmlos {
	public static void binHarmlos(int x) {
		System.out.println("Anfang.binHarmlos.x = " + x);
		x = 6;
		System.out.println("Ende.binHarmlos.x = " + x);
	}
	public static void binHarmlos(Point x) {
		System.out.println("Anfang.binHarmlos.x = " + x);
		x.setLocation(6, 6);
		//x = new Point(6,6);
		System.out.println("Ende.binHarmlos.x = " + x);
	}
	public static void binHarmlos(String x) {
		System.out.println("Anfang.binHarmlos.x = " + x);
		x = "Hallo";
		System.out.println("Ende.binHarmlos.x = " + x);
	}
	public static void main(String[] args) {
		int a = 1;
		System.out.println("mit int :");
		System.out.println("Anfang.main.a = " + a);
		binHarmlos(a);
		System.out.println("Ende.main.a = " + a);
		
		Point b = new Point(1,1);
		System.out.println("mit Point :");
		System.out.println("Anfang.main.b = " + b);
		binHarmlos(b);
		System.out.println("Ende.main.b = " + b);
		
		String launcher = "Engelchen";
		System.out.println("Anfang.main.b = " + launcher);
		binHarmlos(launcher);
		System.out.println("Ende.main.b = " + launcher);
	}
}
