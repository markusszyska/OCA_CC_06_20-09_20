package ml.schulzke.creature;

public class Creature {
	private CreatureType type;
	private boolean hungry;

	public CreatureType getType() {
		return type;
	}

	public void setType(CreatureType type) {
		this.type = type;
	}

	public Creature(CreatureType type) {
		this.setHungry(true);
		this.type = type;
	}
	
	public boolean isHungry() {

		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	public void printHungry() {
		if(this.isHungry()) {
			System.out.println(this.getType().getName()+" ist hungrig!");
		}else {
			System.out.println(this.getType().getName()+" ist satt!");
		}
	}
	
	public void feedCreature() {
		this.setHungry(false);
	}
	
	public String printCreature() {
		String out = "";
		if(this.getType().getName().equals("Heady")) {
			if(this.isHungry()) {
				out = ("  X.X  ");
			}else {
				out = ("  O.O  ");
			}
		}else if(this.getType().getName().equals("Footy")) {
			if(this.isHungry()) {
				out = ("(o).(o)");
			}else {
				out = ("(.).(.)");
			}
		}else if(this.getType().getName().equals("Trunky")) {
			if(this.isHungry()) {
				out = ("  ---O  ");
			}else {
				out = ("  ---o  ");
			}
		}
		return out;
	}

}
