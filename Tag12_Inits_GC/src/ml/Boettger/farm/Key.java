package ml.Boettger.farm;

public class Key
{
	private static int id;					// id of the key
	
	// the key number simulated the key beard
	
	private int key_number;					// number of the key
	private Farmer belongs_to_farmer;		// owner of the key
	private Barn belongs_to_barn;			
	private Door belongs_to_door;
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public int getId() 
	{
		return id;
	}
	
	public int getKey_number() 
	{
		return key_number;
	}

	public void setKey_number(int key_number) 
	{
		this.key_number = key_number;
	}

	public Farmer getBelongs_to_farmer() 
	{
		return belongs_to_farmer;
	}
	
	public void setBelongs_to_farmer(Farmer belongs_to_farmer) 
	{
		this.belongs_to_farmer = belongs_to_farmer;
	}
	
	public Barn getBelongs_to_barn() 
	{
		return belongs_to_barn;
	}
	
	public void setBelongs_to_barn(Barn belongs_to_barn) 
	{
		this.belongs_to_barn = belongs_to_barn;
	}
	
	public Door getBelongs_to_door() 
	{
		return belongs_to_door;
	}
	
	public void setBelongs_to_door(Door belongs_to_door) 
	{
		this.belongs_to_door = belongs_to_door;
	}
	
	//#########################################################################
	// default constructor without paramters
	//#########################################################################
		
	public Key()
	{
		// creates an empty key
		this(1);		
	}
	
	//#########################################################################
	// other constructors without paramters
	//#########################################################################
	
	public Key(int key_number)
	{
		this(key_number, null);
	}
		
	public Key(int key_number, Farmer belongs_to_farmer)
	{
		this(key_number, belongs_to_farmer, null);		
	}
	
	public Key(int key_number, Farmer belongs_to_farmer, Barn belongs_to_barn)
	{
		this(key_number, belongs_to_farmer, belongs_to_barn, null);
	}
	
	//#########################################################################
	// constructor with all attributes
	//#########################################################################
	
	public Key(
		int key_number,	
		Farmer belongs_to_farmer, 
		Barn belongs_to_barn, 
		Door belongs_to_door)
	{
		Key.id = this.getId() + 1;
		this.setKey_number(key_number);
		this.setBelongs_to_farmer(belongs_to_farmer);
		this.setBelongs_to_barn(belongs_to_barn);
		this.setBelongs_to_door(belongs_to_door);
		
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
			"\t\tKey\n"                                                    +
			"\t-----------------------------------------------------------\n" + 	
			"\tid                = " + this.getId()                    + "\n" +
			"\tkey_number        = " + this.getKey_number()            + "\n" +
			"\tbelongs_to_farmer = " + this.getBelongs_to_farmer()     + "\n" +
			"\tbelongs_to_barn   = " + this.getBelongs_to_barn()       + "\n" +
			"\tbelongs_to_door   = " + this.getBelongs_to_door()       + "\n" +
			"\t-----------------------------------------------------------\n";
	}
}
