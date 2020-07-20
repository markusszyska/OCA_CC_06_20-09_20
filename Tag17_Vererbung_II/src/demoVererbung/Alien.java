package demoVererbung;

public class Alien {
	public String planet;

	public Alien(String planet) {
		this.planet = planet;
	}
	
	public static void main(String[] args) {
		Grob g = new Grob();
		System.out.println(g.planet);
	}
}

/*
 * Implicit super constructor Alien() is undefined for default constructor. Must
 * define an explicit constructor
 */
class Grob extends Alien {

	public Grob() {
//		super("Locutus");
		this("Locutus");
	}
	
	public Grob(String planet) {
		super(planet);
	}
	
	
}