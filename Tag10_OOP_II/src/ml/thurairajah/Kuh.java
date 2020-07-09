package ml.thurairajah;

public class Kuh 
{
	public String name;
	public String hauptfarbe;
	public String fleckenfarbe;
	public int milchmenge;
	public int gewicht;
	
	//Melken
	public void melken() 
	{
		int melken = 20;
		if (!(milchmenge <= 0)) 
		{
			this.milchmenge -= melken;
			System.out.println("Melken ausgefuehrt.");
		}
		
	}
	//Laufen
	public void laufen()
	{
		int laufen = 30;
		if (!(gewicht <= 0)) 
		{
			this.gewicht -= laufen;
			System.out.println("Laufen ausgefuehrt.");
		}
	}
	//Fressen
	public void fressen() 
	{
		int fressen = 20;
		//int maxGewicht = gewicht+50;
		int maxGewicht = 700;
		if ((gewicht < maxGewicht)) 
		{
			this.gewicht += fressen;
			System.out.println("Gefuettert.");
		}else {
			System.out.println("Kuh ist satt und will nicht mehr.");
		}
	}
	
	

}
