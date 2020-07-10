package ml.vi.bestandsverwaltung;

public class MotorVehicle {

	private double laenge = 10;
	private double breite = 5;
	private double hoehe = 2;
	private double gewicht = 1;
	private String automarke = "Smart";
	private String endkunde = "Max";
	private Address start = new Address();
	private Address ziel = new Address();
	private boolean selbstabholer = false;

	public MotorVehicle() {
	}

	public MotorVehicle(double laenge, double breite, double hoehe, double gewicht, String automarke, String endkunde,
			Address start, Address ziel, boolean selbstabholer) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
		this.gewicht = gewicht;
		this.automarke = automarke;
		this.endkunde = endkunde;
		this.start = start;
		this.ziel = ziel;
		this.selbstabholer = selbstabholer;
	}

	public void printMotorVehicle() {
		System.out.printf("Größe des Fahrzeugs: <%.2f> x <%.2f> x <%.2f>\n"
				+ "Gewicht: <%.2f>\n"
				+ "Automarke: <%s>\n", laenge, breite, hoehe, gewicht, automarke);
		System.out.print("Absenderadresse: ");
		start.printAddress();
		System.out.print("Zieladdresse: ");
		ziel.printAddress();
		if (!selbstabholer)
			System.out.println("Kein Selbstabholer");
	}

	public Address getStart() {
		return start;
	}

	public void setStart(Address start) {
		this.start = start;
	}

	public Address getZiel() {
		return ziel;
	}

	public void setZiel(Address ziel) {
		this.ziel = ziel;
	}

}
