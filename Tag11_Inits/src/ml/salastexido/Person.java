package ml.salastexido;

public class Person {
	private String name;
	private String vorname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public Person(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}
	
	public String toString() {
		return this.name;
	}
	
}
