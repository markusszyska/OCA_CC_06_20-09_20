package ml.liebermann;

public class Pkw extends Fahrzeug  {
	private String fahrzeugtyp = "Pkw";
	private String modellBezeichnung;

	public Pkw() {
		// . . . . .// Aufruf des Konstruktors der Basisklasse
		System.out.print("Geben Sie die Modellbezeichnung ein:");
		modellBezeichnung = scanner.next();

				
	}

	public void print(){
		System.out.println("Fahrzeug vom typ " + fahrzeugtyp + " mit der Modelbezeichnung " + modellBezeichnung);
		super.print();
	}

}
