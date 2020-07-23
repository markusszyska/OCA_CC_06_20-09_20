package ml.brainin.bauernhof.fauna;

public class Kalb extends Kind {
	public Kalb() {
		this("Standartname der Kalb", 60, new Tier(), new Tier(), false);
	}
	public Kalb(String name, int gewicht, Tier vater, Tier mutter, boolean isMaenlich) {
		super(name, gewicht, vater, mutter, isMaenlich);
	}
	
	
}
