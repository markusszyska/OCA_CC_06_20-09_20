package neumann.bauernhof.pflanzen;

import neumann.bauernhof.EssenIstWegException;

public class Pflanzen implements IEssbar {
	
	String sorte; 
	int groesse;
	
	// getter/setter 
	


	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	
	
	int a = 0;// Variable zum Zählen der Pflanzen - Anzahl per Konstruktor erstellte Instanzen
	int g = 0;// Variable zum Zählen der Pflanzen - Anzahl der gegessenen Instanzen
	
	public Pflanzen() {
		super();
		a++;
	}
	

	public Pflanzen(String sorte, int groesse) {
		super();
		this.setSorte(sorte);
		this.setGroesse(groesse);
		a++;
	}

	//Methoden 
	// ToString 
	public String toString() {
		super.toString();
		 String ausgabe= "";
		 ausgabe= "Die Pflanze heißt  " + this.getSorte() + " und ist " + this.getGroesse() + "cm lang.";
		 return ausgabe; 
	}
	
	
	public void pflanzenZaehlen() {
		int anzahl = 0; 
		anzahl= a - g; // - die Objekte mit Größe = 0
		if (anzahl>1) {
			System.out.println("Es sind noch " + anzahl +" Pflanzen da.");
		}
		else {
			throw new EssenIstWegException();
		}
	}

	@Override
	public void wirdGegessen() {
		this.setGroesse(0);
		g++;
		pflanzenZaehlen();
	}
	
}
