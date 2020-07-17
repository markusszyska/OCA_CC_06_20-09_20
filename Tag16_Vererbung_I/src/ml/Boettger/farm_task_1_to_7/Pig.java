package ml.Boettger.farm_task_1_to_7;

public class Pig 
{
	// attributes
	public String name;
	public float weight;				// in kg
	public int age;
	
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
		this.setName(name);
		this.setWeight(weight);
		this.setAge(age);
		
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
	//
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
			"\t-----------------------------------------------------------\n";		
	}

	public void grunt() 
	{
		System.out.println("\toooiiinnnk");
	}
}
