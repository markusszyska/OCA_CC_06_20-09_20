package ml.boettger.farm_task_abstract_classes.flora;

public abstract class APlants {
	private String variety;							// name

	// getter and setter
	
	public String getVariety() 
	{
		return variety;
	}

	public void setVariety(String variety) 
	{
		this.variety = variety;
	}

	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tAPlants\n"                                                   +
			"\t-----------------------------------------------------------\n" + 	
			"\tvariety = " + this.getVariety()                     + "\n";
	}
	
	//#########################################################################
	// abstract methods
	//#########################################################################
	public abstract void eaten();
}
