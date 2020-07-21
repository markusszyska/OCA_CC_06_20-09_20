package ml.Boettger.vererbung_aufgabe_11_1;

class Pkw extends Fahrzeug
{
	private String fahrzeugtyp = "Pkw";
	private String modellBezeichnung;

	// getter and setter
	
	public String getFahrzeugtyp() 
	{
		return fahrzeugtyp;
	}

	public void setFahrzeugtyp(String fahrzeugtyp) 
	{
		this.fahrzeugtyp = fahrzeugtyp;
	}

	public String getModellBezeichnung() 
	{
		return modellBezeichnung;
	}

	public void setModellBezeichnung(String modellBezeichnung) 
	{
		this.modellBezeichnung = modellBezeichnung;
	}

	public Pkw()
	{
		// b) Vervollstaendigen Sie den Konstruktor der Klasse Pkw.
		
		super();		// wird aber auch beim Weglassen aufgerufen!!!
		
		System.out.println("\tKonstruktor der Basisklasse wurde aufgerufen");
		System.out.print("\tGeben Sie die Modellbezeichnung ein: ");
		modellBezeichnung = scanner.next();
	}
	
	//#########################################################################
	public void print()
	//
	// In der Klasse Pkw soll die Methode print() der Klasse Fahrzeug
	// ueberschrieben werden. Die Methode print() der Klasse Pkw soll alle
	// Datenfelder eines Objektes der Klasse Pkw ausgeben und dabei die Methode
	// print() ihrer Basisklasse aufrufen. Ergaenzen Sie die Methode print() 
	// der Klasse Pkw.
	//
	//#########################################################################
	{
		super.print();
	
		System.out.println("\tFahrzeugtyp       : " + 
			this.getFahrzeugtyp());
		
		System.out.println("\tModellbezeichnung : " + 
			this.getModellBezeichnung());	
	}
}