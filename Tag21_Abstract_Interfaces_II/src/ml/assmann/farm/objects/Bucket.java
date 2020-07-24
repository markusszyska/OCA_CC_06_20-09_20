package ml.assmann.farm.objects;

import ml.assmann.farm.flora.*;

public class Bucket {
	
	/*
	 * Attributes
	 */
	private Vegetable[] carrots;
	private Vegetable[] potatoes; 
	private int amountCarrots;
	private int amountPotatoes;
	
	
	/*
	 * Getters/Setters
	 */
	public Vegetable[] getCarrots() {
		return this.carrots;
	}
	
	private void setCarrots(Vegetable[] carrots) {
		this.carrots = carrots;
	}
	
	public Vegetable[] getPotatoes() {
		return this.potatoes;
	}
	
	private void setPotatoes(Vegetable[] potatoes) {
		this.potatoes = potatoes;
	}
	
	public int getAmountCarrots() {
		return amountCarrots;
	}

	public void setAmountCarrots(int amountCarrots) {
		this.amountCarrots = amountCarrots;
	}

	public int getAmountPotatoes() {
		return amountPotatoes;
	}

	public void setAmountPotatoes(int amountPotatoes) {
		this.amountPotatoes = amountPotatoes;
	}
	
	/*
	 * Constructors
	 */
	
	public Bucket() {
		this(10,10);
	}
	
	public Bucket(int amountCarrots, int amountPotatoes) {
		this.setAmountCarrots(amountCarrots);
		this.setAmountPotatoes(amountPotatoes);
		this.setCarrots(new Carrot[10]);
		this.setPotatoes(new Potato[10]);
		this.fill(amountCarrots, amountPotatoes);
	}
	
	/*
	 * Methods
	 */
	// Places a Vegetable v into the bucket at index, differentiates between Carrot and Potato
	private void setVegetableAt(int index, Vegetable v) {
		if(v instanceof Carrot) {
			if(index < 0 || index > this.getCarrots().length) {
				System.out.println("Falsche Karottenposition");
				return;
			}
			this.getCarrots()[index] = v;
		}
		if(v instanceof Potato) {
			if(index < 0 || index > this.getPotatoes().length) {
				System.out.println("Falsche Kartoffelposition");
				return;
			}
			this.getPotatoes()[index] = v;
		}
	}
	
	// Empties the bucket and fills it with amountCarrors Carrot and amountPotatoes Potato Objects of random weights
	public void fill(int amountCarrots, int amountPotatoes) {
		for(int index=0;index<this.getCarrots().length;index++) {
			if(index < amountCarrots) this.setVegetableAt(index, new Carrot((int)(Math.random()*50+1)));
			else this.setVegetableAt(index, null);
		}
		for(int index=0;index<this.getPotatoes().length;index++) {
			if(index < amountPotatoes) this.setVegetableAt(index, new Potato((int)(Math.random()*50+1)));
			else this.setVegetableAt(index, null);
		}
	}
	
	// Last Carrot gets eaten and removed for GC
	public void eatCarrot() {
		this.setVegetableAt(this.getAmountCarrots()-1, null);
		this.setAmountCarrots(this.getAmountCarrots()-1);
	}
	
	// Last Potato gets eaten and removed for GC
	public void eatPotato() {
		this.setVegetableAt(this.getAmountPotatoes()-1, null);
		this.setAmountPotatoes(this.getAmountPotatoes()-1);
	}

	public String toString() {
		return "This bucket is filled with " + this.getAmountCarrots() + " carrots and " + this.getAmountPotatoes() + " potatoes";
	}
	
	
	
	
	
	
}
