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
		this.arr_Cows = arr_Cows;
	}

	public Pig[] getArr_Pigs()
	{
		return arr_Pigs;
	}

	public void setArr_Pigs(Pig[] arr_Pigs)
	{
		this.arr_Pigs = arr_Pigs;
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
		this(null);
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
			"\tdoor of barn = " + this.getDoor_of_barn()               + "\n" +
			"\tcows of barn = " + this.getArr_Cows()				   + "\n" +
			"\tpigs of barn = " + this.getArr_Pigs()                   + "\n" +
			"\t-----------------------------------------------------------\n";
	}
}
