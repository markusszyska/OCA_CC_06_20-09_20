package ml.schulzke.adventure;

public class Item {
	
	private boolean wearing;
	private boolean weapon;
	private boolean armor;
	private boolean quest;
	private boolean food;
	private String name;
	private int strength;
	private int weight;
	private int price;
	
	
	
	Item(boolean wearing, boolean weapon, boolean armor, boolean quest, boolean food, String name, int strength, int weight, int price) {
		this.wearing = wearing;
		this.weapon = weapon;
		this.armor = armor;
		this.quest = quest;
		this.food = food;
		this.name = name;
		this.strength = strength;
		this.weight = weight;
		this.price = price;
	}
	
	public boolean isWeapon() {
		return weapon;
	}
	public void setWeapon(boolean weapon) {
		this.weapon = weapon;
	}
	public boolean isArmor() {
		return armor;
	}
	public void setArmor(boolean armor) {
		this.armor = armor;
	}
	public boolean isQuest() {
		return quest;
	}
	public void setQuest(boolean quest) {
		this.quest = quest;
	}
	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
