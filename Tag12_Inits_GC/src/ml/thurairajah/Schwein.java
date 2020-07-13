package ml.thurairajah;

public class Schwein {
	
	//Attribute
	private String name;
	private int gewicht;
	private int alter;
	private Stall stall; // Stall wird rot (fehler), da es noch keiner Klasse zugwiesen wird. Maus drueber und Klasse erstellen, fertig.
	
	//Getter & Setter
	public String getName() { //hier name Z6 gross,
		return name;		//hier name aus Z6 klein, sonst Fehler! // Return muss, weil Z12 kein void hat!
	}
	public void setName(String name) {
		this.name=name; 	//name aus Z6 = String name aus Z15 // hier muss immer "this", sonst bezieht sich  alles auf Z15 "name",nicht auf name in Z6!
	}
	
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht=gewicht;
	}
	
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter=alter;
	}
	
	public Stall getStall() {
		return stall;
	}
	public void setStall(Stall stall) {
		this.stall=stall;
	}
	
	public Schwein() {
		this.setName("Standart");
		this.setGewicht(100);
		this.setAlter(1);
		this.setStall(null);
	}
	public Schwein(String name, int gewicht,int alter, Stall stall) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
		this.setStall(stall);
	}
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n----Schwein:";
		ausgabe += "\nName: " + this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht();
		ausgabe += "\nAlter: " + this.getAlter();
		return ausgabe;
	}
	
	public void fressen(int bissen) {
		this.setGewicht(this.getGewicht() + bissen);
		System.out.println(this.getName() + " frisst " + bissen + " und wiegt jetzt " + this.getGewicht());	
	}
	public void fressen(Kartoffel paramKartoffel) {
		System.out.println(this.getName() + " frisst " + paramKartoffel.getSorte()); // setSorte in Kartoffel.java 
		this.setGewicht(this.getGewicht() +paramKartoffel.wirdGegessen());	//wirdGegessen in Kartoffel.java 
	}
	public void fressen(Moehre paramMoehre) {
		this.setGewicht(this.getGewicht() + paramMoehre.wirdGegessen()); // wirdGegessen in Moehre.java
	}
	public void spielen(Schwein paramSchwein) {
		System.out.println(this.getName() + " spielt mit " + paramSchwein.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
}
