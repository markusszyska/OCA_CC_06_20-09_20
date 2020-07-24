package ml.neumann.abstrakterBauernhof.flora;

public class Kartoffel extends APflanze {

	public Kartoffel() {
		super();
	}
	
	public Kartoffel(String sorte, int groesse) {
		super(sorte, groesse);
	}
	
	//Abstrakte Methode aus APflanze
	

	@Override
	public void bluehen() {
		System.out.println("Die Kartoffel blüht meistens weiß ");
	}

}
