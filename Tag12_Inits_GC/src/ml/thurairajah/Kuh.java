package ml.thurairajah;

public class Kuh 
{
	private String name;
	private String hauptfarbe;
	private String fleckenfarbe;
	private int milchmenge;
	private int gewicht;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHauptfarbe() {
		return hauptfarbe;
	}
	public void setHauptfarbe(String hauptfarbe) {
		this.hauptfarbe = hauptfarbe;
	}
	public String getFleckenfarbe() {
		return fleckenfarbe;
	}
	public void setFleckenfarbe(String fleckenfarbe) {
		this.fleckenfarbe = fleckenfarbe;
	}
	public int getMilchmenge() {
		return milchmenge;
	}
	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public Kuh() {
		this.setName("StandartKuh");
		this.setGewicht(500);
		this.setHauptfarbe("Braun");
		this.setFleckenfarbe("Rosa");
		this.setMilchmenge(200);
	}
	public Kuh(String name, String hauptfarbe, String fleckenfarbe,
			int gewicht, int milchmenge) {
		this.setName(name);
		this.setHauptfarbe(hauptfarbe);
		this.setFleckenfarbe(fleckenfarbe);
		this.setGewicht(gewicht);
		this.setMilchmenge(milchmenge);
	}
	public String toString() { 
		String ausgabe = "";	//pls chck ctrl+f11
		ausgabe += "\n---Kuh:";	 
		ausgabe += "\nName: " +this.getName();
		ausgabe += "\nHauptfarbe: " + this.getHauptfarbe();
		ausgabe += "\nFleckenfarbe: " + this.getFleckenfarbe();
		ausgabe += "\nGewicht: " + this.getGewicht();
		ausgabe += "\nMilchmenge: " + this.getMilchmenge();
		return ausgabe;
	}
	
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
	
	public void melken2(Eimer paramMilch) { //reference to Bauer.java
		this.setMilchmenge(this.getMilchmenge()+ paramMilch.wirdGemolken());
	}
	public void melken2(int melkMilch) { //reference to Bauernhof.java
		this.setMilchmenge(this.getMilchmenge()+melkMilch);
		System.out.println(this.getName()+" wird " + melkMilch + " liter Milch gemolken");
	}
		

//	public int wirdGemolken() {
//		int tmp = this.getMilchmenge();
//		this.setMilchmenge(0);
//		return tmp;
//	}
	
	
		
		
	
}
