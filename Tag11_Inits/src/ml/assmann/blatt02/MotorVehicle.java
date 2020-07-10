package ml.assmann.blatt02;

public class MotorVehicle {
	
	/*
	 * Attribute
	 */
	private int laenge;
	private int breite;
	private int hoehe;
	private int gewicht;
	private String automarke;
	private Address endkunde;
	private Address startadresse;
	private Address zieladresse;
	private boolean selbstabholung;
	
	/*
	 * Geforderte Getter/Setter
	 */
	
	// Startadresse
	public Address getStartadresse() {
		return this.startadresse;
	}
	
	public void setStartadresse(Address startadresse) {
		this.startadresse = startadresse;
	}
	
	// Zieladresse
	public Address getZieladresse() {
		return this.zieladresse;
	}
	
	public void setZieladresse(Address zieladresse) {
		this.zieladresse = zieladresse;
	}
	
	/*
	 * Konstruktoren
	 */
	
	// default
	public MotorVehicle() {
		this.laenge = 0;
		this.breite = 0;
		this.hoehe = 0;
		this.gewicht = 0;
		this.automarke = "Standardmarke";
		this.endkunde = new Address();
		this.setStartadresse(new Address());
		this.setZieladresse(new Address());
		this.selbstabholung = false;
	}
	
	// Voll
	public MotorVehicle(int laenge, int breite, int hoehe, int gewicht, String automarke, Address startadresse, Address zieladresse) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
		this.gewicht = gewicht;
		this.automarke = automarke;
		this.endkunde = new Address();
		this.setStartadresse(startadresse);
		this.setZieladresse(zieladresse);
		this.selbstabholung = false;
	}
	
	/*
	 * Methoden
	 */
	public void printMotorVehicle() {
		String ausgabe = "";
		ausgabe += "\nGroesse des Fahrzeugs: " + this.laenge + " cm x " + this.breite + " cm x " + this.hoehe + " cm";
		ausgabe += "\nGewicht: " + this.gewicht + " kg";
		if (!this.automarke.equals("")) ausgabe += "\nAutomarke: " + this.automarke;
		System.out.println(ausgabe);
		System.out.print("Absenderadresse: ");
		this.getStartadresse().printAddress();
		System.out.print("Zieladresse: ");
		this.getZieladresse().printAddress();
		if(!isSelbstabholung()) System.out.println("Kein Selbstabholer!");
	}
	
	public boolean isSelbstabholung() {
		return this.selbstabholung;
	}
	
	
}
