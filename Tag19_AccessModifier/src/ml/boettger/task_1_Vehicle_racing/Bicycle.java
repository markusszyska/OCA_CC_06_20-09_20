package ml.boettger.task_1_Vehicle_racing;

public class Bicycle extends Vehicle
{
	// constructors
	
	Bicycle()
	{
		this(0);
	}
	
	Bicycle(double d_actual_position)
	{
		this(d_actual_position, 0);		
	}
	
	Bicycle(double d_actual_position, int i_speed)	
	{
		this(d_actual_position, i_speed, 30);
	}
	
	Bicycle(double d_actual_position, int i_speed, int i_max_speed)
	{
		this(d_actual_position, i_speed, i_max_speed, 2);		
	}
	
	Bicycle(double d_actual_position, int i_speed, int i_max_speed, 
		int i_number_of_wheels)
	{
		super(d_actual_position, i_speed, i_max_speed, i_number_of_wheels);		
	}
	
	//#########################################################################
	//
	//
	//public String toString()
	//
	//#########################################################################
	@Override
	public String toString()
	{
		return super.toString();
	}
}
