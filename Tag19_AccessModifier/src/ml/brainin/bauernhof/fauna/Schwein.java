package ml.brainin.bauernhof.fauna;



public class Schwein extends Tier{
	
	public Schwein() {
		this("Standartname der Schwein", 50, false);
	}
	public Schwein(String name, int gewicht, boolean isMaenlich) {
		super(name, gewicht, isMaenlich);
		setVerkaufsPreis(5.5);
		System.out.println(toString());

	}

}
