package bauernhof_final_vor_vererbung;

public class Stall {
	private Kuh kuh;
	private Schwein schwein;
	
	public Kuh getKuh() {
		return kuh;
	}
	public void setKuh(Kuh kuh) {
		this.kuh = kuh;
	}
	public Schwein getSchwein() {
		return schwein;
	}
	public void setSchwein(Schwein schwein) {
		this.schwein = schwein;
	}
	
	public Stall() {
		this.setKuh(new Kuh());
		this.setSchwein(new Schwein());
	}
	public Stall(Kuh kuh, Schwein schwein) {
		this.setKuh(kuh);
		this.setSchwein(schwein);
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n---------Stall:";
		ausgabe += this.getKuh();
		ausgabe += this.getSchwein();
		return ausgabe;
	}
	
	
	
}
