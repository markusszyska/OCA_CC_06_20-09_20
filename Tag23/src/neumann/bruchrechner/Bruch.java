package neumann.bruchrechner;



public class Bruch {
	
	private int zaehler; 
	private int nenner; 
	
	// getter Setter
	public int getZaehler() {
		return zaehler;
	}
	
	public void setZaehler(int zaehler) {
		this.zaehler=zaehler;
	}
	
	public int getNenner()
	{
		return nenner; 
	}
		
	public void setNenner(int nenner) {
		this.nenner= nenner; 
	}

// Konstruktoren 
	public Bruch() {
		super();
	
	}

	public Bruch(int zaehler, int nenner) {
		this.setZaehler(zaehler);
		this.setNenner(nenner);
	}

	// Methoden 
	// toString Methode 

	public String toString() {
	String ausgabe= "";
	ausgabe += "Zaehler: " + this.getZaehler(); 
	ausgabe += "Nenner: " + this.getNenner();
	return ausgabe; 
	}

	//Berechnungen 
	public void multiplizieren(int z1,int n1,int z2,int n2) {
		int ergz= z1 * z2; 
		int ergn= n1 * n2;
		System.out.println(z1 + "/" + n1 + " * "+ z2 + "/" + n2 + " = " + ergz + "/" + ergn);
	}
	
	public void dividieren(int z1,int n1,int z2,int n2) {
		int ergzd= z1 *n2;
		int ergnd= n1 * z2; 
		System.out.println(z1 + "/" + n1 + " : "+ z2 + "/" + n2 + " = " + ergzd + "/" + ergnd);
	}
	
	public void addieren(int z1,int n1,int z2,int n2) {
		int ergza= ((z1 * n2)+ (z2 * n1));
		int ergna= (n1 * n2); 
		System.out.println(z1 + "/" + n1 + " + "+ z2 + "/" + n2 + " = " + ergza + "/" + ergna);
	}
	
	public void subtrahieren(int z1,int n1,int z2,int n2) {
		int ergzs= ((z1 * n2)- (z2 * n1));
		int ergns= n1 * n2; 
		System.out.println(z1 + "/" + n1 + " - "+ z2 + "/" + n2 + " = " + ergzs + "/" + ergns);
	}
}


