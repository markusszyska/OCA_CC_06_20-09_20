package ml.vi.bauernhof;

public class Stall {

	final private Schwein[] schwein = new Schwein[10];
	final private Kuh[] kuh = new Kuh[10];
	public Stall s;
	private boolean isOpen = true;
	private int key = 123;

	public Stall() {
	}
	
	public Stall(Schwein[] schwein, Kuh[] kuh) {
		setSchwein(schwein);
		setKuh(kuh);		
	}

	public Schwein[] getSchwein() {
		return schwein;
	}
	
	public void setSchwein(Schwein... schwein) {

		Schwein[] input = schwein;

		int i = 0;
		for (Schwein schw : input) {
			this.schwein[i] = schw;
			i++;
			if(i>9)
				break;
		}

	}

	public Kuh[] getKuh() {
		return kuh;
	}

	public void setKuh(Kuh... kuh) {

		Kuh[] input = kuh;

		int i = 0;
		for (Kuh k : input) {
			this.kuh[i] = k;
			i++;
			if(i>9)
				break;
		}

	}

	public void open(int key) {

		if (key == this.key)
			isOpen = true;
		System.out.println("Tür ist offen: " + isOpen);

	}

	public void close(int key) {

		if (key == this.key)
			isOpen = false;
		System.out.println("Tür ist offen: " + isOpen);

	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
