package ml.assmann.farm.objects;

import ml.assmann.farm.fauna.*;

public class Barn {

	/*
	 * Attribute
	 */
	ALivestock[] cows;
	ALivestock[] pigs;

	/*
	 * Setter/Getter
	 */
	public ALivestock[] getCows() {
		return this.cows;
	}

	private void setCows(Cow[] cows) {
		this.cows = cows;
	}

	public ALivestock[] getPigs() {
		return this.pigs;
	}

	private void setPigs(Pig[] pigs) {
		this.pigs = pigs;
	}

	/*
	 * Constructors
	 */
	public Barn() {
		cows = new ALivestock[10];
		pigs = new ALivestock[10];
	}

	/*
	 * Methods
	 */

	// Sets Livestock at index as ls, differentiates between Cow and Pig
	private void setLivestockAt(int index, ALivestock ls) {
		if(ls instanceof Pig) {
			if (index < 0 || index > this.getPigs().length - 1) {
				System.out.println("Wrong pig position");
				return;
			}
			this.getPigs()[index] = ls;
		}
		if(ls instanceof Cow) {
			if (index < 0 || index > this.getCows().length - 1) {
				System.out.println("Wrong cow position");
				return;
			}
			this.getCows()[index] = ls;
		}
	}
	
	// Removes a Pig at position index for GC
	public void removePigAt(int index) {
		if (index < 0 || index > this.getPigs().length - 1) {
			System.out.println("Wrong pig position");
			return;
		}
		this.getPigs()[index] = null;
	}
	
	// Removes a Cow at position index for GC
	public void removeCowAt(int index) {
		if (index < 0 || index > this.getCows().length - 1) {
			System.out.println("Wrong cow position");
			return;
		}
		this.getCows()[index] = null;
	}
		
	// Returns a Pig at position index
	public ALivestock getPigAt(int index) {
		if (index < 0 || index > this.getPigs().length - 1) {
			System.out.println("Wrong pig position");
			return null;
		}
		return this.getPigs()[index];
	}

	// Returns a Cow at position index
	public ALivestock getCowAt(int index) {
		if (index < 0 || index > this.getCows().length - 1) {
			System.out.println("Wrong cow position");
			return null;
		}
		return this.getCows()[index];
	}

	// Finds first empty position for a Pig
	private int getFreePigPos() {
		for (int index = 0; index < this.getPigs().length; index++) {
			if (this.getPigAt(index) == null) {
				return index;
			}
		}
		return -1;
	}

	// Finds first empty position for a Cow
	private int getFreeCowPos() {
		for (int index = 0; index < this.getCows().length; index++) {
			if (this.getCowAt(index) == null) {
				return index;
			}
		}
		return -1;
	}

	// Adds Livestock ls to the barn, differentiates between Pig and Cow
	public boolean add(ALivestock ls) {
		if(ls instanceof Pig) {
			int pos = this.getFreePigPos();
			if (pos == -1) {
				System.out.println("Pig \"" + ls.getName() + "\" doesn't fit, barn is full!");
				return false;
			}
			this.setLivestockAt(pos, ls);
			System.out.println("Pig \"" + ls.getName() + "\" was placed into the barn.");
			return true;
		}
		if(ls instanceof Cow) {
			int pos = this.getFreeCowPos();
			if (pos == -1) {
				System.out.println("Cow \"" + ls.getName() + "\" doesn't fit, barn is full!");
				return false;
			}
			this.setLivestockAt(pos, ls);
			System.out.println("Cow \"" + ls.getName() + "\" was placed into the barn.");
			return true;
		}
		return false;
	}

	// Find a Pig via its name
	private int getPigPosByName(String name) {
		for(int index = 0;index<this.getPigs().length;index++ ) {
			if(this.getPigs()[index] == null) continue;
			if(this.getPigs()[index].getName().equals(name)) return index;
		}
		return -1;
	}
	
	// Find a Cow via its name
	private int getCowPosByName(String name) {
		for(int index = 0;index<this.getCows().length;index++ ) {
			if(this.getCows()[index] == null) continue;
			if(this.getCows()[index].getName().equals(name)) return index;
		}
		return -1;
	}
	
	// Sells a Pig by its name
	public int sellPigByName(String name) {
		int pigIndex = this.getPigPosByName(name);
		if(pigIndex == -1) return 0;
		int erloes = this.getPigAt(pigIndex).getSalesPrice();
		this.removePigAt(pigIndex);
		return erloes;
	}

	// Sells a Cow by its name
	public int sellCowByName(String name) {
		int cowIndex = this.getCowPosByName(name);
		if(cowIndex == -1) return 0;
		int erloes = this.getCowAt(cowIndex).getSalesPrice();
		this.removeCowAt(cowIndex);
		return erloes;
	}

}
