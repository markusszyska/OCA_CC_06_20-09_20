package ml.liebermann.aufgabe2;

import ml.liebermann.aufgabe2.print.CreatureType;

public class Creature {

	private CreatureType art;
	private boolean istHungrig = true;
	
	
	public CreatureType getArt() {
		return art;
	}

	public void setArt(CreatureType art) {
		this.art = art;
	}

	public boolean isIstHungrig() {
		return istHungrig;
	}

	public void setIstHungrig(boolean istHungrig) {
		this.istHungrig = istHungrig;
	}

	public Creature() {
		
	}
	
	public Creature(CreatureType art) {
		this.setArt(art);
	}
	
	public void feedCreature() {
		this.setIstHungrig(false);
	}
	
	public void printCreature() {
		art.printArt(this.isIstHungrig());	
	}

	
	
}
