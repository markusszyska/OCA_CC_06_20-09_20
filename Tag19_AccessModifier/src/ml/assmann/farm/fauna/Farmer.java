package ml.assmann.farm.fauna;

import ml.assmann.farm.flora.*;
import ml.assmann.farm.objekte.*;

public class Farmer extends Mammal {
	/*
	 * Attributes
	 */
	private int height;
	private int age;
	private Farm farm;
	private int balance;
	
	/*
	 * Getters/Setters
	 */
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		if(height < 0) {
			System.out.println("Height must be positive.");
			this.height = 0;
		} else
			this.height = height;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("Age must be postive.");
			this.age = 0;
		} else
			this.age = age;
	}
	
	public Farm getFarm() {
		return this.farm;
	}
	
	private void setFarm(Farm farm) {
		this.farm = farm;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	private void setBalance(int balance) {
		this.balance = balance;
	}
	
	/*
	 * Constructors
	 */
	
	public Farmer(String name, int weight, boolean female, int height, int age) {
		super(name, weight, female);
		this.setHeight(height);
		this.setAge(age);
		this.setFarm(new Farm());
		this.setBalance(0);
	}
	
	/*
	 * Methods
	 */
	
	// Add livestock to the barn
	public boolean add(Livestock ls) {
		return this.getFarm().getBarn().add(ls);		
	}
	
	// Sell a pig by its name
	public void sellPigByName(String name) {
		int proceeds = this.getFarm().getBarn().sellPigByName(name);
		this.setBalance(this.getBalance()+proceeds);
		if(proceeds == 0) {
			System.out.println("Pig \"" + name + "\" not found in the barn.");
		} else {
			System.out.println("Pig \"" + name + "\" sold for " + proceeds + " €.");
		}
	}
	
	// Sell a cow by its name
	public void sellCowByName(String name) {
		int proceeds = this.getFarm().getBarn().sellCowByName(name);
		this.setBalance(this.getBalance()+proceeds);
		if(proceeds == 0) {
			System.out.println("Cow \"" + name + "\" not found in the barn.");
		} else {
			System.out.println("Cow \"" + name + "\" sold for " + proceeds + " €.");
		}
	}
	
	// feed Livestock ls with a Vegetable v
	public void feed(Livestock ls, Vegetable v) {
		ls.eat(v);
		System.out.println(ls.getClass().getSimpleName() + " \"" + ls.getName() + "\" eats a " + v.getClass().getSimpleName() + " with the size of " + v.getWeight() + " and now weights " + ls.getWeight() + " kg");
	}
	
	/*
	 * Feeds all livestock in the barn with potatoes and carrots from the bucket.
	 * Goes through the barn and looks for livestock, when it finds one attempts to feed it.
	 * Gives info if there was enough feed or if it ran out before all livestock
	 * got fed.
	 */
	public void feedAllLivestock(Bucket bucket) {
		int currentAmountCarrots = bucket.getAmountCarrots();
		int currentAmountPotatoes = bucket.getAmountPotatoes();
		boolean carrotStatus = false;
		boolean potatoStatus = false;
		
		// Look for cows in the barn
		for(Livestock cow : this.getFarm().getBarn().getCows()) {
			if(cow == null) {
				continue;
			}
			if(currentAmountCarrots == 0 && !carrotStatus) {
				System.out.println("Ran out of carrots.");
				carrotStatus = true;
			}
			if(currentAmountCarrots > 0) {
				this.feed(cow, bucket.getCarrots()[currentAmountCarrots - 1]);
				bucket.eatCarrot();
				currentAmountCarrots--;
			}
			if(currentAmountPotatoes == 0 && !potatoStatus) {
				System.out.println("Ran out of potatoes.");
				potatoStatus = true;
			}
			if(currentAmountPotatoes > 0) {
				this.feed(cow, bucket.getPotatoes()[currentAmountPotatoes - 1]);
				bucket.eatPotato();
				currentAmountPotatoes--;
			}
			
			// Is the bucket empty?
			if(currentAmountPotatoes == 0 && currentAmountCarrots == 0 && potatoStatus && carrotStatus) {
				System.out.println("Not enough feed available.");
				return;
			}
		}
		
		// Look for pigs in the barn
		for(Livestock pig : this.getFarm().getBarn().getPigs()) {
			if(pig == null) {
				continue;
			}
			if(currentAmountCarrots == 0 && !carrotStatus) {
				System.out.println("Ran out of carrots.");
				carrotStatus = true;
			}
			if(currentAmountCarrots > 0) {
				this.feed(pig, bucket.getCarrots()[currentAmountCarrots - 1]);
				bucket.eatCarrot();
				currentAmountCarrots--;
			}
			if(currentAmountPotatoes == 0 && !potatoStatus) {
				System.out.println("Ran out of potatoes.");
				potatoStatus = true;
			}
			if(currentAmountPotatoes > 0) {
				this.feed(pig, bucket.getPotatoes()[currentAmountPotatoes - 1]);
				bucket.eatPotato();
				currentAmountPotatoes--;
			}
			
			// Is the bucket empty?
			if(currentAmountPotatoes == 0 && currentAmountCarrots == 0 && potatoStatus && carrotStatus) {
				System.out.println("Not enough feed available.");
				return;
			}
		}
		
		// Is feed left over?
		if(currentAmountPotatoes > 0 || currentAmountCarrots > 0) {
			System.out.println("There's feed left over.");
		} else {
			System.out.println("There was just enough feed for all livestock.");
		}
	}
	
	
	public String toString() {
		String sex = (this.isFemale())?"She":"He";
		return "This is farmer " + this.getName() + ". " + sex + " is " + this.getAge() + " years old, " + this.getHeight() + " cm tall and weights " +  this.getWeight() + " kg.";
	}
	
	
}
