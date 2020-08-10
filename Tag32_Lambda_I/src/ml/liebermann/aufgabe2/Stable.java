package ml.liebermann.aufgabe2;

import ml.liebermann.aufgabe2.print.PrintHelper;

public class Stable {

	private Creature creature = null;

	private Stable stable;

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	public Stable getStable() {
		return stable;
	}

	public void setStable(Stable stable) {
		this.stable = stable;
	}

	public Stable() {
		this(0);
	}

	public Stable(int stables) {
		if (stables > 1) {
			this.setStable(new Stable(stables - 1));
		}
	}

	public void addCreature(Creature c) {
		if (this.getCreature() == null) {
			this.setCreature(c);
		} else if (this.getStable() != null) {
			this.getStable().addCreature(c);
		} else {
			System.out.println("All stables are full");
		}
	}

	public void printStable() {
		System.out.println("+----------------------------+");
		if (this.getCreature() != null) {
			this.getCreature().printCreature();
		} else {
			PrintHelper.printEmptyCell();
		}
		System.out.println("+----------------------------+");

	}

	public void feedCreatures(int futter) {

		// Wenn das Futter noch nicht alle ist
		if (futter > 0) {
			// Wenn eine Kreatur in dem Stall ist
			if (this.getCreature() != null) {
				// Wenn die Kreatur hungrig ist
				if (this.getCreature().isIstHungrig()) {
					this.getCreature().feedCreature();
					futter -= 1;
				}
			}
			// Wenn der nächste Stall nicht leer ist
			if (this.getStable() != null) {
				// Füttere Kreaturen im Stall
				this.getStable().feedCreatures(futter);
			} else {
				// Ausgabe futter übrig
				System.out.println("All creatures are fed, some food left");
			}
		} else {
			// Wenn der Stall nicht leer ist
			if (this.getStable() != null) {
				if (this.getStable().getCreature() != null) {
					System.out.println("Not all creatures are fed");
				}
			} else if (this.getCreature() != null) {
				if(!this.getCreature().isIstHungrig())
				System.out.println("All creatures are fed");
			}
		}
	}

	@Override
	public String toString() {
		if (this.getStable() != null)
			this.getStable().toString();
		printStable();
		return "";

	}

}
