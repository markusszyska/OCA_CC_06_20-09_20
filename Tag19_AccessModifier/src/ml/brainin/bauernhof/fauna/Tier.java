package ml.brainin.bauernhof.fauna;

public class Tier {
	private String name = "";
	private int gewicht = 0;
	private double verkaufsPreis = 0;
	private long id = System.currentTimeMillis();
	boolean isMaenlich;
	
	public boolean isMaenlich() {
		return isMaenlich;
	}
	public void setMaenlich(boolean isMaenlich) {
		this.isMaenlich = isMaenlich;
	}

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
		if (gewicht <0) gewicht = 0;
		this.gewicht = gewicht;
	}
	public double getVerkaufsPreis() {
		return verkaufsPreis;
	}
	public void setVerkaufsPreis(double verkaufsPreis) {
		this.verkaufsPreis = verkaufsPreis;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public boolean equals(Tier tier) {
		return this.id == tier.getId();
	}

	public Tier() {
		this("Standartname", 50, false);
	}
	public Tier(String name, int gewicht, boolean isMaenlich) {
		this.name = name;
		this.gewicht = gewicht;
		this.isMaenlich = isMaenlich;
	}
	public String toString() {
		String ausgabe = "";
		ausgabe += "\nName: "+ this.getName();
		ausgabe += "\nisMaenlich: "+ this.isMaenlich();
		ausgabe += "\nGewicht: " + this.getGewicht()+" kg";
		ausgabe += "\nVerkaufsPreis: " + this.getVerkaufsPreis()+" euro/kg";
		return ausgabe;
	}

}
