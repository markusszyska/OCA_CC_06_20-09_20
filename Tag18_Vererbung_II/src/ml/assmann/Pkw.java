package ml.assmann;

class Pkw extends Fahrzeug {
	private String fahrzeugtyp = "Pkw";
	private String modellBezeichnung;

	public Pkw(){   
		super();// Aufruf des Konstruktors der Basisklasse   
		System.out.print("Geben Sie die Modellbezeichnung ein: ");   
		modellBezeichnung = scanner.next();  
	}

	public void print(){   
		super.print();
		System.out.println("Fahrzeugtyp : " + fahrzeugtyp);
		System.out.println("ModellBezeichnung : " + modellBezeichnung);
	}
}