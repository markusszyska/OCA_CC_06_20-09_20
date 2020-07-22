package ml.assmann.rennen;

public class Krankenwagen extends Auto {
	private boolean blauLicht;
	
	public boolean isBlauLicht() {
		return blauLicht;
	}
	private void setBlauLicht(boolean blauLicht) {
		this.blauLicht = blauLicht;
	}

	public Krankenwagen() {
		this.setBlauLicht(false);
	}
	
	public void blaulichtUmschalten() {
		this.setBlauLicht(!this.isBlauLicht());
	}
}
