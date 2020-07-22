package ml.boettger.task_1_Vehicle_racing;

public class Ambulance extends Car 
{
	private boolean b_blue_light;

	public boolean isB_blue_light() 
	{
		return b_blue_light;
	}

	public void setB_blue_light(boolean b_blue_light) 
	{
		this.b_blue_light = b_blue_light;
	}

	// constructors
	
	Ambulance()
	{
		this(0);
	}
	
	Ambulance(double d_actual_position)
	{
		this(d_actual_position, 0);		
	}
	
	Ambulance(double d_actual_position, int i_speed)
	{
		this(d_actual_position, i_speed, 140);
	}
	
	Ambulance(double d_actual_position, int i_speed, int i_max_speed)
	{
		this(d_actual_position, i_speed, i_max_speed, 4);		
	}
	
	Ambulance(double d_actual_position, int i_speed, int i_max_speed, 
		int i_number_of_wheels)
	{
		this(d_actual_position, i_speed, i_max_speed, i_number_of_wheels,
			false);	
	}
	
	Ambulance(double d_actual_position, int i_speed, int i_max_speed, 
		int i_number_of_wheels, boolean b_blue_light)
	{
		super(d_actual_position, i_speed, i_max_speed, i_number_of_wheels);
		this.setB_blue_light(b_blue_light);
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
		return super.toString() +
			"\tb_blue_light       = " + this.isB_blue_light() + "\n"; 
	}
}
