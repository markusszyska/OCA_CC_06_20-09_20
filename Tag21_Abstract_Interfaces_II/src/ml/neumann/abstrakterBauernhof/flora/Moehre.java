package ml.neumann.abstrakterBauernhof.flora;

public class Moehre extends APflanze {

	// Konstruktor 
	
	public Moehre() {
		super();
	}
	
	public Moehre(String sorte, int groesse) {
		super(sorte, groesse);
	}
	
	//Abstrakte Methode aus APflanze
	@Override
	public void bluehen() {
		System.out.println("Die Karotte bildet eine Doppeldolde");
	}

}
