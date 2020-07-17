package ml.salastexido.farm;


public class FarmSimulator {
	
	public static void main(String[] args) {
		
		//Create Barn instance
		Barn barn = new Barn(1);
		
		//Create 3 Cows
		Cow cow1 = new Cow(1,"COW1",300,1400.65,"BLACK","WHITE",10);
		Cow cow2 = new Cow(2,"COW2",90,600.20,"BLACK","WHITE",5);
		Cow cow3 = new Cow(3,"COW3",500,2400.65,"BRAUN","WHITE",25);
		
		//Create 2 Pigs
		Pig pig1 = new Pig(1,"PIG1",100,200.40,2);
		Pig pig2 = new Pig(2,"PIG2",150,250.90,5);
		
		
		//Create Farm instance
		Farm farm = new Farm(1,barn);
		Farmer farmer = new Farmer(1,farm,"Paul");
		System.out.println("The Farmer have " +farmer.getFarm().getBarn().getCowSize() + " Cows");
		System.out.println("The Farmer have " +farmer.getFarm().getBarn().getPigSize() + " Pigs");
		System.out.println("ADDING NEWS COWS TO BARN");
		farmer.getFarm().getBarn().insertAnimal(cow1, "COW");
		farmer.getFarm().getBarn().insertAnimal(cow2, "COW");
		farmer.getFarm().getBarn().insertAnimal(cow3, "COW");
		System.out.println("ADDING NEWS PINGS TO BARN");
		farmer.getFarm().getBarn().insertAnimal(pig1, "PIG");
		farmer.getFarm().getBarn().insertAnimal(pig2, "PIG");
		System.out.println("The Farmer have " +farmer.getFarm().getBarn().getCowSize() + " Cows");
		System.out.println("The Farmer have " +farmer.getFarm().getBarn().getPigSize() + " Pigs");
		farmer.getFarm().getBarn().showAnimals("COW");
		farmer.getFarm().getBarn().showAnimals("PIG");
	}
}
