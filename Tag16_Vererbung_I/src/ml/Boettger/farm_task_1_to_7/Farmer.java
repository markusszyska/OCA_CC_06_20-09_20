package ml.Boettger.farm_task_1_to_7;

public class Farmer 
{
	private String name;
	private float weight;				// in kg
	private float height;				// in m
	private int age;					// in years
	private Key key;					// key for the door
	private Farm farm;					// has a farm
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public Key getKey() 
	{
		return key;
	}

	public void setKey(Key k) 
	{
		this.key = k;
	}

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
	
	public float getHeight() 
	{
		return height;
	}
	
	public void setHeight(float height) 
	{
		this.height = height;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;		
	}

	public Farm getFarm()
	{
		return farm;
	}

	public void setFarm(Farm farm)
	{
		this.farm = farm;
	}
	
	//#########################################################################
	// default constructor without paramters
	//#########################################################################
	
	public Farmer()
	{
		this("John Farmer");
	}
	
	//#########################################################################
	// other constructors without paramters
	//#########################################################################
	
	public Farmer(String name)
	{
		this(name, 80.0f);
	}
	
	public Farmer(String name, float weight)
	{
		this(name, weight, 1.85f);
	}
	
	public Farmer(String name, float weight, float height)
	{
		this(name, weight, height, 40);
	}
	
	public Farmer(String name, float weight, float height, int age)
	{
		this(name, weight, height, age, null);
	}

	public Farmer(String name, float weight, float height, int age, Key k)
	{
		this(name, weight, height, age, null, null);
	}
	
	//#########################################################################
	// constructor with all attributes
	//#########################################################################
	
	public Farmer(String name, float weight, float height, int age, Key k,
		Farm f)
	{
		this.setName(name);
		this.setWeight(weight);
		this.setHeight(height);
		this.setAge(age);
		this.setKey(null);
		this.setFarm(null);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}

	// public functions...
		
	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tFarmer                                                   \n" +
			"\t-----------------------------------------------------------\n" + 	
			"\tname = "  + this.getName()                              + "\n" +
			"\tweight =" + this.getWeight()                            + "\n" +
			"\theight =" + this.getHeight()                            + "\n" +
			"\tage = "   + this.getAge()                               + "\n" +
			"\tkey = "   + this.getKey()                               + "\n" +
			"\tfarm = "  + this.getFarm()                              + "\n" +
			"\t-----------------------------------------------------------\n";
	}

	public void set_cow_in_the_barn(Cow c, Barn b)
	{
		{
			System.out.println(
				"\tThe barn is fully booked for cows");
		}
	}
	
	public void set_pig_in_the_barn(Pig p, Barn b)
	{
		{
			System.out.println(
				"\tThe barn is fully booked for cows");
		}
	}
	
	//#########################################################################
	//
	public void milking(Cow c, Float milk_from_cow, Bucket bucket)
	//
	//#########################################################################
	{
		// one day about 20 L milk
		if (bucket.is_filled(c.is_milked(milk_from_cow, bucket)))
		{
			System.out.println("\tFarmer --- Milking successful.");
		}
		else
		{
			System.out.println("\tFarmer --- Milking not successful.");
		}
	}	
}

