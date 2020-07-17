package ml.neumann.bauernhof.flora;

public class Kartoffel {
	//Attribute 
	
	private String sorte; 
	private int kartoffelgroesse; 
	
	// Getter Setter 
	
	public String getSorte() {
		return sorte; 
	}
	
	public void setSorte(String sorte) {
		this.sorte = sorte;
	}
	
	public int getKartoffelgroesse() {
		return kartoffelgroesse; 
	}
	
	public void setKartoffelgroesse (int kartoffelgroesse) {
		this.kartoffelgroesse = kartoffelgroesse; 
	}
		
	// Konstruktoren 
		
		//ohne Parameter 
		
		public Kartoffel()
		{	this.setSorte("Standardkartoffel");
			this.setKartoffelgroesse(10);			
		}
		
		//mit Parameter
		
		public Kartoffel (String sorte, int kartoffelgroesse) {
			this.setSorte(sorte);
			this.setKartoffelgroesse(kartoffelgroesse);
		}
		
	
	//methoden 	
		public int wirdGegessen() {
			int temp = this.getKartoffelgroesse();
			// zwischenspeichern damit man den ursprungswert zurück geben kann 
			
			this.setKartoffelgroesse(0);
			// die Kartoffel ist gegessen als ist die Größe hinterher 0 
			return temp;
			// zur Berechnung der Gewichstzunahme müssen wir den ursprünglichen Wert zurück geben. 
			
		}
		

}
