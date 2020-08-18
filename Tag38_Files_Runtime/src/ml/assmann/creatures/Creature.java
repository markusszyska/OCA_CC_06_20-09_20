package ml.assmann.creatures;

public class Creature {

	/*
	 * Attributes
	 */
	// Aufgabe 2a
	private CreatureType type;
	private boolean hungry;

	/*
	 * Getters/Setters
	 */
	private CreatureType getType() {
		return type;
	}

	private void setType(CreatureType type) {
		this.type = type;
	}

	// Aufgabe 2b
	public boolean isHungry() {
		return hungry;
	}

	private void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	/*
	 * Constructors
	 */
	public Creature() {
		this(CreatureType.FOOTY);
	}

	// Aufgabe 2c
	public Creature(CreatureType type) {
		this.setType(type);
		this.setHungry(true);
	}

	/*
	 * Methods
	 */

	// Aufgabe 2d
	public void feedCreature() {
		this.setHungry(false);
		System.out.println(this.getType() + " was fed.");
	}

	// Aufgabe 2e
	public void printCreature() {
		switch (this.getType()) {
		case HEADY: {
			this.printHeady();
			break;
		}
		case FOOTY: {
			this.printFooty();
			break;
		}
		case TRUNKY: {
			this.printTrunky();
			break;
		}
		}
	}

	private void printHeady() {
		if (this.isHungry()) {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|          | @  @ |          |");
			System.out.println("|          |      |          |");
			System.out.println("|          | ,--, |          |");
			System.out.println("|           \\____/           |");
		} else {
			System.out.println("|           ||||||           |");
			System.out.println("|          |      |          |");
			System.out.println("|         |  @  @  |         |");
			System.out.println("|         |        |         |");
			System.out.println("|         \\  `--´  /         |");
			System.out.println("|          \\______/          |");
		}
	}

	private void printFooty() {
		if (this.isHungry()) {
			System.out.println("|       *************        |");
			System.out.println("|     **    @   @    **      |");
			System.out.println("|   **     .-----.      **   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		} else {
			System.out.println("|      ***************       |");
			System.out.println("|   ***     @   @     ***    |");
			System.out.println("|  *                     *   |");
			System.out.println("|  *       `-----´       *   |");
			System.out.println("|   *********************    |");
			System.out.println("|    _|  _|  _|_  |_  |_     |");
		}
	}

	private void printTrunky() {
		if (this.isHungry()) {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( ~~~                  \\  |");
			System.out.println("|   \\_____________________/  |");
			System.out.println("|                            |");
		} else {
			System.out.println("|  @    @                    |");
			System.out.println("|   \\___/                    |");
			System.out.println("|   /   \\_________________   |");
			System.out.println("|  ( `-´                  \\  |");
			System.out.println("|   \\                     /  |");
			System.out.println("|    \\___________________/   |");
		}
	}

}
