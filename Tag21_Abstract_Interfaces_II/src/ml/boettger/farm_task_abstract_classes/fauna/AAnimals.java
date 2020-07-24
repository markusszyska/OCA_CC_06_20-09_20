package ml.boettger.farm_task_abstract_classes.fauna;

import ml.boettger.farm_task_abstract_classes.flora.APlants;

public abstract class AAnimals 
{
	private String s_name;						// name
	private int i_age;							// age
	private float f_weight;						// in kg
	private float f_selling_price;              // in EURO	

	// getter and setter
	
	public String getS_name() 
	{
		return s_name;
	}

	public void setS_name(String s_name) 
	{
		this.s_name = s_name;
	}

	public int getI_age() 
	{
		return i_age;
	}

	public void setI_age(int i_age) 
	{
		this.i_age = i_age;
	}

	public float getF_weight() 
	{
		return f_weight;
	}

	public void setF_weight(float f_weight) 
	{
		this.f_weight = f_weight;
	}

	public float getF_selling_price() 
	{
		return f_selling_price;
	}

	public void setF_selling_price(float f_selling_price) 
	{
		this.f_selling_price = f_selling_price;
	}
	
	//#########################################################################
	public String toString()
	//
	//	print all data in one short line.
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tAAnimals\n"                                                  +
			"\t-----------------------------------------------------------\n" + 	
		    "\tname = " + this.getS_name()                             + "\n" +
			"\tweight = " + this.getF_weight()                         + "\n" + 
			"\tage = " + this.getI_age()                               + "\n" +
			"\tselling_price = " + this.getF_selling_price()           + "\n";
	}
		
	//#########################################################################
	// abstract methods
	//#########################################################################
	public abstract void makeNoise();
	public abstract void eat(APlants a);
}
