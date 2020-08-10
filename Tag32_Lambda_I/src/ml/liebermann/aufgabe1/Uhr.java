package ml.liebermann.aufgabe1;

public enum Uhr {

	EINS,ZWEI,DREI,VIER,FÜNF,SECHS,SIEBEN,ACHT,NEUN,ZEHN,ELF,ZWÖLF;
	private int nummer;
	
	
	private int getNummer() {
		return nummer;
	}

	private void setNummer(int nummer) {
		this.nummer = nummer;
	}

	private Uhr() {
		this.setNummer(this.ordinal() + 1);
	}
	
	@Override
	public String toString() {
		return "" + this.getNummer();
	}
	
	
}
