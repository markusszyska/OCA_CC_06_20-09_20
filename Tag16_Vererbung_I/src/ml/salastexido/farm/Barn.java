package ml.salastexido.farm;

public class Barn {
	private int id;
	private Cow[] cows;
	private int cowSize;
	private Pig[] pigs;
	private int pigSize;
	public static final String COW = "COW";
	public static final String PIG = "PIG";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cow[] getCows() {
		return cows;
	}

	public void setCows(Cow[] cows) {
		this.cows = cows;
	}

	public Pig[] getPigs() {
		return pigs;
	}

	public void setPigs(Pig[] pigs) {
		this.pigs = pigs;
	}

	public Barn(int id) {
		super();
		this.id = id;
		this.cowSize = 0;
		this.pigSize = 0;
		this.cows = new Cow[10];
		this.pigs = new Pig[10];
	}

	public void insertAnimal(Animal animal, String type) {
		switch (type) {
		case COW:
			if (this.cows.length == this.cowSize) {
				System.out.println("The Barn cannot have more Cows");
			} else {
				this.cows[this.cowSize] = (Cow) animal;
				this.cowSize++;
			}
			break;
		case PIG:
			if (this.pigs.length == this.pigSize) {
				System.out.println("The Barn cannot have more Pigs");
			} else {
				this.pigs[this.pigSize] = (Pig) animal;
				this.pigSize++;
			}
			break;
		default:
			System.out.println("Invalid Animal type..");
			break;
		}
	}
	
	public void showAnimals(String type) {
		switch (type) {
		case COW:
			for(Cow cow:this.cows) {
				if(cow!=null)
					System.out.println(cow);
			}
			break;
		case PIG:
			for(Pig pig:this.pigs) {
				if(pig!=null)
					System.out.println(pig);
			}
			break;
		default:
			System.out.println("Invalid Animal type..");
			break;
		}
	}

	public String toString() {
		return "Barn Object\n" + "id: " + this.getId();
	}

	public int getCowSize() {
		return cowSize;
	}

	public void setCowSize(int cowSize) {
		this.cowSize = cowSize;
	}

	public int getPigSize() {
		return pigSize;
	}

	public void setPigSize(int pigSize) {
		this.pigSize = pigSize;
	}

}
