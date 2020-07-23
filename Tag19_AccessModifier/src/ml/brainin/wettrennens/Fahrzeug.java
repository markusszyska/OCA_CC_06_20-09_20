package ml.brainin.wettrennens;

public class Fahrzeug implements Comparable<Fahrzeug>{
	private String namen;
	private double geschwindigkeit = 0;
	private double maxGeschwindigkeit = 0;
	private double aktualePosition = 0;
	private int drivers = 2;
	private double distanz = 0;
	
	
	public void bewegen(long zeit) {
		distanz = geschwindigkeit * zeit;
	}
	
	public double getDistanz() {
		return distanz;
	}



	public Fahrzeug(String namen, double maxGeschwindigkeit) {
		this.namen = namen;
		this.maxGeschwindigkeit = maxGeschwindigkeit ;
	}

	public Fahrzeug() {
		this("Standartname" , 0);
	}

	
	public String getNamen() {
		return namen;
	}
	public void setNamen(String namen) {
		this.namen = namen;
	}
	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}
	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
	public double getMaxGeschwindigkeit() {
		return maxGeschwindigkeit;
	}
	public void setMaxGeschwindigkeit(double maxGeschwindigkeit) {
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}
	public double getAktualePosition() {
		return aktualePosition;
	}
	public void setAktualePosition(double aktualePosition) {
		this.aktualePosition = aktualePosition;
	}
	public int getDrivers() {
		return drivers;
	}
	public void setDrivers(int drivers) {
		this.drivers = drivers;
	}

	@Override
	public String toString() {
		return "Farhrzeug [namen=" + namen + ",\ngeschwindigkeit=" + geschwindigkeit + ",\nmaxGeschwindigkeit="
				+ maxGeschwindigkeit + ",\naktualePosition=" + aktualePosition + ",\ndrivers=" + drivers + ",\ndistanz="
				+ distanz + "]";
	}

	@Override
	public int compareTo(Fahrzeug o) {
		return this.distanz < o.getDistanz()? 1:-1;
	}


}
