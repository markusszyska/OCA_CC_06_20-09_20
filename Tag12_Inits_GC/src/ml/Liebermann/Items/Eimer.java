package ml.Liebermann.Items;

import ml.Liebermann.Nahrung.Milch;

public class Eimer {
	private Milch milch = new Milch(0); // In Litern
	private final int MAX_FUELLMENGE = 20;


	public Milch getMilch() {
		return milch;
	}

	public void setMilch(Milch milch) {
		if (this.milch.getMilchmenge() + milch.getMilchmenge() < MAX_FUELLMENGE) {
			this.milch = milch;
		}
		else {
			this.milch.setMilchmenge(MAX_FUELLMENGE);
		}
	}

	public void fuellen(Milch m1) {
		this.setMilch(m1);
	}

	public int getMAX_FUELLMENGE() {
		return MAX_FUELLMENGE;
	}

}
