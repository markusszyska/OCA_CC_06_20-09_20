package ml.neumann.bauernhof.gebaeude;


public class Stall {
	private String name; 
	private String farbe;

	
	
	//Stall soll 10 K�he und 10 Schweine aufnehmen k�nnen 
	//Die K�he/Schweine sollen �ber den Namen identifiziert werden. 
	// statt Attribut private Kuh und private Schwein - erstelle ich zwei Arrays der gr��e 10 
String[]kuh = new String[10];
String[]Schwein = new String[10];

	
	
	// getter / setter 

public String getFarbe() {
	return farbe;
}

public void setFarbe (String farbe) {
	this.farbe= farbe;
}
	
public String getName() {
	return name; 
}
public void setName(String name) {
	this.name = name; 
}
	
	

	
	
	// Konstruktor 
	public Stall () {
		this.setName("Stall");
		this.setFarbe("grau");
	}
	
	public Stall (String name, String farbe) {
		this.setName(name);
		this.setFarbe(farbe);
	}

}
