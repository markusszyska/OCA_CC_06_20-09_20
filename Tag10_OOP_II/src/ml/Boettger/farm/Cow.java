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

package ml.Boettger.farm;

import java.io.IOException;
import java.util.Scanner;

public class Cow {
	
	// Attributes
	
	public String s_name;						// name of cow
	public int i_age;							// age of cow
	
	public String s_main_color;
	public String s_color_of_the_spots;			
	public float f_amount_of_milk;				// in liter
	public float f_weight;						// in kg
		
	final float F_MAXWEIGHT = 720.00f;			// max weight constant
	
	//#########################################################################
	// default constructor
	//#########################################################################
	
	// default constructor without parameter	
	public Cow() 
	{
		this("Bertha");
		//s_name = "Bertha";
		//i_age = 20;
		//f_weight = 500.00f;
		//f_amount_of_milk = 66.66f;
		//s_main_color = "white";
		//s_color_of_the_spots = "black";
		
		System.out.println();
		System.out.println("\tDefault constructor of cow:");
		System.out.println();
		
		this.printAllAttributes();
	}	
	
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
	
	//#########################################################################
	// constructor with all attributes
	//#########################################################################
	
	public Cow(
		String s_name, 
		int i_age,
		float f_weight,
		float f_amount_of_milk, 
		String s_main_color, 
		String s_color_of_the_spots)
	{
		this.s_name = s_name;
		this.i_age = i_age;
		this.s_main_color = s_main_color;
		this.s_color_of_the_spots = s_color_of_the_spots;
		this.f_amount_of_milk = f_amount_of_milk;
		this.f_weight = f_weight;
		System.out.println();
		System.out.println("\t... " + this.s_name + " at start of life...");
		System.out.println();
		System.out.println("\tConstructor with all attribues of cow:");
		System.out.println();	
		this.printAllAttributes();
	}	
	
	//
	// PUBLIC functions..., run, eat, milking
	//	
	// ########################################################################
	// 
	public boolean run(float f_distance_in_km)
	//
	//	Running 12 km will be a weight loss of 0.2 kg. if less then 0 Kg 
	//	print an error message.
	//
	//	Returns false if running not possible, otherwise true.
	//
	//#########################################################################
	{	
		float f_weight_loss = f_distance_in_km * 0.2f / 12.0f;
		if (f_weight - f_weight_loss < 0)
		{	
			System.out.println(
				"\t" + this.s_name +
				" cannot run anymore and died, " + 
				"because weight will fall below zero.");
			return false;
		}	
		else
		{
			this.f_weight -= f_weight_loss;
			System.out.println(
				"\tWeight of " + this.s_name + " after running " + 
					f_distance_in_km + " km is " + this.f_weight + " kg.");			
			return true;
		}	
	}
	
	//#########################################################################
	//
	public boolean eat(int i_days)
	//
	//	1 day will increase the weight by 1 kg.
	//
	//	Returns false if eating not possible, otherwise true
	//
	//#########################################################################
	{
		if (this.f_weight + i_days > F_MAXWEIGHT)
		{
			System.out.println();
			System.out.println(
				"\t" + this.s_name + 
				" cannot eat any more and will be slaughtered, " +
				" because weight will exceed " + F_MAXWEIGHT + 
				" kg.");
			return false;
		}	
		else
		{
			this.f_weight += i_days;
			System.out.println(
				"\tWeight of " + this.s_name + " after eating " + i_days + 
					" day(s) is " +	this.f_weight + " kg.");
			return true;
		}	
	}
	
	//#########################################################################
	//
	public float milking(float f_milking_amount)
	//
	//	if milking will be negative return 0.00f no milking, too much
	//  otherwise return the milking amount.
	//
	//#########################################################################
	{
		if (f_amount_of_milk - f_milking_amount < 0.00f)
		{	
			return 0.00f;
		}	
		else
		{	
			f_amount_of_milk -= f_milking_amount;
			System.out.println("\tmilking: " + f_milking_amount +
					" rest of milk is: " + f_amount_of_milk);			
			return f_milking_amount;
		}	
	}	
	
	//#########################################################################
	//
	public void printAllAttributes()
	//
	//#########################################################################
	{
		System.out.println("\tAll Attributes of object cow:");
		System.out.println("\t=============================");	
		System.out.println("\tname = " + this.s_name);
		System.out.println("\tage = " + this.i_age);
		System.out.println("\tmain color = " + this.s_main_color);
		System.out.println("\tcolor of spots = " + this.s_color_of_the_spots);		
		System.out.println("\tamount of milk = " + this.f_amount_of_milk);
		System.out.println("\tweight = " + this.f_weight);		
		System.out.println("\tMAX WEIGHT = " + this.F_MAXWEIGHT);	
		// FarmMain.pauseOrExit();
	}
}