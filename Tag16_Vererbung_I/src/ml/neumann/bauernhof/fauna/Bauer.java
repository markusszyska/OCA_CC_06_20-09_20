package ml.neumann.bauernhof.fauna;




public class Bauer {// attribute
	private String name;
	private int gewicht; 
	private int groesse; 
	private int alter;
	private double kontostand;
	private String bauernhofname; 
	
	// getter Setter 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	} 
	
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	public String getBauernhofname() {
		return bauernhofname;
	}
	private void setBauernhofname(String bauernhofname) {
		this.bauernhofname = bauernhofname;
	}

	//Konstruktoren 
	
	public Bauer() {
		this.setName("Standardbauer"); 
		this.setAlter(50);
		this.setGewicht(90);
		this.setGroesse(175);
		this.setKontostand(1000.00);
		this.setBauernhofname("Mein Bauernhof");
	}
	
	public Bauer(String name, int alter, int gewicht, int groesse, double kontostand, String bauernhofname) {
		this.setName(name);
		this.setAlter(alter);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setKontostand(kontostand);
		this.setBauernhofname(bauernhofname);
	}

	
	// methoden 
	
	
	
	public void melken(Kuh paramKuh)
	//Bauer soll eine bestimmte Kuh melken.  Datentyp Kuh - Parameter vom Typ Kuh
	{System.out.println("Der Bauer " + this.getName() + " melkt die Kuh "+ paramKuh.getName());
	
	System.out.println("Die Milchmenge beträgt: " + paramKuh.wirdGemolken());
		}
	
	
	

		
	}
	

	




