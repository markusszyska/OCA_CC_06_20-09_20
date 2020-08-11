package ocaBuch;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestDogs {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>(); // create and populate
		dogs.add(new Dog("boi", 30, 6));
		dogs.add(new Dog("tyri", 40, 12));
		dogs.add(new Dog("charis", 120, 7));
		dogs.add(new Dog("aiko", 50, 10));
		dogs.add(new Dog("clover", 35, 12));
		dogs.add(new Dog("mia", 15, 4));
		dogs.add(new Dog("zooey", 45, 8));

		// run a few OLD "queries"
		System.out.println("all dogs " + dogs);
		System.out.println("Old Querries");
		System.out.println("min age 7 " + minAge(dogs, 7));
		System.out.println("max wght. " + maxWeight(dogs, 40).toString());
		System.out.println("n startsWith c " + nameStartsWiths(dogs, "t"));

		// run a few lambda queries
		System.out.println("Lambda Querries");
		// dogQuery(ArrayList<Dog>, Predicate<Dog>)
		System.out.println("age >= 7 " + dogQuery(
				dogs, //ArrayList
				doggie -> doggie.getAge() >=7 //Lambda Expression
				));
		
		Predicate<Dog> pred = dog -> dog.getAge() >=7;
		for(Dog d : dogs) {
			if(pred.test(d)) {
				System.out.println(d.getName() + " ist aelter als 7");
			}
		}
		System.out.println("w <= 40 " + dogQuery(dogs, d -> d.getWeight() <= 40));
		System.out.println("n startsWith t "
				+ dogQuery(dogs, d -> d.getName().startsWith("t")));
		
		System.out.println("unter - ueber: " + dogQuery(dogs,
				d -> {return d.getWeight() <=40 && d.getAge() >= 5;}
		));
	}

	public static ArrayList<Dog> minAge(ArrayList<Dog> dogList, int testFor) {
		ArrayList<Dog> result = new ArrayList<Dog>(); // do a minimum age query
		for (Dog d : dogList) {
			if (d.getAge() >= testFor) { // the key moment!
				result.add(d);
			}
		}
		return result;
	}

	public static ArrayList<Dog> maxWeight(ArrayList<Dog> dogList, int testFor) {
		ArrayList<Dog> result = new ArrayList<>(); // do a max weight query
		for (Dog d : dogList)
			if (d.getWeight() <= testFor) // the key moment!
				result.add(d);
		return result;
	}

	public static ArrayList<Dog> nameStartsWiths(ArrayList<Dog> dogList, String testFor) {
		ArrayList<Dog> result = new ArrayList<>(); // do a max weight query
		for (Dog d : dogList)
			if (d.getName().startsWith(testFor)) // the key moment!
				result.add(d);
		return result;
	}

	// declare a new lambda powered, generic, multi-purpose query method
	public static ArrayList<Dog> dogQuery(ArrayList<Dog> dogList, Predicate<Dog> lambdaExpression){
		ArrayList<Dog> result = new ArrayList<>();
		// do an "on the fly" query
		for(Dog d : dogList) {
			if(lambdaExpression.test(d)) {
				result.add(d);
			}
		}
		return result;
	}
	
}
