package ml.neumann.abstrakterBauernhof.fauna;

public abstract class ANutztier extends ATier {
// Attribute 
	
	// getter Setter
	
	// Konstruktor 
	
	public ANutztier() {
		super();
	}
	
	public ANutztier(String name, int alter, int gewicht, boolean female) {
		super(name, alter,gewicht,female);
	}
	
	// Abstrakte Methoden 
	@Override
	public abstract void machGeraeusch();


	public abstract void wirdGeschlachtet() ;

}
