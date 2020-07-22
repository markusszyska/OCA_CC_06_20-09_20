package ml.brainin;

public class Pkw extends Fahrzeug{
	private String modellBezeichnung;
	private String fahrzeugtyp = "Pkw";
	public Pkw(){
		super();// Aufruf des Konstruktors der Basisklasse
		System.out.print("Geben Sie die Modellbezeichnung ein: ");
		modellBezeichnung = scanner.next();
	}
	public void print(){
		String ausgabe = "";
		ausgabe+= "\nfahrzeugtyp: "+fahrzeugtyp;
		ausgabe += "\nmodellBezeichnung: "+ this.modellBezeichnung;
		ausgabe += "\nHerstellerName: "+ getHerstellerName();
		System.out.println(ausgabe);
	}
}
