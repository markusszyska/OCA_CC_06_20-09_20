package bauernhof;

public class Schwein {

	//Attribute
	private String name;
	private int gewicht;
	private int alter;
	private String aufenthaltsort;
	
	//Getter/Setter
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
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String getAufenthaltsort() {
		return aufenthaltsort;
	}
	public void setAufenthaltsort(String aufenthaltsort) {
		this.aufenthaltsort = aufenthaltsort;
	}
	
	public Schwein() {
		this.setName("Standardschwein");
		this.setGewicht(100);
		this.setAlter(1);
		this.setAufenthaltsort("Stall");
	}
	public Schwein(String name, int gewicht, int alter, String aufenthaltsort) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
		this.setAufenthaltsort(aufenthaltsort);
	}
	
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n---------------Schwein:";
		ausgabe += "\nName: " + this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht();
		ausgabe += "\nAlter: " + this.getAlter();
		ausgabe += "\nAufenthaltsort: " + this.getAufenthaltsort();
		return ausgabe;
	}
	public void fressen(int bissen) {
//		this.gewicht += bissen;
		this.setGewicht(this.getGewicht() + bissen);
		System.out.println(this.getName() + " frisst " + bissen + " und wiegt jetzt "+ this.getGewicht());
	}
	public void fressen(Kartoffel paramKartoffel) {
		System.out.println(this.getName() + " frisst " + paramKartoffel.getSorte());
		this.setGewicht(this.getGewicht() + paramKartoffel.wirdGegessen());		
	}
	
	public void spielen(Schwein paramSchwein) {
		System.out.println(this.getName() + " spielt mit " + paramSchwein.getName());
	}
	
	
	
	
	
	
}
