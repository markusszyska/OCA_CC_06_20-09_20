package ml.boettger.task_1_Vehicle_racing;

public class Race_Car extends Car 
{
	Race_Car()
	{
		this(0);
	}
	
	Race_Car(double d_actual_position)
	{
		this(d_actual_position, 0);		
	}
	
	Race_Car(double d_actual_position, int i_speed)
	{
		this(d_actual_position, i_speed, 220);
	}
	
	Race_Car(double d_actual_position, int i_speed, int i_max_speed)
	{
		this(d_actual_position, i_speed, i_max_speed, 4);		
	}
	
	Race_Car(double d_actual_position, int i_speed, int i_max_speed, 
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
