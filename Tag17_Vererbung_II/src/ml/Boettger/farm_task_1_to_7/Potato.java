package ml.Boettger.farm_task_1_to_7;

public class Potato 
{
	String variety;						// name
	int bulb_size;						// mm
	
	//#########################################################################
	// getter and setter
	//#########################################################################
	
	public String getVariety() 
	{
		return variety;
	}
	
	public void setVariety(String variety) 
	{
		this.variety = variety;
	}
	
	public int getBulb_size() 
	{
		return bulb_size;
	}
	
	public void setBulb_size(int bulb_size) 
	{
		this.bulb_size = bulb_size;
	}

	//#########################################################################
	// constructors
	//#########################################################################
	
	public Potato()
	{
		this("Annabelle");
	}
	
	public Potato(String variety)
	{
		this(variety, 35);
	}
	
	public Potato(String variety, int bulb_size) {
		this.setVariety(variety);
		this.setBulb_size(bulb_size);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}
	
	// public methods...
	
	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tPotato\n"                                                   +
			"\t-----------------------------------------------------------\n" + 	
			"\tvariety   = " + this.getVariety()                       + "\n" +
			"\tbulb_size = " + this.getBulb_size()                     + "\n" +
			"\t-----------------------------------------------------------\n";		
	}
}	
	
		
		

