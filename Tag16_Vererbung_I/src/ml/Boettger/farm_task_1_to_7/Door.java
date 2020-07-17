package ml.Boettger.farm_task_1_to_7;

public class Door 
{
	private static int id;					// number of the door
	private Barn belongs_to_barn;			// belongs to with barn
	private Key belongs_to_key;				// key which belongs to the door
	private boolean opened;					// opened or closed
	
	//########################################################################
	//
	// public functions:
	//
	// boolean open_the_door(Key key)		in success return true
	//										if already open or wrong key
	//										return false
	//
	// boolean close_the_door(Key key)		in success return true
	//										if already closed or wrong key	
	//										return false
	//
	//########################################################################
		
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public int getId() 
	{
		return id;
	}

	public Barn getBelongs_to_barn() 
	{
		return belongs_to_barn;
	}

	public void setBelongs_to_barn(Barn belongs_to_barn) 
	{
		this.belongs_to_barn = belongs_to_barn;
	}

	public Key getBelongs_to_key() 
	{
		return belongs_to_key;
	}

	public void setBelongs_to_key(Key belongs_to_key) 
	{
		this.belongs_to_key = belongs_to_key;
	}

	public boolean isOpened() 
	{
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}
	
	//#########################################################################
	// default constructor without paramter
	//#########################################################################
	
	Door()
	{
		this(null);
	}
	
	//#########################################################################
	// other constructors without paramters
	//#########################################################################
	
	Door(Barn belongs_to_barn)
	{
		this(belongs_to_barn, null);		
	}
	
	Door(Barn belongs_to_barn, Key belongs_to_key)
	{
		this(belongs_to_barn, belongs_to_key, false);
	}
	
	Door(Barn belongs_to_barn, Key belongs_to_key, Boolean opened)
	{
		Door.id = this.getId() + 1;
		this.setBelongs_to_barn(belongs_to_barn);
		this.setBelongs_to_key(belongs_to_key);
		this.setOpened(opened);
		
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
			"\t\tDoor\n"                                                      +
			"\t-----------------------------------------------------------\n" + 	
			"\tid              = " + this.getId()                      + "\n" +
			"\tbelongs_to_barn = " + this.getBelongs_to_barn()         + "\n" +
			"\tbelongs_to_key  = " + this.getBelongs_to_key()          + "\n" +
			"\topened          = " + this.isOpened()                   + "\n" +
			"\t-----------------------------------------------------------\n";
	}

	//#########################################################################
	private void print_status_of_the_door()
	//#########################################################################
	{
		if (this.isOpened())
		{
			System.out.println(
				"\tDoor --- The door is opened.");
		}
		else
		{	
			System.out.println(
				"\tDoor --- The door is closed.");
		}	
	}
	
	//#########################################################################
	//
	private void print_attempt(String s, Key key)
	//
	//	attempt to s = open or close the door with key "key"
	//
	//#########################################################################
	{
		System.out.println(
			"\tDoor --- The door belongs to a key with key number: " +
				this.getBelongs_to_key().getKey_number());
		System.out.println(
			"\tDoor --- The door is tried to " + s + " with key: " +
				key.getKey_number());		
	}
		
	//#########################################################################
	//
	private boolean key_and_references_ok(Key key, String s_mode)
	//
	//	test on correct key number and references of the key to the
	//  farmer, to the barn and to the door itself.
	//
	//  Returns true if okay, returns false otherwise.
	//
	//#########################################################################
	{
		if (this.getBelongs_to_key().getKey_number() ==
			key.getKey_number())
		{	
			System.out.println(
				"\tDoor --- Keys have the same number: " + 
					key.getKey_number());
			
			// now test the farmers reference
			if (this.getBelongs_to_key().getBelongs_to_farmer() ==
				key.getBelongs_to_farmer())	
			{
				System.out.println(
					"\tDoor --- Key belongs to the farmer.");	
				
				// now test the barn reference
				if (this.getBelongs_to_barn() ==
					key.getBelongs_to_barn())
				{
					System.out.println(
						"\tDoor --- Key belongs to the barn.");
					
					// now test the door reference
					if (this == key.getBelongs_to_door())
					{
						System.out.println(
							"\tDoor --- Key belongs to the door.");
						System.out.println( 
							"\tDoor --- Now the door is " + s_mode + ".");
						return true;
					}
					else
					{
						System.out.println(
							"\tDoor --- Key does not belong to the door.");
						return false;
					}						
				}
				else
				{
					System.out.println(
						"\tDoor --- Key does not belong to the barn.");
					return false;
				}		
			}
			else
			{
				System.out.println(
					"\tDoor --- Key does not belong to the farmer.");	
				return false;
			}		
		}		
		else
		{
			System.out.println(
				"\tDoor --- The keys have different numbers: ");
			System.out.println(
				"\tDoor --- Key number of the key for the door is " +
					this.getBelongs_to_key().getKey_number() + ".");
			System.out.println(
				"\tDoor --- Key number of the key for " + s_mode + " mode is " +
					key.getKey_number() + ".");			
			System.out.println(
				"\tDoor --- The door cannot be " + s_mode + 
					" with a wrong key.");
			return false;
		}
	}	
	
	//#########################################################################
	public boolean open_the_door(Key key)
	//#########################################################################
	{
		this.print_status_of_the_door();
		if (this.isOpened())
		{
			return false;
		}	
		
		this.print_attempt("open", key);
		
		if (this.key_and_references_ok(key, "opened"))
		{
			this.setOpened(true);
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	//#########################################################################
	public boolean close_the_door(Key key)
	//#########################################################################
	{
		this.print_status_of_the_door();
		if (!this.isOpened())
		{
			return false;
		}		
		
		this.print_attempt("close", key);
		
		if (this.key_and_references_ok(key, "closed"))
		{
			this.setOpened(false);
			return true;
		}
		else
		{
			return false;
		}
	}	
}	
