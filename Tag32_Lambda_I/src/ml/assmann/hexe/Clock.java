package ml.assmann.hexe;

public enum Clock {
	SECHS(6),SIEBEN(7),ACHT(8),NEUN(9),ZEHN(10),ELF(11),ZWOELF(12);

	/*
	 * Attributes
	 */
	private int number;
	
	/*
	 * Constructor
	 */
	private Clock(int number) {
		this.number = number;
	}
	
	/*
	 * Methods
	 */
	
	@Override
	public String toString() {
		return "" + this.number;
	}
}
