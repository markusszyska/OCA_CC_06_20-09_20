package ml.kukulin;
// ??????????
public class Konto{
	
	private double kontostand;
	private Person p = new Person();
	private String name;
	public Konto (String name, String vorname, double kontostand){ 
		 
		 this.name=name;
		 p.setName(name);
		 p.setVorname(vorname);
		 kontostand=0;
	}
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(float kontostand) {
		this.kontostand = kontostand;
	}
	public String getName() {
		return name;
	}
	
	}   