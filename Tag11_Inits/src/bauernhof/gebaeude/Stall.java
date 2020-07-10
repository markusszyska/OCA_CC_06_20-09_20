package bauernhof.gebaeude;

import bauernhof.fauna.Schwein;

public class Stall {

	private Schwein schweinImStall;
	
	public void setSchweinImStall(Schwein schweinImStall) {
		this.schweinImStall = schweinImStall;
	}	
	public Schwein getSchweinImStall() {
		return this.schweinImStall;
	}
	
	public Stall() {
		this.setSchweinImStall(new Schwein(
				"Schwein im Konstruktor vom Stall",100, 5,this));
	}
}
