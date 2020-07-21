package ml.kukulin;

class Pkw extends Fahrzeug{ 
	
	private String fahrzeugtyp = "Pkw";
	
	private String modellBezeichnung;
	
	public Pkw(){ 
		new Fahrzeug();
			
		// Aufruf des Konstruktors der Basisklasse  
		
		System.out.print("Geben Sie die Modellbezeichnung ein: ");
	
		modellBezeichnung = scanner.next();
	}
	public void print(){ 
		super.print();
		System.out.println("fahrzeugtyp : " + fahrzeugtyp);
		System.out.println("modellBezeichnung : " + modellBezeichnung);
		}
}
	