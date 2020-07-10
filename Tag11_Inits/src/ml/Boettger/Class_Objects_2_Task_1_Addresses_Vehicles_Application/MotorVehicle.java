package ml.Boettger.Class_Objects_2_Task_1_Addresses_Vehicles_Application;

class Size {
	float length;		// in m
	float width;		// in m
	float height;		// in m
	
	public float getLength()
	{
		return length;
	}
	
	public void setLength(float length) 
	{
		this.length = length;
	}
	
	public float getWidth() 
	{
		return width;
	}
	
	public void setWidth(float width) 
	{
		this.width = width;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public void setHeight(float height)
	{
		this.height = height;
	}
	
	public String toString() {
		return "Size [length = " + this.getLength() + 
			", width =" + this.getWidth() + 
			", height =" + this.getHeight() + 
			"]";
	}	
}

public class MotorVehicle {
	private Size size;
	private float weight;
	private String car_brand;
	private String end_customer;
	private Address start_address;
	private Address destination_address;
	boolean to_car_dealer;
	
	public Size getSize() 
	{
		return size;
	}
	
	public void setSize(Size size) 
	{
		this.size = size;
	}
	
	public float getWeight() 
	{
		return weight;
	}
	
	public void setWeight(float weight) 
	{
		this.weight = weight;
	}
	
	public String getCar_brand() 
	{
		return car_brand;
	}
	
	public void setCar_brand(String car_brand) 
	{
		this.car_brand = car_brand;
	}
	
	public String getEnd_customer() 
	{
		return end_customer;
	}
	
	public void setEnd_customer(String end_customer) 
	{
		this.end_customer = end_customer;
	}
	
	public Address getStart_address() 
	{
		return start_address;
	}
	
	public void setStart_address(Address start_address) 
	{
		this.start_address = start_address;
	}
	
	public Address getDestination_address() 
	{
		return destination_address;
	}
	
	public void setDestination_address(Address destination_address) 
	{
		this.destination_address = destination_address;
	}
	
	public boolean isTo_car_dealer() 
	{
		return to_car_dealer;
	}
	
	public void setTo_car_dealer(boolean to_car_dealer) 
	{
		this.to_car_dealer = to_car_dealer;
	}

	public String toString() {
		return "MotorVehicle [size=" + this.getSize() + 
			", weight=" + this.getWeight() + 
			", car_brand=" + this.getCar_brand() + 
			", end_customer=" + this.getEnd_customer() + 
			", start_address=" + this.getStart_address() + 
			", destination_address=" + this.getDestination_address() + 
			", to_car_dealer=" + this.isTo_car_dealer() + "]";
	}
}	
	
