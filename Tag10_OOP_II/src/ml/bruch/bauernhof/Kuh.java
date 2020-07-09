package ml.bruch.bauernhof;

public class Kuh {
	
	//Attribute
	public String name;
	public int gewicht;
	public int alter;
	public String aufenthaltsOrt;
	public int milchmenge;
	public String hauptfarbe;
	public String fleckenfarbe;

	
	//Methoden
	public void muhen() {
		System.out.println("muuuuu");
	}
	public void laufen() {
		int gewicht1= gewicht-5;
		System.out.println("gewicht1");
	}
	public void essen() {
		int gewicht1= gewicht+5;
		System.out.println(gewicht1);
	}
	public void melken() {
		int gewicht1= milchmenge-5;
		System.out.println(gewicht1);
	}
}




