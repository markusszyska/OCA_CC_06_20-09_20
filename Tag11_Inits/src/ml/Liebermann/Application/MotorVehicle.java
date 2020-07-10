package ml.Liebermann.Application;

public class MotorVehicle {
	private double laenge;
	private double breite;
	private double hoehe;
	private double gewicht;
	private String marke;
	private String endkunde;
	
	private Adress start;
	private Adress ziel;
	
	public MotorVehicle(double laenge, double breite, double hoehe, double gewicht, String marke, String endkunde, Adress start, Adress ziel) {
		this.setLaenge(laenge);
		this.setBreite(breite);
		this.setHoehe(hoehe);
		this.setMarke(marke);
		this.setEndkunde(endkunde);
		this.setStart(start);
		this.setZiel(ziel);

	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public double getGewicht() {
		return this.gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getEndkunde() {
		return endkunde;
	}

	public void setEndkunde(String endkunde) {
		this.endkunde = endkunde;
	}

	public Adress getStart() {
		return start;
	}

	public void setStart(Adress start) {
		this.start = start;
	}

	public Adress getZiel() {
		return ziel;
	}

	public void setZiel(Adress ziel) {
		this.ziel = ziel;
	}
	
	public void printMotorVehicle() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Groesse des Fahrzeugs :\t" + this.getLaenge() + " x " + this.getBreite() + " x " + this.getHoehe() 
				+ "\nGewicht: " + this.getGewicht() 
				+ "\nAutomarke: " + this.getMarke()
				+ "\nAbsender:" + this.getStart().toString()
				+ "\nZiel:" + this.getZiel().toString();
	}
	
}
