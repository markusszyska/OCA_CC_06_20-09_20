package ml.Liebermann.Konto;

public class Person {
	private String name;
	private String vorname;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setVorname(String n) {
		vorname = n;
	}

	public String getVorname() {
		return vorname;
	}
	public String toString() {
		return this.vorname + " " + this.name; 
	}

}
