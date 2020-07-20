package ml.Boettger.farm_task_1_to_7;

public class Carrot 
{
	String variety;							// name
	float beet_length;						// cm
	
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
		this.setVariety(variety);
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
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tCarrot\n"                                                    +
			"\t-----------------------------------------------------------\n" + 	
			"\tvariety     = " + this.getVariety()                     + "\n" +
			"\tbeet_length = " + this.getBeet_length()                 + "\n" +
			"\t-----------------------------------------------------------\n";		
	}
}
