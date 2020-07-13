package ml.Boettger.farm;

public class Barn 
{
	private static int id;				// id of the barn
	private Door door_of_barn; 			// door of the barn

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
	
	Barn()
	{
		this(null);
	}
	
	Barn(Door door_of_barn)
	{
		id = this.getId() + 1;
		this.setDoor_of_barn(door_of_barn);		
		
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
			"\t-----------------------------------------------------------\n";
	}


	
}
