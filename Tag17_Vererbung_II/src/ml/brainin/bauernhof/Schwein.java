package ml.brainin.bauernhof;
import java.util.concurrent.ThreadLocalRandom;


public class Schwein {
	
	//Attribute
	private String name = "";
	private int gewicht = 0;
	private double verkaufsPreis = 0;
	private long id = System.currentTimeMillis();
	
	public long getId() {
		return id;
	}
	public Schwein() {
		this("Standartname der Schwein", 50);
	}
	public Schwein(String name, int gewicht) {
		this.name = name;
		this.gewicht = gewicht;
		System.out.println(toString());

	}

	public boolean equals(Schwein schwein) {
		return this.id == schwein.getId();
	}
	
	public void setGewicht(int gwt) {
		if (gwt <0) gwt = 0;
		this.gewicht = gwt;
	}
	public int getGewicht() {
		return gewicht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getVerkaufsPreis() {
		return verkaufsPreis;
	}
	public void setVerkaufsPreis(double verkaufsPreis) {
		this.verkaufsPreis = verkaufsPreis* getGewicht();
	}

	public String toString() {
		String ausgabe = "";
		ausgabe+= "\n--------------Schwein:";
		ausgabe += "\nName: "+ this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht();
		return ausgabe;
	}
}
