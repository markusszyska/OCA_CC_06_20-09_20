package ml.neumann.fahrzeugrennen;

public class Krankenwagen extends Auto{
	private boolean blaulicht; 
	
	//getter Setter 
	public boolean isBlaulicht() {
		return blaulicht;
	}


	public void setBlaulicht(boolean blaulicht) {
		this.blaulicht = blaulicht;
	}

	// Konstruktor Krankenwagen 
	public Krankenwagen() {
		boolean isBlaulicht= false;
		
	}
	
	



	public void lichtan()
	{ 
	if (this.isBlaulicht()){
		this.setBlaulicht(true);
		System.out.println("Tatü-tata");}
		
	else {System.out.println("wir fahren schon mit Blaulicht");
			}
}
	// ToString Methode 
	public String toString() {
		String ausgabe=super.toString(); 
		ausgabe+="Blaulicht an: " + this.isBlaulicht();
		return ausgabe;
		}
	

}