package ml.neumann.abstrakterBauernhof.fauna;

public class Kuh extends ANutztier {
// Attribut
	private String farbe;
	
	// Getter Setter
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe= farbe;
	}
	
	//Konstruktor 
	public Kuh() {
		super();
		this.setFarbe("braun");
	}
	
	public Kuh(String name, int alter, int gewicht, boolean female, String farbe) {
		super(name,alter, gewicht,female);
		this.setFarbe(farbe);
	}
	// Abstrakte Methode 
	@Override
	public void machGeraeusch() {
		System.out.println("Die Kuh " + this.getName() + " macht Muuuuuuuuuuuuuuuuh");}
		
	// Konkrete MEthode 
	
	public void wirdGemolken() {
		System.out.println("Kuh " + this.getName() + " wird gemolken");
		
	}
	@Override
	public void wirdGeschlachtet() {
		System.out.println("Die Kuh " + this.getName() + " wurde geschlachtet");
		
	}

}
