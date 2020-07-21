package ml.Boettger.vererbung_aufgabe_11_1;

class Motorrad extends Fahrzeug
{
	private String fahrzeugtyp = "Motorrad";

	// getter and setter
	
	public String getFahrzeugtyp() 
	{
		return fahrzeugtyp;
	}

	public void setFahrzeugtyp(String fahrzeugtyp) 
	{
		this.fahrzeugtyp = fahrzeugtyp;
	}

	//#########################################################################
	//
	public void print()
	//
	// In der Klasse Pkw soll die Methode print() der Klasse Fahrzeug
	// ueberschrieben werden. Die Methode print() der Klasse Pkw soll alle
	// Datenfelder eines Objektes der Klasse Pkw ausgeben und dabei die Methode
	// print() ihrer Basisklasse aufrufen. Ergaenzen Sie die Methode print() 
	// der Klasse Pkw. Ergaenzen Sie in analoger Weise die Methode print() der
	// Klasse Motorrad.
	//
	//#########################################################################
	{
		super.print();		
		System.out.println("\tFahrzeugtyp       : " + 
				this.getFahrzeugtyp());
	}
}