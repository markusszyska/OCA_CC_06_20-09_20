package ml.neumann.abstrakterBauernhof.fauna;

public class Schwein extends ANutztier{

	private boolean trueffelschwein;
	
	// getter setter
	
	public boolean isTrueffelschwein() {
		return trueffelschwein;
	}
	public void setTrueffelschwein(boolean trueffelschwein) {
		this.trueffelschwein= trueffelschwein;
	}
	
	// Konstruktor 
	public Schwein()
	{
		super();
		this.setTrueffelschwein(false);
	}
	
	public Schwein(String name, int alter, int gewicht, boolean female, boolean trueffelschwein) {
		super(name,alter,gewicht,female);
		this.setTrueffelschwein(trueffelschwein);
	}
	
	// abstrakte methoden 
	@Override
	public void machGeraeusch() {
		System.out.println("Das Schwein " + this.getName() + " macht Oiiiink");
	}
	@Override
	public void wirdGeschlachtet() {
		System.out.println("Das Schwein " + this.getName() + " wurde geschlachtet");
	
		
	}
	
	// konkrete Methode 
	

}
