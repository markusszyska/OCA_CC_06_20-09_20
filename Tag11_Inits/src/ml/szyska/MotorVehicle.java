package ml.szyska;

public class MotorVehicle {

	private double laenge = 0, breite = 0, hoehe = 0;
	private double gewicht = 0;
	private String automarke = "";
	private String endkunde = "";
	private Address startAdresse = new Address();
	private Address endAdresse = new Address();
	private boolean selbstabholer = false;
	
	public void setLaenge(double laenge){
		this.laenge = laenge;
	}
	public double getLaenge() {
		return this.laenge;
	}
	
	public void setBreite(double breite){
		this.breite = breite;
	}
	public double getBreite() {
		return this.breite;
	}

	public void setHoehe(double hoehe){
		this.hoehe = hoehe;
	}
	public double getHoehe() {
		return this.hoehe;
	}

	public void setGewicht(double gewicht){
		this.gewicht = gewicht;
	}
	public double getGewicht() {
		return this.gewicht;
	}

	public void setAutomarke(String automarke){
		this.automarke = automarke;
	}
	public String getAutomarke() {
		return this.automarke;
	}

	public void setEndkunde(String endkunde){
		this.endkunde = endkunde;
	}
	public String getEndkunde() {
		return this.endkunde;
	}

	public void setStartAdresse(Address startAdresse){
		this.startAdresse = startAdresse;
	}
	public Address getStartAdresse() {
		return this.startAdresse;
	}

	public void setEndAdresse(Address endAdresse){
		this.endAdresse = endAdresse;
	}
	public Address getEndAdresse() {
		return this.endAdresse;
	}

	public void setSelbstabholer(boolean selbstabholer){
		this.selbstabholer = selbstabholer;
	}
	public boolean getSelbstabholer() {
		return this.selbstabholer;
	}


	public MotorVehicle(double laenge, double breite, double hoehe,
						double gewicht,
						String automarke,
						String endkunde,
						Address startAdresse,
						Address endAdresse,
						boolean selbstabholer) {
		this.setLaenge(laenge);
		this.setBreite(breite);
		this.setHoehe(hoehe);
		this.setGewicht(gewicht);
		this.setAutomarke(automarke);
		this.setEndkunde(endkunde);
		this.setStartAdresse(startAdresse);
		this.setEndAdresse(endAdresse);
		this.setSelbstabholer(selbstabholer);
	}
	
	public void printMotorVehicle() {
		
		System.out.println("Größe des Fahrzeugs: " + this.getLaenge() + " x " + this.getBreite() + " x " + this.getHoehe());
		System.out.println("Gewicht: " + this.getGewicht());
		System.out.println("Automarke: " + this.getAutomarke());
		System.out.print("Absenderadresse: ");
		this.getStartAdresse().printAddress();
		System.out.print("Zieladresse: ");
		this.getEndAdresse().printAddress();
	}
}
