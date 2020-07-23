package ml.brainin.bauernhof.fauna;

public class Ferkel extends Kind {
	public Ferkel() {
		this("Standartname der Kalb", 60, new Tier(), new Tier(), false);
	}
	public Ferkel(String name, int gewicht, Tier vater, Tier mutter, boolean isMaenlich) {
		super(name, gewicht, vater, mutter, isMaenlich);
	}
	
	
}
