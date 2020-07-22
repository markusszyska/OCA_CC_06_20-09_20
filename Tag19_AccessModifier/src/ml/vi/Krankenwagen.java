package ml.vi;

public class Krankenwagen extends Auto{

	private boolean blaulicht;
	
	public Krankenwagen() {
		this.blaulicht = false;
	}
	
	public Krankenwagen(boolean blaulicht) {
		this.blaulicht = blaulicht;
	}

	public boolean isBlaulicht() {
		return blaulicht;
	}

	public void setBlaulicht(boolean blaulicht) {
		this.blaulicht = blaulicht;
	}
	
	
}
