package zeitner.destruktortest;

public class Kuh extends Nutztier{

	public static int anzahl = 0;
	
	int gewicht; 
	
	// getter/setter
	
	public int getGewicht() {
		return this.gewicht;
	}
	
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	// Konstruktor 
	public Kuh() {
		this("Standardkuh",50);
//		System.out.println("Standardkonstruktor Schwein durchlaufen ...");
		
	}

	public Kuh(String name, int gewicht) {
		super(name);
		this.setGewicht(gewicht);
		Kuh.anzahl = Kuh.anzahl + 1;
//		System.out.println("Maximalkonstruktor Schwein durchlaufen ...");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		Kuh.anzahl = Kuh.anzahl - 1;
	}
	
	// ToString 
	public String toString() {
		String ausgabe="";
		ausgabe = super.getName() + " wiegt "+ this.getGewicht() + "kg.";
		return ausgabe;
	}
	
	public void wirdGewogen() {
		if (this.getGewicht() >1 ){
			System.out.println("Die Kuh wiegt " + this.getGewicht());
		}
	}
	
}
