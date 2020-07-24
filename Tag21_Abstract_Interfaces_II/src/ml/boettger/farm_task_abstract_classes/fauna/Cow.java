package ml.boettger.farm_task_abstract_classes.fauna;

import ml.boettger.farm_task_abstract_classes.FarmMain;
import ml.boettger.farm_task_abstract_classes.flora.APlants;

public class Cow extends AAnimals
{
	private String s_main_color;
	private String s_color_of_spots;			
	private float f_amount_of_milk;				// in L
	
	// getter and setter
	
	public String getS_main_color() 
	{
		return s_main_color;
	}

	public void setS_main_color(String s_main_color) 
	{
		this.s_main_color = s_main_color;
	}

	public String getS_color_of_spots() 
	{
		return s_color_of_spots;
	}

	public void setS_color_of_spots(String s_color_of_spots) 
	{
		this.s_color_of_spots = s_color_of_spots;
	}

	public float getF_amount_of_milk() 
	{
		return f_amount_of_milk;
	}

	public void setF_amount_of_milk(float f_amount_of_milk) 
	{
		this.f_amount_of_milk = f_amount_of_milk;
	}
	
	//#########################################################################
	// default constructor without paramters
	//#########################################################################
	
	public Cow() 
	{
		this("Bertha");
	}	
	
	//#########################################################################
	// other constructors without paramters
	//#########################################################################
	
	public Cow(String s_name)
	{
		this(s_name, 20);
	}
	
	public Cow(String s_name, int i_age)
	{
		this(s_name, i_age, 500.00f);
	}
	
	public Cow(String s_name, int i_age, float f_weight)
	{
		this(s_name, i_age, f_weight, 66.66f);		
	}
	
	public Cow(String s_name, int i_age, float f_weight, 
		float f_amount_of_milk)
	{
		this(s_name, i_age, f_weight, f_amount_of_milk, "white");
	}	
		
	public Cow(String s_name, int i_age, float f_weight, 
		float f_amount_of_milk,	String s_main_color)
	{
		this(s_name, i_age, f_weight, f_amount_of_milk, s_main_color,
			"black");	
	}
	
	public Cow(String s_name, int i_age, float f_weight, 
			float f_amount_of_milk,	String s_main_color, 
			String s_color_of_spots)
	{
		this(s_name, i_age, f_weight, f_amount_of_milk, s_main_color,
			s_color_of_spots, 1600.00f);	
	}
	
	//#########################################################################
	// constructor with all attributes
	//#########################################################################
	
	public Cow(
		String s_name, 
		int i_age,
		float f_weight,
		float f_amount_of_milk, 
		String s_main_color, 
		String s_color_of_spots,
		float f_selling_price)
	{
		this.setS_name(s_name);
		this.setI_age(i_age);
		this.setS_main_color(s_main_color);
		this.setS_color_of_spots(s_color_of_spots);
		this.setF_amount_of_milk(f_amount_of_milk);
		this.setF_weight(f_weight);
		this.setF_selling_price(f_selling_price);
		
		if (FarmMain.isTESTMODE())
		{
			System.out.println(FarmMain.CTOR + this.toString());
			FarmMain.pause();
		}
	}	

	// public functions

	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			super.toString() +
			"\t-----------------------------------------------------------\n" +	
			"\t\tCow\n"                                                       +
			"\t-----------------------------------------------------------\n" + 	
			"\tf_amount_of_milk = " + this.getF_amount_of_milk()       + "\n" +
			"\ts_main_color = " + this.getS_main_color()               + "\n" +
			"\ts_color_of_spots = " + this.getS_color_of_spots()       + "\n" +
			"\t-----------------------------------------------------------\n";		
	}

	public void makeNoise()
	{
		System.out.println("\tmuuuuuuuuuuuuh");
	}
	
	//#########################################################################
	public void eat(APlants a)
	//
	//#########################################################################
	{
		System.out.println("\t" + this.getS_name() + " eats a " +
			a.getClass().getSimpleName());	
		a.eaten();
	}	
}
