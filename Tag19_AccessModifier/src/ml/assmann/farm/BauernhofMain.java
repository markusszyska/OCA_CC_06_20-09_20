package ml.assmann.farm;


import ml.assmann.farm.fauna.*;
import ml.assmann.farm.flora.*;
import ml.assmann.farm.objekte.*;

public class BauernhofMain {
	public static void main(String[] args) {
		
		/*
		 * Variables
		 */
		
		// Cows
		Cow cow1 = new Cow("Berta", 700, true, 1000, 10);
		Cow cow2 = new Cow("Rosa", 800, true, 2000, 10);
		Cow cow3 = new Cow("Heinz", 900, false, 3000, 10);
		
		// Pigs
		Pig pig1 = new Pig("Bernd", 500, false, 1000);
		Pig pig2 = new Pig("Holger", 750, false, 2000);
		Pig pig3 = new Pig("Molli", 800, true, 3000);
		Pig pig4 = new Pig("Pig4", 100, false, 1);
		Pig pig5 = new Pig("Pig5", 100, false, 1);
		Pig pig6 = new Pig("Pig6", 100, false, 1);
		Pig pig7 = new Pig("Pig7", 100, false, 1);
		Pig pig8 = new Pig("Pig8", 100, false, 1);
		Pig pig9 = new Pig("Pig9", 100, false, 1);
		Pig pig10 = new Pig("Pig10", 100, false, 1);
		Pig pig11 = new Pig("Pig11", 100, false, 1);
		Pig pig12 = new Pig("Pig12", 100, false, 1);
		Pig pig13 = new Pig("Pig13", 100, false, 1);
		
		// Potatoes
		Potato potato1 = new Potato(10);
		Potato potato2 = new Potato(20);
		Potato potato3 = new Potato(30);
		Potato potato4 = new Potato(40);
		
		// Carrots
		Carrot carrot1 = new Carrot(10);
		Carrot carrot2 = new Carrot(20);
		Carrot carrot3 = new Carrot(30);
		Carrot carrot4 = new Carrot(40);
		
		// Farmers
		Farmer farmer = new Farmer("Gitte Haenning", 50, true, 159, 30);
		Farmer farmer2 = new Farmer("Ruediger", 80, false, 180, 40);
		
		// Farmer info
		System.out.println();
		System.out.println(farmer);		
		System.out.println(farmer2);		
		
		// Baby testing
		System.out.println("\n=======breeding tests=========");
		Livestock piggy1 = pig1.procreate(pig3);
		Livestock piggy2 = pig1.procreate(pig2);
		Livestock cowie1 = cow1.procreate(cow3);
		Livestock cowie2 = cow1.procreate(cow2);
		
		System.out.println("Piggy 1: " + piggy1);
		System.out.println("Piggy 2: " + piggy2);
		System.out.println("Cowie 1: " + cowie1);
		System.out.println("Cowie 2: " + cowie2);
		
		// Feeding tests
		System.out.println("\n=======feeding tests=========");
		farmer.feed(cow1, carrot1);
		farmer.feed(cow2, carrot4);
		farmer.feed(cow3, potato3);
		
		farmer.feed(pig1, carrot1);
		farmer.feed(pig2, carrot4);
		farmer.feed(pig3, potato3);
				
		System.out.println("\n=======Fill barn=========");
		// Put cows into the barn
		if(farmer.add(cow1)) cow1 = null;
		if(farmer.add(cow2)) cow2 = null;
		if(farmer.add(cow3)) cow3 = null;
		
		// Put pigs into the barn
		if(farmer.add(pig1)) pig1 = null;
		if(farmer.add(pig2)) pig2 = null;
		if(farmer.add(pig3)) pig3 = null;
		if(farmer.add(pig4)) pig4 = null;
		if(farmer.add(pig5)) pig5 = null;
		if(farmer.add(pig6)) pig6 = null;
		if(farmer.add(pig7)) pig7 = null;
		if(farmer.add(pig8)) pig8 = null;
		if(farmer.add(pig9)) pig9 = null;
		if(farmer.add(pig10)) pig10 = null;
		if(farmer.add(pig11)) pig11 = null;
		if(farmer.add(pig12)) pig12 = null;
		if(farmer.add(pig13)) pig13 = null;

		// Farmer gets some feeding buckets
		Bucket bucket = new Bucket(7,4); // zu wenig
		Bucket eimer2 = new Bucket(10,10); // zu viel
		Bucket eimer3 = new Bucket(9,9); // genau richtig
		
		// feeding time
		System.out.println("\n=======feeding time=========");
		System.out.println(bucket);
		farmer.feedAllLivestock(bucket);
		System.out.println(bucket);
		
		// sell livestock
		System.out.println("\n=======Sell livestock=========");
		farmer.sellCowByName("Heinz");
		farmer.sellCowByName("Anna");
		farmer.sellCowByName("Berta");
		farmer.sellPigByName("Harry");
		farmer.sellPigByName("Molli");
		farmer.sellPigByName("Bernd");
		farmer.sellPigByName("Pig8");
		farmer.sellPigByName("Pig9");
		farmer.sellPigByName("Pig10");

		// Show balance
		System.out.println("\nBalance of " + farmer.getName() + ": " + farmer.getBalance() + " €");
		
		// Add more pigs to the barn
		System.out.println("\n=======Refill barn=========");
		if(farmer.add(pig11)) pig11 = null;
		if(farmer.add(pig12)) pig12 = null;
		if(farmer.add(pig13)) pig13 = null;
		
		// feeding time
		System.out.println("\n=======feeding time #2=========");
		System.out.println(eimer2);
		farmer.feedAllLivestock(eimer2);
		System.out.println(eimer2);
		
		// feeding time
		System.out.println("\n=======feeding time #3=========");
		System.out.println(eimer3);
		farmer.feedAllLivestock(eimer3);
		System.out.println(eimer3);
				
	}
}
