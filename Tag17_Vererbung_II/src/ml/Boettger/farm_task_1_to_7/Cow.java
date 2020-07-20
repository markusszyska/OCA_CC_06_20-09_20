/*
Machen Sie sich mit dem Aufbau einer Klasse und den Packages vertraut.

Bauen Sie den BauernhofSimulator Ihren Package nach.
Erzeugen Sie auf Grundlage der Klasse Schwein eine
Klasse Kuh.

Kuh soll folgende Attribute besitzen.
Name
Hauptfarbe
Fleckenfarbe
Milchmenge
Gewicht

- laufen sollte das Gewicht verringern, aber nicht unter 0 fallen duerfen

- fressen sollte das Gewicht erhoehen, aber nicht ueber ein bestimmtes Gewicht

- Eine Methode für die Milchmenge - melken

- Milchmenge sollte nicht im Negativenbereich abfallen koennen

############################################################################

Meine Interpretation: 

- 12 km ~ Abnahme von 200 g, 
- Mastgewicht: 700 kg, 
- Zunahme durch Fressen pro Tag 1 kg
- 300 ml Restmilch
- 30 L Milch pro Tag

 */

package ml.Boettger.farm_task_1_to_7;

public class Cow 
{
	private String s_name;						// name of cow
	private int i_age;							// age of cow
	
	private String s_main_color;
	private String s_color_of_spots;			
	private float f_amount_of_milk;				// in L
	private float f_weight;						// in kg
		
	private final float F_MAXWEIGHT = 720.00f;	// max weight constant
	private float f_selling_price;              // in EURO

	//#########################################################################
	// getter and setter
	//#########################################################################
	
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

	public float getF_weight() 
	{
		return f_weight;
	}

	public void setF_weight(float f_weight) 
	{
		this.f_weight = f_weight;
	}

	public float getF_MAXWEIGHT() 
	{
		return F_MAXWEIGHT;
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
	
	// public methods...
	
	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		if (this == null)
		{
			return "null";
		}
		return
			"\t-----------------------------------------------------------\n" +	
			"\t\tCow\n"                                                       +
			"\t-----------------------------------------------------------\n" + 	
			"\ts_name               = " + this.getS_name()             + "\n" +
			"\tf_weight             = " + this.getF_weight()           + "\n" +
			"\tf_amount_of_milk     = " + this.getF_amount_of_milk()   + "\n" +
			"\ti_age                = " + this.getI_age()              + "\n" +
			"\ts_main_color         = " + this.getS_main_color()       + "\n" +
			"\ts_color_of_spots     = " + this.getS_color_of_spots()   + "\n" +
			"\tF_MAXWEIGHT          = " + this.getF_MAXWEIGHT()        + "\n" +
			"\tf_selling_price      = " + this.getF_selling_price()    + "\n" +
			"\t-----------------------------------------------------------\n";		
	}
	
	//#########################################################################
	public String short_print_cow()
	//
	//	print main cow data in one short line.
	//
	//#########################################################################
	{
		return "name: "            + this.getS_name()   +
			   " weight: "         + this.getF_weight() + 
			   " age: "            + this.getI_age()    +
			   " selling_price = " + this.getF_selling_price();
	}
	
	//#########################################################################
	//
	public float is_milked(float f_milking_amount, Bucket bucket)
	//
	//	if milking amount will be negative return 0.00f - no milking
	//
	//	if the amount of milk of the cow is <= f_milking_amount,
	//		return the disired milking amount, if no bucket run over.	
	//
	//  otherwise return the milking amount.
	//
	//#########################################################################
	{
		float fill_amount = 0.00f;
		
		System.out.println(
			"\tCow --- amount of milk of the cow is " + 
				this.getF_amount_of_milk() + " L.");
				
		System.out.println(
			"\tCow --- desired amount of milk is " + 
				f_milking_amount + " L.");
		
		System.out.println(
			"\tCow --- filling quantity of bucket is " +
				bucket.getFilling_quantity() + " L.");	
		
		System.out.println(
			"\tCow --- max filling quantity of bucket is " +
					bucket.getMax_filling_quantity() + " L.");	
		
		if (f_milking_amount <= 0.00f)
		{
			System.out.println(
					"\tCow --- desired amount of milk <= 0 - no milking!");			
			return 0.00f;			
		}
				
		if (f_amount_of_milk - f_milking_amount <= 0.00f)
		{
			System.out.println(
				"\tCow --- not enough milk from cow.");
			
			if (bucket.getFilling_quantity() + f_amount_of_milk > 
				bucket.getMax_filling_quantity())
			{				
				System.out.println(
					"\tCow --- bucket will run over.");
				
				fill_amount = bucket.getMax_filling_quantity() -
						bucket.getFilling_quantity();
				
				System.out.println(
					"\tCow --- fill amount returned will be " +
						fill_amount + " L.");	
				
				this.setF_amount_of_milk(
					this.getF_amount_of_milk() - fill_amount);
				
				System.out.println(
					"\tCow --- new amount of milk of the cow is: " +
						this.getF_amount_of_milk());
					
				return fill_amount;
			}
			else
			{
				System.out.println(
					"\tCow --- bucket will not run over.");
				
				// return f_amount_of_milk
				fill_amount = f_amount_of_milk;
				this.setF_amount_of_milk(0.00f);
				
				System.out.println(
					"\tCow --- fill amount returned will be " +
						fill_amount + " L.");	

				System.out.println(
					"\tCow --- new amount of milk of the cow is: 0.00 L.");
				
				return fill_amount;
			}
		}	
		// else enough milk from cow	
		
		else if (bucket.getFilling_quantity() + f_milking_amount > 
			bucket.getMax_filling_quantity())
		{
			System.out.println(
				"\tCow --- bucket will run over.");

			fill_amount = bucket.getMax_filling_quantity() -
					bucket.getFilling_quantity();
			
			System.out.println(
					"\tCow --- fill amount returned will be " +
						fill_amount + " L.");	
			
			this.setF_amount_of_milk(
				this.getF_amount_of_milk() - fill_amount);
			
			System.out.println(
					"\tCow --- new amount of milk of the cow is: " +
						this.getF_amount_of_milk());
			
			return fill_amount;
		}
		else
		{
			System.out.println(
				"\tCow --- bucket will not run over.");

			f_amount_of_milk -= f_milking_amount;

			System.out.println(
				"\tCow --- fill amount returned will be " +
					f_milking_amount + " L.");	
			
			this.setF_amount_of_milk(
				this.getF_amount_of_milk() - f_milking_amount);
			
			System.out.println(
				"\tCow --- new amount of milk of the cow is: " +
					this.getF_amount_of_milk());
			
			return f_milking_amount;
		}	
	}
	
	//#########################################################################
	public void eat(Potato p)
	//
	//#########################################################################
	{
		this.setF_weight(this.getF_weight() + p.getBulb_size());
	}
	
	//#########################################################################
	public void eat(Carrot c)
	//
	//#########################################################################
	{
		this.setF_weight(this.getF_weight() + c.getBeet_length());
	}	
}