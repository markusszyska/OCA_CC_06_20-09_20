package ml.boettger.farm_task_abstract_classes.fauna;
import ml.boettger.farm_task_abstract_classes.FarmMain;
import ml.boettger.farm_task_abstract_classes.flora.APlants;

public class Pig extends AAnimals
{
	//#########################################################################
	// constructors	
	//#########################################################################
	public Pig() 
	{
		this("Snowball");
	}

	public Pig(String name)
	{
		this(name, 300.00f);
	}
	
	public Pig(String name, float weight)
	{
		this(name, weight, 18);
	}
	
	public Pig(String name, float weight, int age)
	{
		this(name, weight, age, 150.00f);
	}
	
	public Pig(String name, float weight, int age, float selling_price)
	{
		this.setS_name(name);
		this.setF_weight(weight);
		this.setI_age(age);
		this.setF_selling_price(selling_price);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}
	
	//#########################################################################
	public String toString()
	//
	//#########################################################################
	{
		return super.toString() +
		"\t-----------------------------------------------------------\n" +	
		"\t\tPig\n"                                                       +
		"\t-----------------------------------------------------------\n";	
	}
	
	//#########################################################################
	public void makeNoise() 
	//
	//#########################################################################
	{
		System.out.println("\toooiiinnnk");		
	}	
	
	//#########################################################################
	public void eat(APlants a)
	//
	//#########################################################################
	{
		System.out.println("\t" + this.getS_name() + " eats a " +
			a.getClass().getSimpleName());	
		a.eaten();
	}
}
