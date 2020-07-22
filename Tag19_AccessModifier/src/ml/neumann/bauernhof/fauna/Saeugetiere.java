package ml.neumann.bauernhof.fauna;

public class Saeugetiere {
	private String name; 
	
	private String geschlecht;
	
	// getter/setter
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	// KOnstruktor 
	public Saeugetiere() {
		this.setName("Standardname");
	this.setGeschlecht("männlich");
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "\nName: " + this.getName();
		ausgabe +="\nGeschlecht: " +this.getGeschlecht();
		return ausgabe;
		
	}

}
