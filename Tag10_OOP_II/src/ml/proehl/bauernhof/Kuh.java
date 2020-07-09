package ml.proehl.bauernhof;

public class Kuh
{
	
	//Attribute
	public String name;
	public String hauptfarbe;
	public String fleckenfarbe;
	public int milch;
	public int gewicht;
	
	//Methoden
	public void laufen() 
	{	
		if (gewicht >=1)
		System.out.println(--gewicht);
		else
			System.out.println("Gewicht unter 0");
	}
	public void fressen() 
	{
		if (gewicht <=249)
		System.out.println(++gewicht);
		else
			System.out.println("Gewicht über 250");
	}
	public void melken() 
	{	
		if (milch > 1)
		System.out.println(--milch);	
		else
			System.out.println("Kuh leer");
	}
}
