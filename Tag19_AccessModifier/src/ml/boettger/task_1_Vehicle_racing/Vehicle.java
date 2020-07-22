package ml.boettger.task_1_Vehicle_racing;

public class Vehicle 
{
	private double d_actual_position;	// in km
	private int i_speed;				// in km/h
	private int i_max_speed;			// max. speed in km
	private int i_number_of_wheels;		
	
	// getter and setter

	public int getI_number_of_wheels() 
	{
		/*
		System.out.println(
			"\tThe number of wheels of the vehicle \"" +
			this.getClass().getSimpleName() + "\" is " + 
			i_number_of_wheels + ".");
		*/
		return i_number_of_wheels;
	}

	public void setI_number_of_wheels(int i_number_of_wheels) 
	{
		if (i_number_of_wheels < 0)
		{	
			System.out.println("\ti_number_of_wheels < 0 - no changes");
		}
		else
		{	
			this.i_number_of_wheels = i_number_of_wheels;
			/*
			System.out.println(
				"\tThe number of wheels of the vehicle \"" +
				this.getClass().getSimpleName() + "\" is set to " + 
				this.getI_number_of_wheels() + ".");
			*/	
		}	
	}

	public int getI_max_speed() 
	{
		/*
		System.out.println(
			"\tThe maximum speed of the vehicle \"" +
			this.getClass().getSimpleName() + "\" is " + 
			i_max_speed + " km/h.");
		*/			
		return i_max_speed;
	}

	public void setI_max_speed(int i_max_speed) 
	{
		if (i_max_speed < 0)
		{
			System.out.println("\ti_number_of_wheels < 0 - no changes");
		}
		else
		{	
			this.i_max_speed = i_max_speed;
		}
	}
	
	public double getD_actual_position() 
	{
		return d_actual_position;
	}
	
	public void setD_actual_position(double d_actual_position) 
	{
		if (d_actual_position < 0)
		{
			System.out.println("\td_actual_position < 0 - no changes");
		}
		else
		{	
			this.d_actual_position = d_actual_position;
		}	
	}
	
	public int getI_speed() 
	{
		return i_speed;
	}
	
	public void setI_speed(int i_speed) 
	{
		if (i_speed < 0)
		{
			System.out.println("\ti_speed < 0 - no changes");
			return;
		}
		if (this.getI_max_speed() == 0)
		{	
			System.out.println("\tmax_speed = 0 - no changes");
			return;
		}			
		if (this.getI_max_speed() < i_speed)
		{
			System.out.println(
				"\tThe speed for the vehicle \"" +
				this.getClass().getSimpleName() +
				"\" should be " + i_speed + " km/h.");
			System.out.println(
				"\tBut it must not exceed the maximum speed of " +
				this.getI_max_speed() + " km/h.");			
			System.out.println(
				"\tTherefore the current speed is set to the maximum speed of "
				+ this.getI_max_speed() + " km/h");
			
			this.setI_speed(this.getI_max_speed());			
		}
		else
		{	
			this.i_speed = i_speed;
			/*
			System.out.println(
				"\tThe speed for of the vehicle \"" +
				this.getClass().getSimpleName() + 
				"\" was set to " +
				this.getI_speed() + " km/h.");
			*/				
		}	
	}

	// constructors
	Vehicle() 
	{
		this(0);		
	}
	
	Vehicle(double d_actual_position)
	{
		this(d_actual_position, 0);
	}
	
	Vehicle(double d_actual_position, int i_speed)
	{
		this(d_actual_position, i_speed, 0);		
	}
	
	Vehicle(double d_actual_position, int i_speed, int i_max_speed)
	{
		this(d_actual_position, i_speed, i_max_speed, 0);
	}
	
	Vehicle(double d_actual_position, int i_speed, int i_max_speed, 
		int i_number_of_wheels)
	{
		this.setD_actual_position(d_actual_position);
		
		// max_speed must be set before speed for correct checking
		this.setI_max_speed(i_max_speed);			
		this.setI_speed(i_speed);
		
		this.setI_number_of_wheels(i_number_of_wheels);

		if (RaceMain.isTESTMODE())
		{
			System.out.println(RaceMain.CTOR + this.toString());
			RaceMain.pause();
		}		
	}
		
	// public methods
	
	//#########################################################################
	//
	public String toString()
	//
	//#########################################################################
	{
		return
			"\t-----------------------------------------------------------\n" +	
			"\t" + this.getClass().getSimpleName() +                     "\n" +         
			"\t-----------------------------------------------------------\n" + 	
			"\td_actual_position  = " + this.getD_actual_position()    + "\n" +
			"\ti_speed            = " + this.getI_speed()              + "\n" +
			"\ti_max_speed        = " + this.getI_max_speed()          + "\n" +
			"\ti_number_of_wheels = " + this.getI_number_of_wheels()   + "\n";
	}

	//#########################################################################
	public double move(double d_minutes)
	//
	//	returns the number of Km driven in d_minutes according this 
	//	formula of the three-rate calculation and updates the actual
	//  position of the vehicle
	//
	//	60 Min.	      - speed (f. e. 220 Km/h)
	//   d_minutes    - x
	//
	//	x = d_minutes * speed / 60
	//
	//#########################################################################
	{
		Double driven_km = 0.00;
		driven_km = d_minutes * (double)this.getI_speed() / 60.00;
		this.setD_actual_position(this.getD_actual_position() +
			driven_km);
		return driven_km;
	}	
}
