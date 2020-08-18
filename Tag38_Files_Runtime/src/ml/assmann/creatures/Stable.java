package ml.assmann.creatures;

public class Stable {
	/*
	 * Attributes
	 */
	// Aufgabe 3a
	Creature inhabitant = null;
	Stable nextStable = null;
	
	/*
	 * Getters/Setters
	 */
	private Creature getInhabitant() {
		return inhabitant;
	}
	
	private void setInhabitant(Creature inhabitant) {
		this.inhabitant = inhabitant;
	}
	
	private Stable getNextStable() {
		return nextStable;
	}
	
	private void setNextStable(Stable nextStable) {
		this.nextStable = nextStable;
	}
	
	/*
	 * Constructors
	 */
	// Aufgabe 3b
	public Stable(int amountStable) {
		if(amountStable>1) {
			this.setNextStable(new Stable(amountStable-1));			
		}
	}
	
	/*
	 * Methods
	 */
	// Aufgabe 3c
	public void printStable() {
		if(this.getInhabitant() == null) {
			PrintHelper.printLine();
			PrintHelper.printEmptyCell();
			PrintHelper.printLine();
		} else {
			PrintHelper.printLine();
			this.getInhabitant().printCreature();
			PrintHelper.printLine();
		}
		if(this.getNextStable() != null) {
			this.getNextStable().printStable();
		}
	}
	
	// Aufgabe 3d
	public void addCreature(Creature c) {
		if(this.getInhabitant() == null) {
			this.setInhabitant(c);
		} else {
			if(this.getNextStable() != null) {
				this.getNextStable().addCreature(c);
			} else {
				System.out.println("Stable is full, no room for new creature!");
			}
		}
	}
	
	// Aufgabe 3e
	public void feedCreatures(int trayNumber) {
		if(this.getInhabitant() != null) {
			if(this.getInhabitant().isHungry()) {
				if(trayNumber > 0) {
					this.getInhabitant().feedCreature();
					trayNumber--;					
				} else {
					System.out.println("Not enough food, some creatures go hungry!");
					return;
				}
			}
		} 
		if(this.getNextStable() != null) {
			this.getNextStable().feedCreatures(trayNumber);				
		} else {
			if(trayNumber > 0) {
				System.out.println("All creatures are fed, some food is left!");
			} else {
				System.out.println("All creatures are fed, no food left!");
			}
		}
	}
	
}
