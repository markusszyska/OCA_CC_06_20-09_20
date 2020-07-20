package ml.Boettger.farm_task_1_to_7;

public class Barn 
{
	private static int id;							// id of the barn

	private final int MAX_COWS = 10;				// max. number of cows
	private final int MAX_PIGS = 10;				// max. number of pigs
	
	private Door door_of_barn; 						// door of the barn
	
	private Cow[] arr_Cows = new Cow[this.getMAX_COWS()];	// array for cows		
	private Pig[] arr_Pigs = new Pig[this.getMAX_PIGS()];	// array for pigs

	//#########################################################################
	// getter and setters
	//#########################################################################
	
	public int getId() 
	{
		return id;
	}
	
	public Door getDoor_of_barn() 
	{
		return door_of_barn;
	}
	
	public void setDoor_of_barn(Door door_of_barn) 
	{
		this.door_of_barn = door_of_barn;
	}

	public Cow[] getArr_Cows()
	{
		return arr_Cows;
	}

	public void setArr_Cows(Cow[] arr_Cows)
	{
		if (arr_Cows == null)
		{	
			for (int i = 0; i < this.getMAX_PIGS(); i++)
			{
				this.arr_Cows[i] = new Cow("", 0);
			}
		}
		else
		{	
			this.arr_Cows = arr_Cows;
		}	
	}

	public Pig[] getArr_Pigs()
	{
		return arr_Pigs;
	}

	//#########################################################################
	public void setArr_Pigs(Pig[] arr_Pigs)
	//#########################################################################
	{
		if (arr_Pigs == null)
		{	
			for (int i = 0; i < this.getMAX_PIGS(); i++)
			{
				this.arr_Pigs[i] = new Pig("", 0.00f, 0, 0.00f);
			}
		}
		else
		{	
			this.arr_Pigs = arr_Pigs;
		}	
	}

	public int getMAX_COWS() 
	{
		return MAX_COWS;
	}

	public int getMAX_PIGS()
	{
		return MAX_PIGS;
	}

	//#########################################################################
	// constructors
	//#########################################################################
	
	Barn()
	{
		this(new Door());
	}
	
	Barn(Door door_of_barn)
	{		
		this(door_of_barn, null); 
	}
	
	Barn(Door door_of_barn, Cow[]arr_cows)
	{
		this(door_of_barn, arr_cows, null);
	}
	
	Barn(Door door_of_barn, Cow[]arr_cows, Pig[]arr_pigs)
	{
		id = this.getId() + 1;
		this.setDoor_of_barn(door_of_barn);
		this.setArr_Cows(arr_cows);
		this.setArr_Pigs(arr_pigs);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}
	
	// public functions ...
	
	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tBarn\n"                                                      +
			"\t-----------------------------------------------------------\n" + 	
			"\tid           = " + this.getId()                         + "\n" +
			"\tMAX_COWS     = " + this.getMAX_COWS()                   + "\n" +
			"\tMAX_PIGS     = " + this.getMAX_PIGS()                   + "\n" +
			"\tdoor of barn = \n" + this.getDoor_of_barn()             + "\n" +
			"\tcows of barn = " + this.getArr_Cows()	 		       + "\n" +
			"\tpigs of barn = " + this.getArr_Pigs()                   + "\n" +
			"\t-----------------------------------------------------------\n";
	}
	
	//#########################################################################
	public void pigs_in_the_barn()
	//
	//	prints all pigs in the barn
	//
	//#########################################################################
	{
		int i = 0;
		System.out.println();
		System.out.println("\tThe pigs in the barn are:");
		System.out.println("\t----------------------------------------------");
		for (Pig p : this.getArr_Pigs())
		{
			i++;
			if (p.getAge() == 0)		// means free place
			{
				System.out.println("\tPlace " + i + " is free.");
			}
			else
			{	System.out.print("\tPig in place " + i + " is: ");
				System.out.println(p.short_print_pig());
			}	
		}
		System.out.println("\t----------------------------------------------");
		System.out.println();
	}
	
	//#########################################################################
	//
	public void place_in_the_barn(Pig... pigs)
	//
	//#########################################################################
	{
		boolean placed = false;
		
		for (Pig p : pigs)
		{	
			placed = false;		
			for (int i = 0; !placed && i < this.getMAX_PIGS(); i++)
			{
				if (this.getArr_Pigs()[i].getAge() == 0) // empty place
				{
					this.getArr_Pigs()[i] = p;			 // place pig
					placed = true;
				}
			}
			if (!placed)
			{	
				System.out.println("\tPig "+ p.getName() + 
					" could not place in the stable," +
					" because the pigsty is full.");
			}
		}	
	}
	
	//#########################################################################
	public void cows_in_the_barn()
	//
	//	prints all cows in the barn
	//
	//#########################################################################
	{
		int i = 0;
		System.out.println();
		System.out.println("\tThe cows in the barn are:");
		System.out.println("\t----------------------------------------------");
		for (Cow c : this.getArr_Cows())
		{
			i++;
			if (c.getI_age() == 0)		// means free place
			{
				System.out.println("\tPlace " + i + " is free.");
			}
			else
			{	System.out.print("\tCow in place " + i + " is: ");
				System.out.println(c.short_print_cow());
			}	
		}
		System.out.println("\t----------------------------------------------");
		System.out.println();
	}
	
	//#########################################################################
	//
	public void place_in_the_barn(Cow... cows)
	//
	//#########################################################################
	{
		boolean placed = false;		
		
		for (Cow c : cows)
		{
			placed = false;
			for (int i = 0; !placed && i < this.getMAX_PIGS(); i++)
			{
				if (this.getArr_Cows()[i].getI_age() == 0)	// empty place
				{
					this.getArr_Cows()[i] = c;				// place cow
					placed = true;
				}
			}
			if (!placed)
			{
				System.out.println("\tCow "+ c.getS_name() + 
					" could not place in the stable," +
					" because the cowshed is full.");
			}
		}	
	}	
	
	//#########################################################################
	//
	public float sell(String name, boolean sell_pig)
	//
	//#########################################################################
	{
		float selling_price = 0.00f;

		for (int i = 0; 
			i < (sell_pig ? this.getMAX_PIGS() : this.getMAX_COWS()); i++)	
		{
			if (sell_pig ? this.getArr_Pigs()[i].getName().equals(name) :
				this.getArr_Cows()[i].getS_name().equals(name))
			{											// pig found by name
				selling_price = 
					sell_pig ? this.getArr_Pigs()[i].getSelling_price() :
						this.getArr_Cows()[i].getF_selling_price();
					
				if (sell_pig)
				{	
					this.getArr_Pigs()[i] = new Pig("", 0.00f, 0);
				}
				else
				{
					this.getArr_Cows()[i] = new Cow("", 0);			
				}
				System.out.println("\t" + (sell_pig ? "Pig " : "Cow ") + name +
						" is sold for " + selling_price + " EURO.");
				return(selling_price);					// return selling price
			}
		}
		System.out.println("\t" + (sell_pig ? "Pig " : "Cow ") + name + 
			" is not in the stable.");
		return(0.00f);									// pig/cow not found
	}

	//#########################################################################
	//
	public void feed(String name, boolean feed_pig,	boolean eat_carrot, 
		Carrot c, Potato p)
	//
	//#########################################################################
	{
		for (int i = 0; 
				i < (feed_pig ? this.getMAX_PIGS() : this.getMAX_COWS()); i++)	
		{
			if (feed_pig ? this.getArr_Pigs()[i].getName().equals(name) :
						   this.getArr_Cows()[i].getS_name().equals(name))
			{											// pig/cow found 
				System.out.println(feed_pig ? 
						this.getArr_Pigs()[i].toString() :
						this.getArr_Cows()[i].toString());		

				if (eat_carrot)
				{
					if (feed_pig)
					{	
						this.getArr_Pigs()[i].eat(c);
					}
					else
					{
						this.getArr_Cows()[i].eat(c);
					}
				}
				else
				{
					if (feed_pig)
					{	
						this.getArr_Pigs()[i].eat(p);
					}
					else
					{
						this.getArr_Cows()[i].eat(p);
					}
				}
				
				System.out.println("\t" + 
					(feed_pig ? "Pig " : "Cow ") + name + " had eaten a " + 
					(eat_carrot ? "carrot" : "potato") + ".");
				
				System.out.println(feed_pig ? 
						this.getArr_Pigs()[i].toString() :
						this.getArr_Cows()[i].toString());		
				return;
			}
		}
		System.out.println("\tPig " + name + " is not in the stable.");
	}
}
