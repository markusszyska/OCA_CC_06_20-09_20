package ml.schulzke.creature;

public class Stable {
	private Creature creature;
	private Stable nextStable;
	
	public Stable getNextStable() {
		return nextStable;
	}
	public void setNextStable(Stable nextStable) {
		this.nextStable = nextStable;
	}
	public Creature getCreature() {
		return creature;
	}
	public void setCreature(Creature creature) {
		this.creature = creature;
	}
	
	public Stable(int stablesToCreate) {
		if(stablesToCreate > 1) {
			this.setNextStable(new Stable(--stablesToCreate));
		}
	}
	
	public void fillToEmptyStable(Creature creature) {
		if(this.getCreature() == null) {
			this.setCreature(creature);
		}else if(this.getNextStable() != null) {
			this.getNextStable().fillToEmptyStable(creature);
		}else {
			System.out.println("All Stables are full!");
		}		
	}
	
	public void printAllCreatures() {
		if(this.getCreature() != null) {
			System.out.println("+--------+");
			System.out.println("|"+this.getCreature().printCreature()+" |");
			System.out.println("+--------+");
			this.getCreature().printHungry();
		}else {
			System.out.println("+--------+");
			System.out.println("|        |");
			System.out.println("+--------+");
			System.out.println("No Creature in Stable!");
		}
		if(this.getNextStable()!=null) {
			this.getNextStable().printAllCreatures();
		}
	}
	
	public void feedCreatures(int food) {
		System.out.println("\nFeeding with "+food+" (left)");
		if(food > 0) {
			if(this.getCreature() != null) {
				if(this.getCreature().isHungry()) {
					System.out.println(this.getCreature().getType().getName()+" was fed...");
					this.getCreature().feedCreature();
					food--;
				}else {
					System.out.println(this.getCreature().getType().getName()+" is not hungry...");
				}
			}else {
				System.out.println("No Creature to feed in Stable!");
			}
			if(this.getNextStable()!=null) {
				this.getNextStable().feedCreatures(food);
			}else {
				System.out.println("Some leftover food!("+food+")");
			}
		}else {
			if(this.getCreature() != null) {
				System.out.println("No food left to feed "+this.getCreature().getType().getName()+"!");
			}else {
				System.out.println("All creatures fed and no leftover food!");
			}
			
		}
	}
}
