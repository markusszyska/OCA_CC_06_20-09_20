package ml.boettger.farm_task_abstract_classes.flora;

import ml.boettger.farm_task_abstract_classes.FarmMain;

public class Carrot extends APlants
{
	private float beet_length;						// cm

	//#########################################################################
	// getter and setter
	//#########################################################################
	public float getBeet_length() 
	{
		return beet_length;
	}

	public void setBeet_length(float beet_length)
	{
		this.beet_length = beet_length;
	}

	//#########################################################################
	// constructors
	//#########################################################################

	public Carrot()
	{
		this("Berlicum");		
	}

	public Carrot(String variety)
	{
		this(variety, 6.0f);
	}

	public Carrot(String variety, float beet_length)
	{
		super.setVariety(variety);
		this.setBeet_length(beet_length);
	
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
		return super.toString() +
			"\t-----------------------------------------------------------\n" +	
			"\t\tCarrot\n"                                                    +
			"\t-----------------------------------------------------------\n" + 	
			"\tbeet_length = " + this.getBeet_length()                 + "\n";
	}
	
	public void eaten()
	{
		System.out.println("\t" + this.getClass().getSimpleName() +
			" was eaten");	
	}			
}

