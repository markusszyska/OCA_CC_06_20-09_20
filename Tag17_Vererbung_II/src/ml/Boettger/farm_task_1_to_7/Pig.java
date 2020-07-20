package ml.Boettger.farm_task_1_to_7;

public class Pig 
{
	// attributes
	private String name;				// standard "Snowball"
	private float weight;				// standard "300" in kg
	private int age;					// standard 18
	private float selling_price;			// in €
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public float getWeight() 
	{
		return weight;
	}

	public void setWeight(float weight) 
	{
		this.weight = weight;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public float getSelling_price() 
	{
		return selling_price;
	}

	public void setSelling_price(float selling_price) 
	{
		this.selling_price = selling_price;
	}

	//#########################################################################
	// constructors	
	//#########################################################################
	Pig() 
	{
		this("Snowball");
	}

	Pig(String name)
	{
		this(name, 300.00f);
	}
	
	Pig(String name, float weight)
	{
		this(name, weight, 18);
	}
	
	Pig(String name, float weight, int age)
	{
		this(name, weight, age, 150.00f);
	}
	
	Pig(String name, float weight, int age, float selling_price)
	{
		this.setName(name);
		this.setWeight(weight);
		this.setAge(age);
		this.setSelling_price(selling_price);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}
	
	//#########################################################################
	// other methods
	//#########################################################################
	
	//#########################################################################
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tPig\n"                                                       +
			"\t-----------------------------------------------------------\n" + 	
			"\tname               = " + this.getName()                 + "\n" +
			"\tweight             = " + this.getWeight()               + "\n" +
			"\tage                = " + this.getAge()                  + "\n" +
			"\tselling_price      = " + this.getSelling_price()        + "\n" +
			"\t-----------------------------------------------------------\n";		
	}
	
	//#########################################################################
	public String short_print_pig()
	//
	//	print all pig data in one short line.
	//
	//#########################################################################
	{
		return "name: "            + this.getName()   +
			   " weight: "         + this.getWeight() + 
			   " age: "            + this.getAge()    +
			   " selling_price = " + this.getSelling_price();
	}
	
	//#########################################################################
	public void eat(Potato p)
	//
	//#########################################################################
	{
		this.setWeight(this.getWeight() + p.getBulb_size());
	}
	
	//#########################################################################
	public void eat(Carrot c)
	//
	//#########################################################################
	{
		this.setWeight(this.getWeight() + c.getBeet_length());
	}
		
	//#########################################################################
	public void grunt() 
	//
	//#########################################################################
	{
		System.out.println("\toooiiinnnk");
	}
	
	
}
