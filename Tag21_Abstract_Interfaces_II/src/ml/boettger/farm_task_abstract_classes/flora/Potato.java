package ml.boettger.farm_task_abstract_classes.flora;

import ml.boettger.farm_task_abstract_classes.FarmMain;

public class Potato extends APlants 
{
	private int bulb_size;						// mm

	// getter and setter
	
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
		super.setVariety(variety);
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
			super.toString() +
			"\t-----------------------------------------------------------\n" +	
			"\t\tPotato\n"                                                   +
			"\t-----------------------------------------------------------\n" + 	
			"\tbulb_size = " + this.getBulb_size()                     + "\n";
	}
	
	public void eaten()
	{
		System.out.println("\t" + this.getClass().getSimpleName() +
			" was eaten");	
	}			
}	
