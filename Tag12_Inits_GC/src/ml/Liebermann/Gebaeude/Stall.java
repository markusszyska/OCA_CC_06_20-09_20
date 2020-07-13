package ml.Liebermann.Gebaeude;

import ml.Liebermann.Items.Tuer;
import ml.Liebermann.Lebewesen.Kuh;
import ml.Liebermann.Lebewesen.Schwein;

public class Stall {
	private Tuer tuer = new Tuer();
	private Schwein schweinImStall;
	private Kuh kuhImStall;
	
	public Stall() {
		
	}
	
	public Schwein getSchweinImStall() {
		return schweinImStall;
	}

	public void setSchweinImStall(Schwein schweinImStall) {
		this.schweinImStall = schweinImStall;
	}

	public Kuh getKuhImStall() {
		return kuhImStall;
	}

	public Tuer getTuer() {
		return tuer;
	}

	public void setTuer(Tuer tuer) {
		this.tuer = tuer;
	}

	public void setKuhImStall(Kuh kuhImStall) {
		this.kuhImStall = kuhImStall;
	}

	public boolean isOffen() {
		return tuer.isOffen();
	}
	
}
