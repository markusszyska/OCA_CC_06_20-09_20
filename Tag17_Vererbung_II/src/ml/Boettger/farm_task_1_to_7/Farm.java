package ml.Boettger.farm_task_1_to_7;

public class Farm 
{
	private String name;
	private Barn barn;

	//#########################################################################
	// getter and setters
	//#########################################################################
	
	public Barn getBarn() 
	{
		return barn;
	}

	public void setBarn(Barn barn) 
	{
		this.barn = barn;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	//#########################################################################
	// constructors
	//#########################################################################
	
	Farm()
	{
		this("My Farm");		
	}
	
	Farm(String name)
	{
		this(name, new Barn());		
	}
	
	Farm(String name, Barn barn)
	{
		this.setName(name);
		this.setBarn(barn);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}
	
	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tFarm                                                     \n" +
			"\t-----------------------------------------------------------\n" + 	
			"\tname = "   + this.getName()                             + "\n" +
			"\tbarn = \n" + this.getBarn()                             + "\n" +
			"\t-----------------------------------------------------------\n";
	}	
}
