package ml.assmann.farm;

import ml.assmann.farm.fauna.*;
import ml.assmann.farm.flora.*;

public class FarmMainEating {

	public static void main(String[] args) {

		// Animals
		Cow cow = new Cow("Berta", 700, true, 1000, 10);
		Pig pig = new Pig("Bernd", 500, false, 1000);
		Dog dog = new Dog("Hasso", 50, false);

		// Vegetables
		Potato potato = new Potato(40);
		Carrot carrot = new Carrot(40);

		// Farmer
		Farmer farmer = new Farmer("Gitte Haenning", 50, true, 159, 30);

		// Farmer info
		System.out.println();
		System.out.println(farmer);
		
		// Status
		System.out.println(cow);
		System.out.println(pig);
		System.out.println(dog);
		System.out.println("-------------------");
		
		// Eat
		cow.eat(potato);
		cow.eat(carrot); 
		cow.eat(pig); // herbivore error
		System.out.println("-------------------");
		
		pig.eat(potato);
		pig.eat(carrot);
		pig.eat(cow); // herbivore error
		System.out.println("-------------------");
		
		dog.eat(potato); // carnivore error
		dog.eat(carrot); // carnivore error
		dog.eat(pig);
//		dog.eat(dog); // dog not edible
		System.out.println("-------------------");
		
		// Status
		System.out.println(cow);
		System.out.println(pig);
		System.out.println(dog);

	}
}
