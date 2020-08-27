package kapitel2.encapsulation;

public class Encapsulation {

}
/*
 * Encapsulation erreichen durch:
 * - Attribute private machen
 * - Getter/Setter fuer den Zugriff bereitstellen
 */
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}